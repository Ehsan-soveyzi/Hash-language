import java.util.*;

public class SemanticChecker extends HashBaseListener {

    private final Map<String, String> variables = new HashMap<>();
    private boolean hasErrors = false;

    public boolean hasErrors() {
        return hasErrors;
    }

    private void error(int line, String message) {
        hasErrors = true;
        System.out.println("Semantic Error line " + line + ": " + message);
    }




    @Override
    public void exitForStatement(HashParser.ForStatementContext ctx) {
        String conditionType = inferExpressionType(ctx.condition().expression());
        String updateIdentifier = ctx.update().IDENTIFIER().getText();
        if (!variables.containsKey(updateIdentifier)) {
            error(
                    ctx.start.getLine(),
                    "Variable '" + updateIdentifier + "' is not defined before using in loop update."
            );
        }
        if(!Objects.equals(conditionType, "boole")){
            error(
                    ctx.start.getLine(),
                    "can't assign type " +  conditionType + " as condition, "
                            + "conditions must be a boole type"
            );
        }
    }
    @Override
    public void enterWhileStatement(HashParser.WhileStatementContext ctx) {
        String conditionType = inferExpressionType(ctx.condition().expression());
        if(!Objects.equals(conditionType, "boole")){
            error(
                    ctx.start.getLine(),
                    "can't assign type " +  conditionType + " as condition, "
                            + "conditions must be a boole type"
            );
        }
    }

    @Override
    public void enterSwitchStatements(HashParser.SwitchStatementsContext ctx){
        String switchDtype = variables.get(ctx.IDENTIFIER().getText());
        List<HashParser.CaseStatementsContext> targetTypes = ctx.caseStatements();
        for (HashParser.CaseStatementsContext targetType : targetTypes) {
            if(!inferLiteral(targetType.literal()).equals(switchDtype)){
                error(
                        ctx.start.getLine(),
                        "switch statement choose type " + switchDtype + "! but" +
                                "the provided type in your case has type " +  inferLiteral(targetType.literal()) + "!"
                );
            }
        }
    }

    @Override
    public void enterIfElseStatmentsInLoop(HashParser.IfElseStatmentsInLoopContext ctx) {
        String conditionType = inferExpressionType(ctx.condition().expression());
        if(!Objects.equals(conditionType, "boole")){
            error(
                    ctx.start.getLine(),
                    "can't assign type " +  conditionType + " as condition, "
                            + "conditions must be a boole type"
            );
        }
    }
    @Override
    public void enterIfElseStatments(HashParser.IfElseStatmentsContext ctx){

        String conditionType = inferExpressionType(ctx.condition().expression());
        if(!Objects.equals(conditionType, "boole")){
            error(
                    ctx.start.getLine(),
                    "can't assign type " +  conditionType + " as condition, "
                    + "conditions must be a boole type"
            );
        }

    }

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

    private boolean isCompatible(String declaredType, String expressionType) {
        if (declaredType.equals(expressionType)) {
//            System.out.println(declaredType + " and " + expressionType);
            return true;
        }

        // if there is assigment of a variable ashari to <- adad , just take it easy and let it go.
        if (declaredType.equals("ashari") && expressionType.equals("adad")) {
//            System.out.println(declaredType + " and " + expressionType);
            return true;
        }

        return false;
    }

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