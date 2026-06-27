import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class SemanticChecker extends HashBaseListener {

    private static class FunctionInfo {
        String returnType;
        List<String> paramTypes;
        List<String> paramNames;

        FunctionInfo(String returnType, List<String> paramTypes, List<String> paramNames) {
            this.returnType = returnType;
            this.paramTypes = paramTypes;
            this.paramNames = paramNames;
        }
    }

    private static class ClassInfo {
        String name;
        Map<String, String> fields = new HashMap<>();
        Map<String, FunctionInfo> methods = new HashMap<>();
        FunctionInfo constructor;

        ClassInfo(String name) {
            this.name = name;
        }
    }

    private final Map<String, String> variables = new HashMap<>();
    private final Map<String, FunctionInfo> functions = new HashMap<>();

    private final Set<String> exceptionTypes = new HashSet<>(Arrays.asList(
            "SefrBood",
            "MahdoodeNadorost",
            "JadvalKhali",
            "GheireMojaz"
    ));

    private final Stack<String> functionReturnTypes = new Stack<>();
    private final Stack<Boolean> functionHasReturn = new Stack<>();
    private final Stack<Map<String, String>> variableSnapshots = new Stack<>();

    private int loopDepth = 0;
    private boolean hasErrors = false;


    private final Map<String, ClassInfo> classes = new HashMap<>();
    private final Stack<String> currentClassStack = new Stack<>();


    public boolean hasErrors() {
        return hasErrors;
    }

    private void error(int line, String message) {
        hasErrors = true;
        System.err.println("Semantic Error line " + line + ": " + message);
    }

    @Override
    public void enterConstructorDeclaration(HashParser.ConstructorDeclarationContext ctx) {
        enterCallableScope("hich", ctx.functionParameters());
    }

    @Override
    public void exitConstructorDeclaration(HashParser.ConstructorDeclarationContext ctx) {
        exitCallableScope(ctx);
    }


    @Override
    public void enterClassMethodDeclaration(HashParser.ClassMethodDeclarationContext ctx) {
        String returnType = ctx.functionTypes().getText();
        enterCallableScope(returnType, ctx.functionParameters());
    }

    @Override
    public void exitClassMethodDeclaration(HashParser.ClassMethodDeclarationContext ctx) {
        exitCallableScope(ctx);
    }

    @Override
    public void enterThrowsException(HashParser.ThrowsExceptionContext ctx) {
        String exceptionName = ctx.exceptionType().CLASS_IDENTIFIER().getText();

        validateExceptionType(ctx.start.getLine(), exceptionName);
    }

    @Override
    public void enterCatchClause(HashParser.CatchClauseContext ctx) {
        String exceptionName = ctx.exceptionType().CLASS_IDENTIFIER().getText();
        String catchVariableName = ctx.IDENTIFIER().getText();

        validateExceptionType(ctx.start.getLine(), exceptionName);

        variableSnapshots.push(new HashMap<>(variables));

        if (variables.containsKey(catchVariableName)) {
            error(
                    ctx.start.getLine(),
                    "Catch variable '" + catchVariableName + "' is already defined."
            );
        }

        variables.put(catchVariableName, exceptionName);
    }

    @Override
    public void exitCatchClause(HashParser.CatchClauseContext ctx) {
        if (variableSnapshots.isEmpty()) {
            return;
        }

        Map<String, String> previousVariables = variableSnapshots.pop();
        variables.clear();
        variables.putAll(previousVariables);
    }

    @Override
    public void enterCustomExceptionStatement(HashParser.CustomExceptionStatementContext ctx) {
        String exceptionName = ctx.CLASS_IDENTIFIER().getText();

        if (!Character.isUpperCase(exceptionName.charAt(0))) {
            error(
                    ctx.start.getLine(),
                    "Custom exception '" + exceptionName + "' must start with an uppercase letter."
            );
            return;
        }

        if(classes.containsKey(exceptionName)) {
            error(ctx.start.getLine(), exceptionName + "' is a className which is already defined.");
            return;
        }

        if (exceptionTypes.contains(exceptionName)) {
            error(
                    ctx.start.getLine(),
                    "Exception type '" + exceptionName + "' is already defined."
            );
            return;
        }

        exceptionTypes.add(exceptionName);
    }

    // ------------------------------------------------------------
    // Register all top-level function signatures before checking bodies.
    // This makes recursion and forward function calls possible.
    // ------------------------------------------------------------
    @Override
    public void enterStartState(HashParser.StartStateContext ctx) {
        for (HashParser.SupportedStatementsContext statement : ctx.supportedStatements()) {
            if (statement.functionStatemnets() != null) {
                registerFunctionSignature(statement.functionStatemnets());
            }

            if (statement.classStatement() != null) {
                registerClassSignature(statement.classStatement());
            }
        }
    }

    // ------------------------------------------------------------
    // Function definition handling
    // ------------------------------------------------------------
    @Override
    public void enterFunctionStatemnets(HashParser.FunctionStatemnetsContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();

        if(Character.isUpperCase(functionName.charAt(0))) {
           error(ctx.start.getLine(), "Function must start with an lowerCase character.");
        }

//        if (!functions.containsKey(functionName)) {
//            registerFunctionSignature(ctx);
//        }

        FunctionInfo info = functions.get(functionName);

        if (info == null) {
            return;
        }

        enterCallableScope(info.returnType, ctx.functionParameters());
    }

    @Override
    public void enterObjectFieldAssignment(HashParser.ObjectFieldAssignmentContext ctx) {
        String objectName = ctx.IDENTIFIER(0).getText();
        String fieldName = ctx.IDENTIFIER(1).getText();

        if (!variables.containsKey(objectName)) {
            error(
                    ctx.start.getLine(),
                    "Object '" + objectName + "' is not defined."
            );
            return;
        }

        String className = variables.get(objectName);

        if (!classes.containsKey(className)) {
            error(
                    ctx.start.getLine(),
                    "'" + objectName + "' is not an object of a known class."
            );
            return;
        }

        ClassInfo classInfo = classes.get(className);

        if (!classInfo.fields.containsKey(fieldName)) {
            error(
                    ctx.start.getLine(),
                    "Field '" + fieldName + "' is not defined in class '" + className + "'."
            );
            return;
        }

        String fieldType = classInfo.fields.get(fieldName);
        String expressionType = inferExpressionType(ctx.expression());

        if (!isCompatible(fieldType, expressionType)) {
            error(
                    ctx.start.getLine(),
                    "Cannot assign value of type " + expressionType +
                            " to field '" + fieldName +
                            "' of object '" + objectName +
                            "' with type " + fieldType + "."
            );
        }
    }

    @Override
    public void enterPrintStatement(HashParser.PrintStatementContext ctx) {
        inferExpressionType(ctx.expression());
    }

    @Override
    public void enterInputStatement(HashParser.InputStatementContext ctx) {
        for(HashParser.InputParametersContext type : ctx.inputParameters()){
            String variableName = type.IDENTIFIER().getText();
            String typeName = type.type().getText();

            variables.put(variableName, typeName);
        }
    }

    @Override
    public void exitFunctionStatemnets(HashParser.FunctionStatemnetsContext ctx) {
        exitCallableScope(ctx);
    }

    @Override
    public void enterInstantiationStatement(HashParser.InstantiationStatementContext ctx) {
        String declaredClassName = ctx.CLASS_IDENTIFIER(0).getText();
        String objectName = ctx.IDENTIFIER().getText();
        String newClassName = ctx.CLASS_IDENTIFIER(1).getText();

        if (!classes.containsKey(declaredClassName)) {
            error(ctx.start.getLine(), "Class '" + declaredClassName + "' is not defined.");
            return;
        }

        if (!classes.containsKey(newClassName)) {
            error(ctx.start.getLine(), "Class '" + newClassName + "' is not defined.");
            return;
        }

        if (!declaredClassName.equals(newClassName)) {
            error(ctx.start.getLine(), "Cannot assign object of class '" + newClassName + "' to variable of class '" + declaredClassName + "'.");
            return;
        }

        ClassInfo classInfo = classes.get(declaredClassName);

        List<HashParser.ExpressionContext> args =
                ctx.argumentList() == null
                        ? Collections.emptyList()
                        : ctx.argumentList().expression();

        if (classInfo.constructor == null) {
            if (!args.isEmpty()) {
                error(ctx.start.getLine(), "Class '" + declaredClassName + "' has no constructor but arguments were provided.");
            }
        } else {
            checkArguments(ctx.start.getLine(), "constructor of class '" + declaredClassName + "'", classInfo.constructor, args);
        }

        variables.put(objectName, declaredClassName);
    }



    @Override
    public void enterClassStatement(HashParser.ClassStatementContext ctx) {
        if(!Character.isUpperCase(ctx.CLASS_IDENTIFIER().getText().charAt(0))) {
            error(ctx.getStart().getLine(), "Class '" + ctx.CLASS_IDENTIFIER().getText() + "' is not a valid class name.");
        }
        currentClassStack.push(ctx.CLASS_IDENTIFIER().getText());
    }

    @Override
    public void exitClassStatement(HashParser.ClassStatementContext ctx) {
        currentClassStack.pop();
    }




    @Override
    public void enterThisAssignment(HashParser.ThisAssignmentContext ctx) {
        if (currentClassStack.isEmpty()) {
            error(ctx.start.getLine(), "'in' can only be used inside a class.");
            return;
        }

        String className = currentClassStack.peek();
        ClassInfo classInfo = classes.get(className);

        String fieldName = ctx.IDENTIFIER().getText();

        if (!classInfo.fields.containsKey(fieldName)) {
            error(ctx.start.getLine(), "Field '" + fieldName + "' is not defined in class '" + className + "'.");
            return;
        }

        String fieldType = classInfo.fields.get(fieldName);
        String expressionType = inferExpressionType(ctx.expression());

        if (!isCompatible(fieldType, expressionType)) {
            error(ctx.start.getLine(), "Cannot assign value of type " + expressionType + " to field '" + fieldName + "' of type " + fieldType + ".");
        }
    }


    // ------------------------------------------------------------
    // Return checking
    // ------------------------------------------------------------

    @Override
    public void enterReturnStatement(HashParser.ReturnStatementContext ctx) {
        if (functionReturnTypes.isEmpty()) {
            error(
                    ctx.start.getLine(),
                    "Return statement 'bede' must be inside a function."
            );
            return;
        }

        String expectedReturnType = functionReturnTypes.peek();

        functionHasReturn.pop();
        functionHasReturn.push(true);

        boolean hasExpression = ctx.expression() != null;

        if (expectedReturnType.equals("hich")) {
            if (hasExpression) {
                error(
                        ctx.start.getLine(),
                        "Function with return type hich must not return a value."
                );
            }
            return;
        }

        if (!hasExpression) {
            error(
                    ctx.start.getLine(),
                    "Function with return type " + expectedReturnType + " must return a value."
            );
            return;
        }

        String actualReturnType = inferExpressionType(ctx.expression());

        if (!isCompatible(expectedReturnType, actualReturnType)) {
            error(
                    ctx.start.getLine(),
                    "Cannot return value of type " + actualReturnType +
                            " from function with return type " + expectedReturnType + "."
            );
        }
    }

    // ------------------------------------------------------------
    // Function call checking
    // ------------------------------------------------------------
    @Override
    public void enterFunctionCallStatement(HashParser.FunctionCallStatementContext ctx) {
        if (ctx.functionCall() != null) {
            inferFunctionCallType(ctx.functionCall());
        }

        if (ctx.methodCall() != null) {
            inferMethodCallType(ctx.methodCall());
        }
    }


    // ------------------------------------------------------------
    // Loop and goTo checking
    // ------------------------------------------------------------
    @Override
    public void enterForStatement(HashParser.ForStatementContext ctx) {
        loopDepth++;
    }

    @Override
    public void exitForStatement(HashParser.ForStatementContext ctx) {
        String conditionType = inferExpressionType(ctx.condition().expression());

        if (!Objects.equals(conditionType, "boole")) {
            error(
                    ctx.start.getLine(),
                    "can't assign type " + conditionType + " as condition, conditions must be a boole type"
            );
        }

        loopDepth--;
    }

    @Override
    public void enterWhileStatement(HashParser.WhileStatementContext ctx) {
        loopDepth++;

        String conditionType = inferExpressionType(ctx.condition().expression());

        if (!Objects.equals(conditionType, "boole")) {
            error(
                    ctx.start.getLine(),
                    "can't assign type " + conditionType + " as condition, conditions must be a boole type"
            );
        }
    }

    @Override
    public void exitWhileStatement(HashParser.WhileStatementContext ctx) {
        loopDepth--;
    }

    @Override
    public void enterGoToStatements(HashParser.GoToStatementsContext ctx) {
        if (loopDepth == 0) {
            error(
                    ctx.start.getLine(),
                    "shekan/edame must only be used inside loops."
            );
        }
    }

    // ------------------------------------------------------------
    // Update / defined assignment checking
    // ------------------------------------------------------------
    @Override
    public void enterUpdate(HashParser.UpdateContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        if (!variables.containsKey(identifier)) {
            error(
                    ctx.start.getLine(),
                    "the variable '" + identifier + "' was not defined!"
            );
            return;
        }

        String variableType = variables.get(identifier);
        String expressionType = inferExpressionType(ctx.expression());

        if (!isCompatible(variableType, expressionType)) {
            error(
                    ctx.start.getLine(),
                    "the variable '" + identifier + "' has type " + variableType +
                            ", but you assigned value of type " + expressionType + "!"
            );
        }
    }

    // ------------------------------------------------------------
    // Condition checking
    // ------------------------------------------------------------
    @Override
    public void enterIfElseStatments(HashParser.IfElseStatmentsContext ctx) {
        String conditionType = inferExpressionType(ctx.condition().expression());

        if (!Objects.equals(conditionType, "boole")) {
            error(
                    ctx.start.getLine(),
                    "can't assign type " + conditionType + " as condition, conditions must be a boole type"
            );
        }
    }

    // ------------------------------------------------------------
    // Switch checking
    // ------------------------------------------------------------
    @Override
    public void enterSwitchStatements(HashParser.SwitchStatementsContext ctx) {
        String switchIdentifier = ctx.IDENTIFIER().getText();

        if (!variables.containsKey(switchIdentifier)) {
            error(
                    ctx.start.getLine(),
                    "switch variable '" + switchIdentifier + "' was not defined!"
            );
            return;
        }

        String switchType = variables.get(switchIdentifier);

        for (HashParser.CaseStatementsContext caseStatement : ctx.caseStatements()) {
            String caseType = inferLiteral(caseStatement.literal());

            if (!isCompatible(switchType, caseType)) {
                error(
                        caseStatement.start.getLine(),
                        "switch statement chooses type " + switchType +
                                ", but case has type " + caseType + "."
                );
            }
        }
    }

    // ------------------------------------------------------------
    // Assignment checking
    // ------------------------------------------------------------
    @Override
    public void enterAssignmentsStatemetns(HashParser.AssignmentsStatemetnsContext ctx) {
        String declaredType = ctx.type().getText();
        String variableName = ctx.IDENTIFIER().getText();

        String expressionType = inferExpressionType(ctx.expression());

        if(Character.isUpperCase(variableName.charAt(0))) {
            error(
                    ctx.start.getLine(),
                    "variables must start with lower case characters!"
            );
        }
        if (!isCompatible(declaredType, expressionType)) {
            error(
                    ctx.start.getLine(),
                    "Cannot assign value of type " + expressionType +
                            " to variable '" + variableName +
                            "' of type " + declaredType
            );
        }
        if (exceptionTypes.contains(variableName)) {
            error(
                    ctx.start.getLine(),
                    "Cannot use exception type '" + variableName + "' as a variable name."
            );
            return;
        }

        variables.put(variableName, declaredType);
    }

    @Override
    public void enterDefineVariableWithNoAssignmentStatement(HashParser.DefineVariableWithNoAssignmentStatementContext ctx){
        String declaredType = ctx.type().getText();
        String variableName = ctx.IDENTIFIER().getText();
        if(Character.isUpperCase(variableName.charAt(0))) {
            error(ctx.start.getLine(), "variables must start with lower case characters!");
        }
        variables.put(variableName, declaredType);
    }

    // ------------------------------------------------------------
    // Type compatibility
    // ------------------------------------------------------------
    private String inferMethodCallType(HashParser.MethodCallContext ctx) {
        String objectName = ctx.IDENTIFIER(0).getText();
        String methodName = ctx.IDENTIFIER(1).getText();

        if (!variables.containsKey(objectName)) {
            error(ctx.start.getLine(), "Object '" + objectName + "' is not defined.");
            return "unknown";
        }

        String className = variables.get(objectName);

        if (!classes.containsKey(className)) {
            error(ctx.start.getLine(), "'" + objectName + "' is not an object of a known class.");
            return "unknown";
        }

        ClassInfo classInfo = classes.get(className);

        if (!classInfo.methods.containsKey(methodName)) {
            error(ctx.start.getLine(), "Method '" + methodName + "' is not defined in class '" + className + "'.");
            return "unknown";
        }

        FunctionInfo methodInfo = classInfo.methods.get(methodName);

        List<HashParser.ExpressionContext> args =
                ctx.argumentList() == null
                        ? Collections.emptyList()
                        : ctx.argumentList().expression();

        checkArguments(ctx.start.getLine(), "method '" + methodName + "'", methodInfo, args);

        return methodInfo.returnType;
    }

    private String inferFunctionCallType(HashParser.FunctionCallContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();

        if (!functions.containsKey(functionName)) {
            error(
                    ctx.start.getLine(),
                    "Function '" + functionName + "' is not defined."
            );
            return "unknown";
        }

        FunctionInfo info = functions.get(functionName);

        List<HashParser.ExpressionContext> args =
                ctx.argumentList() == null
                        ? Collections.emptyList()
                        : ctx.argumentList().expression();

        if (args.size() != info.paramTypes.size()) {
            error(
                    ctx.start.getLine(),
                    "Function '" + functionName + "' expects " + info.paramTypes.size() +
                            " arguments, but got " + args.size() + "."
            );
            return info.returnType;
        }

        for (int i = 0; i < args.size(); i++) {
            String expectedType = info.paramTypes.get(i);
            String actualType = inferExpressionType(args.get(i));

            if (!isCompatible(expectedType, actualType)) {
                error(
                        args.get(i).start.getLine(),
                        "Argument " + (i + 1) + " of function '" + functionName +
                                "' must be " + expectedType +
                                ", but got " + actualType + "."
                );
            }
        }

        return info.returnType;
    }

    private boolean isCompatible(String declaredType, String expressionType) {
        if (declaredType == null || expressionType == null) {
            return false;
        }

        if (declaredType.equals("unknown") || expressionType.equals("unknown")) {
            return false;
        }

        if (declaredType.equals(expressionType)) {
            return true;
        }

        if(expressionType.equals("khali")){ // means the khali value can be assigned to any proper types
            return true;
        }

        // ashari can accept adad.
        return (declaredType.equals("ashari") && expressionType.equals("adad"));
    }

// ------------------------------------------------------------
// Expression type inference
// ------------------------------------------------------------
    private String inferExpressionType(HashParser.ExpressionContext ctx) {
        return inferLogicalOr(ctx.logicalOrExpression());
    }

    private String inferLogicalOr(HashParser.LogicalOrExpressionContext ctx) {
        String type = inferLogicalAnd(ctx.logicalAndExpression(0));

        for (int i = 1; i < ctx.logicalAndExpression().size(); i++) {
            String rightType = inferLogicalAnd(ctx.logicalAndExpression(i));

            if (!type.equals("boole") || !rightType.equals("boole")) {
                error(ctx.start.getLine(), "Operator || needs boolean operands.");
            }

            type = "boole";
        }

        return type;
    }

    private String inferLogicalAnd(HashParser.LogicalAndExpressionContext ctx) {
        String type = inferEquality(ctx.equalityExpression(0));

        for (int i = 1; i < ctx.equalityExpression().size(); i++) {
            String rightType = inferEquality(ctx.equalityExpression(i));

            if (!type.equals("boole") || !rightType.equals("boole")) {
                error(ctx.start.getLine(), "Operator && needs boolean operands.");
            }

            type = "boole";
        }

        return type;
    }

    private String inferEquality(HashParser.EqualityExpressionContext ctx) {
        String leftType = inferComparitional(ctx.comparitioanlExpression(0));

        if (ctx.comparitioanlExpression().size() > 1) {
            String rightType = inferComparitional(ctx.comparitioanlExpression(1));

            if (!leftType.equals(rightType)) {
                error(ctx.start.getLine(), "Equality comparison needs same types.");
            }

            return "boole";
        }

        return leftType;
    }

    private String inferComparitional(HashParser.ComparitioanlExpressionContext ctx) {
        String leftType = inferAdditive(ctx.additiveExpression(0));

        if (ctx.additiveExpression().size() > 1) {
            String rightType = inferAdditive(ctx.additiveExpression(1));

            if (!isNumeric(leftType) || !isNumeric(rightType)) {
                error(ctx.start.getLine(), "Comparitional operators need numeric operands.");
            }

            return "boole";
        }

        return leftType;
    }

    private String inferAdditive(HashParser.AdditiveExpressionContext ctx) {
        String type = inferMultiplicative(ctx.multiplicativeExpression(0));

        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            String operator = ctx.getChild(2 * i - 1).getText();
            String rightType = inferMultiplicative(ctx.multiplicativeExpression(i));

            // string concatenation: "hello" + name
            if (operator.equals("+") && (type.equals("matn") || rightType.equals("matn"))) {
                type = "matn";
                continue;
            }

            if (!isNumeric(type) || !isNumeric(rightType)) {
                error(ctx.start.getLine(), "Operators + and - need numeric operands, except + with matn.");
                return "unknown";
            }

            if (type.equals("ashari") || rightType.equals("ashari")) {
                type = "ashari";
            } else {
                type = "adad";
            }
        }

        return type;
    }

    private String inferMultiplicative(HashParser.MultiplicativeExpressionContext ctx) {
        String type = inferPower(ctx.powerExpression(0));

        for (int i = 1; i < ctx.powerExpression().size(); i++) {
            String rightType = inferPower(ctx.powerExpression(i));

            if (!isNumeric(type) || !isNumeric(rightType)) {
                error(ctx.start.getLine(), "Operators *, / and % need numeric operands.");
                return "unknown";
            }

            if (type.equals("ashari") || rightType.equals("ashari")) {
                type = "ashari";
            } else {
                type = "adad";
            }
        }

        return type;
    }

    private String inferPower(HashParser.PowerExpressionContext ctx) {
        String leftType = inferPostfix(ctx.postfixExpression());

        // New grammar:
        // powerExpression : postfixExpression (POWER powerExpression)?
        // so power is right-associative.
        if (ctx.powerExpression() != null) {
            String rightType = inferPower(ctx.powerExpression());

            if (!isNumeric(leftType) || !isNumeric(rightType)) {
                error(ctx.start.getLine(), "Operator ** needs numeric operands.");
                return "unknown";
            }

            if (leftType.equals("ashari") || rightType.equals("ashari")) {
                return "ashari";
            }

            return "adad";
        }

        return leftType;
    }

    private String inferPostfix(HashParser.PostfixExpressionContext ctx) {
        String type = inferPrefix(ctx.prefixExpression());

        if (ctx.INCREEMENT() != null || ctx.DECREEMENT() != null) {
            if (!isNumeric(type)) {
                error(ctx.start.getLine(), "Postfix ++/-- needs numeric operand.");
            }
        }

        return type;
    }

    private String inferPrefix(HashParser.PrefixExpressionContext ctx) {
        if (ctx.accessAndCallsExpression() != null) {
            return inferAccessAndCalls(ctx.accessAndCallsExpression());
        }

        String operator = ctx.getChild(0).getText();
        String operandType = inferPrefix(ctx.prefixExpression());

        if (operator.equals("!")) {
            if (!operandType.equals("boole")) {
                error(ctx.start.getLine(), "Operator ! needs boolean operand.");
            }
            return "boole";
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("++") || operator.equals("--")) {
            if (!isNumeric(operandType)) {
                error(ctx.start.getLine(), "Prefix operator " + operator + " needs numeric operand.");
            }
            return operandType;
        }

        return operandType;
    }

    private String inferAccessAndCalls(HashParser.AccessAndCallsExpressionContext ctx) {
        if (ctx.methodCall() != null) {
            String returnType = inferMethodCallType(ctx.methodCall());

            if (returnType.equals("hich")) {
                error(ctx.start.getLine(), "Method with return type hich cannot be used as a value.");
                return "unknown";
            }

            return returnType;
        }

        if (ctx.functionCall() != null) {
            String returnType = inferFunctionCallType(ctx.functionCall());

            if (returnType.equals("hich")) {
                error(ctx.start.getLine(), "Function with return type hich cannot be used as a value.");
                return "unknown";
            }

            return returnType;
        }

        if (ctx.fieldAccess() != null) {
            return inferFieldAccessType(ctx.fieldAccess());
        }

        if (ctx.thisFieldAccess() != null) {
            return inferThisFieldAccessType(ctx.thisFieldAccess());
        }

        if (ctx.primaryExpression() != null) {
            return inferPrimary(ctx.primaryExpression());
        }

        return "unknown";
    }

    private String inferPrimary(HashParser.PrimaryExpressionContext ctx) {
        if (ctx.literal() != null) {
            return inferLiteral(ctx.literal());
        }

        if (ctx.IDENTIFIER() != null) {
            String variableName = ctx.IDENTIFIER().getText();

            if (!variables.containsKey(variableName)) {
                error(ctx.start.getLine(), "Variable '" + variableName + "' is not defined.");
                return "unknown";
            }

            return variables.get(variableName);
        }

        if (ctx.expression() != null) {
            return inferExpressionType(ctx.expression());
        }

        return "unknown";
    }

    private String inferLiteral(HashParser.LiteralContext ctx) {
        if (ctx.INT_LITERAL() != null) {
            return "adad";
        }

        if (ctx.FLOAT_LITERAL() != null) {
            return "ashari";
        }

        if (ctx.STRING_LITERAL() != null) {
            return "matn";
        }

        if (ctx.CHAR_LITERAL() != null) {
            return "harf";
        }

        if (ctx.booleanLiteral() != null) {
            return "boole";
        }

        if (ctx.NULL() != null) {
            return "khali";
        }

        return "unknown";
    }

    private boolean isNumeric(String type) {
        return type.equals("adad") || type.equals("ashari");
    }

    private void validateExceptionType(int line, String exceptionName) {
        if (exceptionName == null || exceptionName.isEmpty()) {
            error(line, "Exception type is empty.");
            return;
        }

        if (!Character.isUpperCase(exceptionName.charAt(0))) {
            error(
                    line,
                    "Exception type '" + exceptionName + "' must start with an uppercase letter."
            );
        }

        if (!exceptionTypes.contains(exceptionName)) {
            error(
                    line,
                    "Exception type '" + exceptionName + "' is not defined."
            );
        }
    }

    private void enterCallableScope(String returnType, HashParser.FunctionParametersContext params) {
        functionReturnTypes.push(returnType);
        functionHasReturn.push(false);

        variableSnapshots.push(new HashMap<>(variables));

        if (params != null) {
            Set<String> seenParams = new HashSet<>();

            for (HashParser.FunctionParameterContext param : params.functionParameter()) {
                String paramType = param.type().getText();
                String paramName = param.IDENTIFIER().getText();

                if (seenParams.contains(paramName)) {
                    error(
                            param.start.getLine(),
                            "Parameter '" + paramName + "' is already defined in this callable."
                    );
                }

                seenParams.add(paramName);
                variables.put(paramName, paramType);
            }
        }
    }

    private void exitCallableScope(ParserRuleContext ctx) {
        if (functionReturnTypes.isEmpty() || functionHasReturn.isEmpty() || variableSnapshots.isEmpty()) {
            return;
        }

        String returnType = functionReturnTypes.pop();
        boolean hasReturn = functionHasReturn.pop();

        if (!returnType.equals("hich") && !hasReturn) {
            error(
                    ctx.start.getLine(),
                    "Function with return type " + returnType + " must have a return statement."
            );
        }

        Map<String, String> previousVariables = variableSnapshots.pop();
        variables.clear();
        variables.putAll(previousVariables);
    }

    private String inferThisFieldAccessType(HashParser.ThisFieldAccessContext ctx) {
        if (currentClassStack.isEmpty()) {
            error(ctx.start.getLine(), "'in' can only be used inside a class.");
            return "unknown";
        }

        String className = currentClassStack.peek();
        ClassInfo classInfo = classes.get(className);

        if (classInfo == null) {
            error(ctx.start.getLine(), "Current class '" + className + "' is not registered.");
            return "unknown";
        }

        String fieldName = ctx.IDENTIFIER().getText();

        if (!classInfo.fields.containsKey(fieldName)) {
            error(ctx.start.getLine(), "Field '" + fieldName + "' is not defined in class '" + className + "'.");
            return "unknown";
        }

        return classInfo.fields.get(fieldName);
    }

    private String inferFieldAccessType(HashParser.FieldAccessContext ctx) {
        String objectName = ctx.IDENTIFIER(0).getText();
        String fieldName = ctx.IDENTIFIER(1).getText();

        if (!variables.containsKey(objectName)) {
            error(ctx.start.getLine(), "Object '" + objectName + "' is not defined.");
            return "unknown";
        }

        String className = variables.get(objectName);

        if (!classes.containsKey(className)) {
            error(ctx.start.getLine(), "'" + objectName + "' is not an object of a known class.");
            return "unknown";
        }

        ClassInfo classInfo = classes.get(className);

        if (!classInfo.fields.containsKey(fieldName)) {
            error(ctx.start.getLine(), "Field '" + fieldName + "' is not defined in class '" + className + "'.");
            return "unknown";
        }

        return classInfo.fields.get(fieldName);
    }
    private FunctionInfo buildFunctionInfo(String returnType, HashParser.FunctionParametersContext params) {
        List<String> paramTypes = new ArrayList<>();
        List<String> paramNames = new ArrayList<>();

        if (params != null) {
            for (HashParser.FunctionParameterContext param : params.functionParameter()) {
                paramTypes.add(param.type().getText());
                paramNames.add(param.IDENTIFIER().getText());
            }
        }

        return new FunctionInfo(returnType, paramTypes, paramNames);
    }

    private void checkArguments(int line, String callableName, FunctionInfo info, List<HashParser.ExpressionContext> args) {
        if (args.size() != info.paramTypes.size()) {
            error(
                    line,
                    callableName + " expects " + info.paramTypes.size() +
                            " arguments, but got " + args.size() + "."
            );
            return;
        }

        for (int i = 0; i < args.size(); i++) {
            String expectedType = info.paramTypes.get(i);
            String actualType = inferExpressionType(args.get(i));

            if (!isCompatible(expectedType, actualType)) {
                error(
                        args.get(i).start.getLine(),
                        "Argument " + (i + 1) + " of " + callableName +
                                " must be " + expectedType + ", but got " + actualType + "."
                );
            }
        }
    }

    private void registerClassSignature(HashParser.ClassStatementContext ctx) {
        String className = ctx.CLASS_IDENTIFIER().getText();

        if (classes.containsKey(className)) {
            error(ctx.start.getLine(), "Class '" + className + "' is already defined.");
            return;
        }

        if(exceptionTypes.contains(className)) {
            error(ctx.start.getLine(), "Class Exception'" + className + "' is already defined.");
            return;
        }

        ClassInfo classInfo = new ClassInfo(className);

        for (HashParser.ClassMemberContext member : ctx.classMember()) {
            if (member.fieldDeclaration() != null) {
                String fieldType = member.fieldDeclaration().type().getText();
                String fieldName = member.fieldDeclaration().IDENTIFIER().getText();

                if(Character.isUpperCase(fieldName.charAt(0))) {
                    error(ctx.start.getLine(), "Fields must start with a lowerCase character.");
                }

                if (classInfo.fields.containsKey(fieldName)) {
                    error(member.start.getLine(), "Field '" + fieldName + "' is already defined in class '" + className + "'.");
                }

                classInfo.fields.put(fieldName, fieldType);
            }

            if (member.classMethodDeclaration() != null) {
                HashParser.ClassMethodDeclarationContext method = member.classMethodDeclaration();

                String methodName = method.IDENTIFIER().getText();
                String returnType = method.functionTypes().getText();

                if(Character.isUpperCase(methodName.charAt(0))) {
                    error(ctx.start.getLine(), "methods must start with a lowerCase character.");
                }

                FunctionInfo methodInfo = buildFunctionInfo(returnType, method.functionParameters());

                if (classInfo.methods.containsKey(methodName)) {
                    error(method.start.getLine(), "Method '" + methodName + "' is already defined in class '" + className + "'.");
                }

                classInfo.methods.put(methodName, methodInfo);
            }

            if (member.constructorDeclaration() != null) {
                HashParser.ConstructorDeclarationContext constructor = member.constructorDeclaration();

                String constructorName = constructor.CLASS_IDENTIFIER().getText();

                if (!constructorName.equals(className)) {
                    error(constructor.start.getLine(), "Constructor name '" + constructorName + "' must be same as class name '" + className + "'.");
                }

                classInfo.constructor = buildFunctionInfo("hich", constructor.functionParameters());
            }
        }

        classes.put(className, classInfo);
    }

    private void registerFunctionSignature(HashParser.FunctionStatemnetsContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        String returnType = ctx.functionTypes().getText();

        if (functions.containsKey(functionName)) {
            error(
                    ctx.start.getLine(),
                    "Function '" + functionName + "' is already defined."
            );
            return;
        }

        List<String> paramTypes = new ArrayList<>();
        List<String> paramNames = new ArrayList<>();
        Set<String> seenParams = new HashSet<>();

        if (ctx.functionParameters() != null) {
            for (HashParser.FunctionParameterContext param : ctx.functionParameters().functionParameter()) {
                String paramType = param.type().getText();
                String paramName = param.IDENTIFIER().getText();

                if(Character.isUpperCase(paramName.charAt(0))) {
                    error(ctx.start.getLine(), "parameters must start with a lowerCase character.");
                }

                if (seenParams.contains(paramName)) {
                    error(
                            param.start.getLine(),
                            "Parameter '" + paramName + "' is already defined in function '" + functionName + "'."
                    );
                }

                seenParams.add(paramName);
                paramTypes.add(paramType);
                paramNames.add(paramName);
            }
        }

        functions.put(functionName, new FunctionInfo(returnType, paramTypes, paramNames));
    }
}
