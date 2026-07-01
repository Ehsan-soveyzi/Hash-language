import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class PromelaTranslator extends HashBaseVisitor<String> {

    private final StringBuilder globalDecls = new StringBuilder();
    private final Set<String> declaredGlobals = new HashSet<>();
    private final Stack<String> tryLabelStack = new Stack<>();

    private int loopCounter = 0;
    private int tryIdx = 0;

    private final Stack<String> continueLabelStack = new Stack<>();

    public PromelaTranslator(){
        tryLabelStack.push("endReached_label");
    }

    public String translate(HashParser.StartStateContext tree) {
        return visitStartState(tree);
    }

    @Override
    public String visitStartState(HashParser.StartStateContext ctx) {
        declareGlobalWithInit("divByZero");
        declareGlobalWithInit("outOfBound");
        declareGlobalWithInit("nullPointer");
        declareGlobalWithInit("noPermission");
        declareGlobalWithInit("endReached");

        StringBuilder body = new StringBuilder();

        for (HashParser.SupportedStatementsContext st : ctx.supportedStatements()) {
            String code = visit(st);
            if (code != null && !code.isBlank()) {
                body.append(code);
            }
        }

        return "/* Generated Promela model from Hash */\n\n" +
                globalDecls + "\n" +
                "active proctype main() {\n" +
                indent(body.toString()) +
                "    endReached = true;\n" +
                "    endReached_label:\n" +
                "    skip;\n" +
                "}\n" + ltlMethods();
    }

    @Override
    public String visitSupportedStatements(HashParser.SupportedStatementsContext ctx) {
        if (ctx.assignmentsStatemetns() != null) {
            return visit(ctx.assignmentsStatemetns());
        }

        if (ctx.defineVariableWithNoAssignmentStatement() != null) {
            return visit(ctx.defineVariableWithNoAssignmentStatement());
        }

        if (ctx.definedAssignment() != null) {
            return visit(ctx.definedAssignment());
        }

        if (ctx.ifElseStatments() != null) {
            return visit(ctx.ifElseStatments());
        }

        if (ctx.loopStatements() != null) {
            return visit(ctx.loopStatements());
        }

        if (ctx.goToStatements() != null) {
            return visit(ctx.goToStatements());
        }

        if (ctx.exceptionStatements() != null) {
            return visit(ctx.exceptionStatements());
        }

        if (ctx.throwsException() != null) {
            return visit(ctx.throwsException());
        }

        throw new UnsupportedOperationException(
                "Unsupported statement in Project2 Promela subset: " + ctx.getText()
        );
    }

    @Override
    public String visitAssignmentsStatemetns(HashParser.AssignmentsStatemetnsContext ctx) {
        String type = mapType(ctx.type().getText());
        String name = ctx.IDENTIFIER().getText();
        String op = ctx.ASSIGNMENT().getText();
        String expr = translateExpr(ctx.expression());

        declareGlobal(type, name);

        String checks = generateDivisionChecks(ctx.expression());
        return checks + assignmentLine(name, op, expr);
    }

    @Override
    public String visitDefineVariableWithNoAssignmentStatement(
            HashParser.DefineVariableWithNoAssignmentStatementContext ctx
    ) {
        String type = mapType(ctx.type().getText());
        String name = ctx.IDENTIFIER().getText();

        declareGlobal(type, name);

        return "";
    }

    @Override
    public String visitDefinedAssignment(HashParser.DefinedAssignmentContext ctx) {
        return visit(ctx.update()) + ";\n";
    }

    @Override
    public String visitUpdate(HashParser.UpdateContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String op = ctx.ASSIGNMENT().getText();
        String expr = translateExpr(ctx.expression());

        String checks = generateDivisionChecks(ctx.expression());
        return checks + assignmentLineWithoutSemicolon(name, op, expr) + ";\n";
    }

    @Override
    public String visitIfElseStatments(HashParser.IfElseStatmentsContext ctx) {
        String checks = generateDivisionChecks(ctx.condition());
        String condition = translateExpr(ctx.condition());

        List<HashParser.SupportedStatementsContext> thenStatements = new ArrayList<>();
        List<HashParser.SupportedStatementsContext> elseStatements = new ArrayList<>();

        splitIfChildrenSupported(ctx, thenStatements, elseStatements);

        String thenBlock = renderBlock(thenStatements);
        String elseBlock = renderBlock(elseStatements);

        return checks +
                "if\n" +
                ":: (" + condition + ") ->\n" +
                indent(thenBlock) +
                ":: else ->\n" +
                indent(elseBlock) +
                "fi;\n";
    }


    @Override
    public String visitLoopStatements(HashParser.LoopStatementsContext ctx) {
        if (ctx.whileStatement() != null) {
            return visit(ctx.whileStatement());
        }

        if (ctx.forStatement() != null) {
            return visit(ctx.forStatement());
        }

        throw new UnsupportedOperationException("Unknown loop statement: " + ctx.getText());
    }

    @Override
    public String visitWhileStatement(HashParser.WhileStatementContext ctx) {
        int id = ++loopCounter;

        String startLabel = "loop_start_" + id;
        String inLoopLabel = "inLoop_" + id;
        String exitLabel = "exitLoop_" + id;

        continueLabelStack.push(startLabel);

        String checks = generateDivisionChecks(ctx.condition());
        String condition = translateExpr(ctx.condition());
        String body = renderBlock(ctx.supportedStatements());

        continueLabelStack.pop();

        return checks +
                startLabel + ":\n" +
                "do\n" +
                ":: (" + condition + ") ->\n" +
                "    " + inLoopLabel + ":\n" +
                indent(body) +
                ":: else -> break\n" +
                "od;\n" +
                exitLabel + ":\n" +
                "skip;\n";
    }

    @Override
    public String visitForStatement(HashParser.ForStatementContext ctx) {
        int id = ++loopCounter;

        String startLabel = "loop_start_" + id;
        String updateLabel = "loop_update_" + id;
        String inLoopLabel = "inLoop_" + id;
        String exitLabel = "exitLoop_" + id;

        String init = visit(ctx.assignmentsStatemetns());
        String checks = generateDivisionChecks(ctx.condition());
        String condition = translateExpr(ctx.condition());
        String update = visit(ctx.update()) + ";\n";

        continueLabelStack.push(updateLabel);

        String body = renderBlock(ctx.supportedStatements());

        continueLabelStack.pop();

        return init +
                checks +
                startLabel + ":\n" +
                "do\n" +
                ":: (" + condition + ") ->\n" +
                "    " + inLoopLabel + ":\n" +
                indent(body) +
                "    " + updateLabel + ":\n" +
                indent(update) +
                ":: else -> break\n" +
                "od;\n" +
                exitLabel + ":\n" +
                "skip;\n";
    }

    @Override
    public String visitGoToStatements(HashParser.GoToStatementsContext ctx) {
        if (ctx.BREAK() != null) {
            return "break;\n";
        }

        if (ctx.CONTINUE() != null) {
            if (continueLabelStack.isEmpty()) {
                throw new IllegalStateException("edame used outside loop."); // can't possible to happen
            }

            return "goto " + continueLabelStack.peek() + ";\n";
        }

        throw new UnsupportedOperationException("Unknown goto statement: " + ctx.getText());
    }

    @Override
    public String visitExceptionStatements(HashParser.ExceptionStatementsContext ctx) {
        String tryLabel = "end_try_" + (++tryIdx);
        tryLabelStack.push(tryLabel);

        String tryBlock = renderBlock(ctx.supportedStatements());

        StringBuilder out = new StringBuilder();

        out.append("/* emtehan block */\n");
        out.append(tryBlock);

        out.append(tryLabel).append(":\n");
        tryLabelStack.pop();

        if (!ctx.catchClause().isEmpty()) {
            out.append(visit(ctx.catchClause(0)));
        }

        String finallyBlock = "";
        if (ctx.finallyClause() != null) {
            finallyBlock = visit(ctx.finallyClause());
        }

        if (!finallyBlock.isBlank()) {
            out.append("/* akhar block */\n");
            out.append(finallyBlock);
        }

        return out.toString();
    }

    @Override
    public String visitCatchClause(HashParser.CatchClauseContext ctx) {
        StringBuilder out = new StringBuilder();

        String ex = ctx.exceptionType().getText();
        String condition = exceptionFlag(ex);

        List<HashParser.SupportedStatementsContext> catchStatements = new ArrayList<>(ctx.supportedStatements());
        String catchBlock = renderBlock(catchStatements);

        out.append("if\n");
        out.append(":: (").append(condition).append(") ->\n");
        out.append("    ").append(condition).append(" = false;\n");
        out.append(indent(catchBlock));
        out.append(":: else -> skip\n");
        out.append("fi;\n");

        return out.toString();
    }

    @Override
    public String visitFinallyClause(HashParser.FinallyClauseContext ctx) {
        return renderBlock(ctx.supportedStatements());
    }

    @Override
    public String visitThrowsException(HashParser.ThrowsExceptionContext ctx) {
        String e = ctx.exceptionType().getText();
        String out = switch (e) {
            case "SefrBood" -> "divByZero = true;\n";
            case "MahdoodeNadorost" -> "outOfBound = true;\n";
            case "JadvalKhali" -> "nullPointer = true;\n";
            case "GheireMojaz" -> "noPermission = true;\n";
            default -> {
                declareGlobalWithInit(e);
                yield e + " = true;\n";
            }
        };
        return out + "goto " + tryLabelStack.peek() + ";\n";
    }

    private String mapType(String hashType) {
        return switch (hashType) {
            case "adad" -> "int";
            case "boole" -> "bool";
            default -> throw new UnsupportedOperationException(
                    "Type not supported in Project2 Promela subset: " + hashType
            );
        };
    }

    private String translateExpr(ParserRuleContext ctx) {
        String expr = ctx.getText();

        expr = expr.replaceAll("\\bdorost\\b", "true");
        expr = expr.replaceAll("\\bghalat\\b", "false");

        if (expr.contains("**")) {
            throw new UnsupportedOperationException(
                    "Power operator ** is not supported in this Promela translator yet: " + expr
            );
        }

        return expr;
    }

    private String assignmentLine(String name, String op, String expr) {
        if (op.equals("/=")) return checkDevByZero(name, name, expr);
        return assignmentLineWithoutSemicolon(name, op, expr) + ";\n";
    }

    private String assignmentLineWithoutSemicolon(String name, String op, String expr) {
        return switch (op) {
            case "=" -> name + " = " + expr;
            case "+=" -> name + " = " + name + " + (" + expr + ")";
            case "-=" -> name + " = " + name + " - (" + expr + ")";
            case "*=" -> name + " = " + name + " * (" + expr + ")";
            case "/=" -> name + " = " + name + " / (" + expr + ")";
            default -> throw new UnsupportedOperationException("Unsupported assignment operator: " + op);
        };
    }

    private void declareGlobal(String type, String name) {
        if (declaredGlobals.add(name)) {
            globalDecls.append(type).append(" ").append(name).append(";\n");
        }
    }

    private void declareGlobalWithInit(String name) {
        if (declaredGlobals.add(name)) {
            globalDecls.append("bool").append(" ").append(name).append(" = ").append("false").append(";\n");
        }
    }

    private String renderBlock(List<? extends ParserRuleContext> statements) {
        StringBuilder out = new StringBuilder();

        for (ParserRuleContext st : statements) {
            String code = visit(st);
            if (code != null && !code.isBlank()) {
                out.append(code);
            }
        }

        if (out.toString().isBlank()) {
            return "skip;\n";
        }

        return out.toString();
    }

    private String indent(String code) {
        String prefix = "    ".repeat(1);
        StringBuilder out = new StringBuilder();

        String[] lines = code.split("\\R", -1);

        for (String line : lines) {
            if (!line.isBlank()) {
                out.append(prefix).append(line);
            }
            out.append("\n");
        }

        return out.toString();
    }

    private void splitIfChildrenSupported(
            HashParser.IfElseStatmentsContext ctx,
            List<HashParser.SupportedStatementsContext> thenStatements,
            List<HashParser.SupportedStatementsContext> elseStatements
    ) {
        boolean collectingThen = false;
        boolean collectingElse = false;
        boolean seenElse = false;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();

            if ("vagarna".equals(text)) {
                seenElse = true;
                collectingThen = false;
                continue;
            }

            if ("{".equals(text)) {
                if (seenElse) {
                    collectingElse = true;
                } else {
                    collectingThen = true;
                }
                continue;
            }

            if ("}".equals(text)) {
                collectingThen = false;
                collectingElse = false;
                continue;
            }

            if (child instanceof HashParser.SupportedStatementsContext st) {
                if (collectingElse) {
                    elseStatements.add(st);
                } else if (collectingThen) {
                    thenStatements.add(st);
                }
            }
        }
    }

    private String exceptionFlag(String ex) {
        return switch (ex) {
            case "SefrBood" -> "divByZero";
            case "MahdoodeNadorost" -> "outOfBound";
            case "JadvalKhali" -> "nullPointer";
            case "GheireMojaz" -> "noPermission";
            default -> ex;
        };
    }

    private String generateDivisionChecks(ParserRuleContext ctx) {
        List<String> divisors = new ArrayList<>();
        findDivisions(ctx, divisors);

        StringBuilder out = new StringBuilder();

        for (String d : divisors) {
            out.append(checkDivisionOnly(d));
        }

        return out.toString();
    }

    private void findDivisions(ParserRuleContext ctx, List<String> divisors) {

        if (ctx instanceof HashParser.MultiplicativeExpressionContext mul) {

            List<HashParser.PowerExpressionContext> exprs = mul.powerExpression();

            for (int i = 0; i < mul.getChildCount(); i++) {

                ParseTree child = mul.getChild(i);

                if (child.getText().equals("/")) {
                    divisors.add(exprs.get((i + 1) / 2).getText());
                }
            }
        }

        for (ParseTree child : ctx.children) {
            if (child instanceof ParserRuleContext prc)
                findDivisions(prc, divisors);
        }
    }

    private String checkDivisionOnly(String divisor) {
        return "if\n" +
                ":: (" + divisor + " == 0) ->\n" +
                "   divByZero = true;\n" +
                "   goto " + tryLabelStack.peek() + ";\n" +
                ":: else ->\n" +
                "   skip;\n" +
                "fi;\n";
    }

    private String checkDevByZero(String a, String b, String c){
        return "if\n" +
                ":: (" + c + " == 0) ->\n" +
                "   divByZero = true;\n" +
                "   goto " + tryLabelStack.peek() + ";\n" +
                ":: else ->\n   " +
                a + " = " + b + " / (" + c + ");\n" +
                "fi;\n";
    }

    /* ltl methods */
    private String ltlMethods(){
        return "\n\n" +
                "/*\n" +
                "------------------------\n" +
                " ltl checker methods \n" +
                "------------------------\n" +
                "*/\n\n" +
                ltlSafety() + ltlLiveness() + ltlReachability();
    }

    private String ltlSafety(){
        return "ltl safety {\n" +
                "    [] (!divByZero)\n" +
                "}\n\n";
    }

    private String ltlLiveness(){
        String s = "";
        for (int i = 1; i <= loopCounter; i++) {
            s += "ltl liveness_" + i + " {\n" +
                    "    [](inLoop_" + i + " -> <>exitLoop_" + i + ")\n" +
                    "}\n\n";
        }
        return s;
    }

    private String ltlReachability(){
        return "ltl reachability {\n" +
                "    <>endReached\n" +
                "}\n\n";
    }
}