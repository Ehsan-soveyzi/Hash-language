import java.util.*;

public class SemanticChecker extends HashBaseListener {

    private final Map<String, String> variables = new HashMap<>();
    private final Map<String, FunctionInfo> functions = new HashMap<>();

    private final Stack<String> functionReturnTypes = new Stack<>();
    private final Stack<Boolean> functionHasReturn = new Stack<>();
    private final Stack<Map<String, String>> variableSnapshots = new Stack<>();

    private int loopDepth = 0;
    private boolean hasErrors = false;

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

    public boolean hasErrors() {
        return hasErrors;
    }

    private void error(int line, String message) {
        hasErrors = true;
        System.out.println("Semantic Error line " + line + ": " + message);
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
        }
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

    // ------------------------------------------------------------
    // Function definition handling
    // ------------------------------------------------------------
    @Override
    public void enterFunctionStatemnets(HashParser.FunctionStatemnetsContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();

        if (!functions.containsKey(functionName)) {
            registerFunctionSignature(ctx);
        }

        FunctionInfo info = functions.get(functionName);

        if (info == null) {
            return;
        }

        functionReturnTypes.push(info.returnType);
        functionHasReturn.push(false);

        // Save variables before entering function.
        variableSnapshots.push(new HashMap<>(variables));

        // Add function parameters as local variables.
        if (ctx.functionParameters() != null) {
            for (HashParser.FunctionParameterContext param : ctx.functionParameters().functionParameter()) {
                String paramType = param.type().getText();
                String paramName = param.IDENTIFIER().getText();

                variables.put(paramName, paramType);
            }
        }
    }

    @Override
    public void exitFunctionStatemnets(HashParser.FunctionStatemnetsContext ctx) {
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
        inferFunctionCallType(ctx.functionCall());
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

    @Override
    public void enterIfElseStatmentsInLoop(HashParser.IfElseStatmentsInLoopContext ctx) {
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

        if (!isCompatible(declaredType, expressionType)) {
            error(
                    ctx.start.getLine(),
                    "Cannot assign value of type " + expressionType +
                            " to variable '" + variableName +
                            "' of type " + declaredType
            );
        }

        variables.put(variableName, declaredType);
    }

    // ------------------------------------------------------------
    // Type compatibility
    // ------------------------------------------------------------
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

        // ashari can accept adad.
        if (declaredType.equals("ashari") && expressionType.equals("adad")) {
            return true;
        }

        return false;
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
            String rightType = inferMultiplicative(ctx.multiplicativeExpression(i));

            if (!isNumeric(type) || !isNumeric(rightType)) {
                error(ctx.start.getLine(), "Operators + and - need numeric operands.");
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
        String type = inferUnary(ctx.unaryExpression(0));

        for (int i = 1; i < ctx.unaryExpression().size(); i++) {
            String rightType = inferUnary(ctx.unaryExpression(i));

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

    private String inferUnary(HashParser.UnaryExpressionContext ctx) {
        if (ctx.powerExpression() != null) {
            return inferPower(ctx.powerExpression());
        }

        String operator = ctx.getChild(0).getText();
        String operandType = inferUnary(ctx.unaryExpression());

        if (operator.equals("!")) {
            if (!operandType.equals("boole")) {
                error(ctx.start.getLine(), "Operator ! needs boolean operand.");
            }
            return "boole";
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("++") || operator.equals("--")) {
            if (!isNumeric(operandType)) {
                error(ctx.start.getLine(), "Unary operator " + operator + " needs numeric operand.");
            }
            return operandType;
        }

        return operandType;
    }

    private String inferPower(HashParser.PowerExpressionContext ctx) {
        String leftType = inferPostfix(ctx.postfixExpression());

        if (ctx.unaryExpression() != null) {
            String rightType = inferUnary(ctx.unaryExpression());

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
        String type = inferPrimary(ctx.primaryExpression());

        if (ctx.INCREEMENT() != null || ctx.DECREEMENT() != null) {
            if (!isNumeric(type)) {
                error(ctx.start.getLine(), "Postfix ++/-- needs numeric operand.");
            }
        }

        return type;
    }

    private String inferPrimary(HashParser.PrimaryExpressionContext ctx) {
        if (ctx.literal() != null) {
            return inferLiteral(ctx.literal());
        }

        if (ctx.functionCall() != null) {
            String returnType = inferFunctionCallType(ctx.functionCall());

            if (returnType.equals("hich")) {
                error(
                        ctx.start.getLine(),
                        "Function with return type hich cannot be used as a value."
                );
                return "unknown";
            }

            return returnType;
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
}