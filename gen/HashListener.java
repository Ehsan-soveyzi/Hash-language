// Generated from D:/ehsan/university/term4/language & machin theorem/hash_language/Hash_language_proje/src/Hash.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HashParser}.
 */
public interface HashListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HashParser#startState}.
	 * @param ctx the parse tree
	 */
	void enterStartState(HashParser.StartStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#startState}.
	 * @param ctx the parse tree
	 */
	void exitStartState(HashParser.StartStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#supportedStatements}.
	 * @param ctx the parse tree
	 */
	void enterSupportedStatements(HashParser.SupportedStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#supportedStatements}.
	 * @param ctx the parse tree
	 */
	void exitSupportedStatements(HashParser.SupportedStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#functionStatemnets}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatemnets(HashParser.FunctionStatemnetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#functionStatemnets}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatemnets(HashParser.FunctionStatemnetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#functionTypesApproaches}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypesApproaches(HashParser.FunctionTypesApproachesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#functionTypesApproaches}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypesApproaches(HashParser.FunctionTypesApproachesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#intReturn}.
	 * @param ctx the parse tree
	 */
	void enterIntReturn(HashParser.IntReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#intReturn}.
	 * @param ctx the parse tree
	 */
	void exitIntReturn(HashParser.IntReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#floatReturn}.
	 * @param ctx the parse tree
	 */
	void enterFloatReturn(HashParser.FloatReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#floatReturn}.
	 * @param ctx the parse tree
	 */
	void exitFloatReturn(HashParser.FloatReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#boolReturn}.
	 * @param ctx the parse tree
	 */
	void enterBoolReturn(HashParser.BoolReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#boolReturn}.
	 * @param ctx the parse tree
	 */
	void exitBoolReturn(HashParser.BoolReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#charReturn}.
	 * @param ctx the parse tree
	 */
	void enterCharReturn(HashParser.CharReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#charReturn}.
	 * @param ctx the parse tree
	 */
	void exitCharReturn(HashParser.CharReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#stringReturn}.
	 * @param ctx the parse tree
	 */
	void enterStringReturn(HashParser.StringReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#stringReturn}.
	 * @param ctx the parse tree
	 */
	void exitStringReturn(HashParser.StringReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#voidReturn}.
	 * @param ctx the parse tree
	 */
	void enterVoidReturn(HashParser.VoidReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#voidReturn}.
	 * @param ctx the parse tree
	 */
	void exitVoidReturn(HashParser.VoidReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(HashParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(HashParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#intFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterIntFunctionBody(HashParser.IntFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#intFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitIntFunctionBody(HashParser.IntFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#floatFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterFloatFunctionBody(HashParser.FloatFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#floatFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitFloatFunctionBody(HashParser.FloatFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#boolFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterBoolFunctionBody(HashParser.BoolFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#boolFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitBoolFunctionBody(HashParser.BoolFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#charFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterCharFunctionBody(HashParser.CharFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#charFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitCharFunctionBody(HashParser.CharFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#stringFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterStringFunctionBody(HashParser.StringFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#stringFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitStringFunctionBody(HashParser.StringFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#voidFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunctionBody(HashParser.VoidFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#voidFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunctionBody(HashParser.VoidFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#intFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterIntFunctionStatement(HashParser.IntFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#intFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitIntFunctionStatement(HashParser.IntFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#floatFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFloatFunctionStatement(HashParser.FloatFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#floatFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFloatFunctionStatement(HashParser.FloatFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#boolFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterBoolFunctionStatement(HashParser.BoolFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#boolFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitBoolFunctionStatement(HashParser.BoolFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#charFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCharFunctionStatement(HashParser.CharFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#charFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCharFunctionStatement(HashParser.CharFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#stringFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterStringFunctionStatement(HashParser.StringFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#stringFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitStringFunctionStatement(HashParser.StringFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#voidFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunctionStatement(HashParser.VoidFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#voidFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunctionStatement(HashParser.VoidFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#intReturnStatement}.
	 * @param ctx the parse tree
	 */
	void enterIntReturnStatement(HashParser.IntReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#intReturnStatement}.
	 * @param ctx the parse tree
	 */
	void exitIntReturnStatement(HashParser.IntReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#floatReturnStatement}.
	 * @param ctx the parse tree
	 */
	void enterFloatReturnStatement(HashParser.FloatReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#floatReturnStatement}.
	 * @param ctx the parse tree
	 */
	void exitFloatReturnStatement(HashParser.FloatReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#boolReturnStatement}.
	 * @param ctx the parse tree
	 */
	void enterBoolReturnStatement(HashParser.BoolReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#boolReturnStatement}.
	 * @param ctx the parse tree
	 */
	void exitBoolReturnStatement(HashParser.BoolReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#charReturnStatement}.
	 * @param ctx the parse tree
	 */
	void enterCharReturnStatement(HashParser.CharReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#charReturnStatement}.
	 * @param ctx the parse tree
	 */
	void exitCharReturnStatement(HashParser.CharReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#stringReturnStatement}.
	 * @param ctx the parse tree
	 */
	void enterStringReturnStatement(HashParser.StringReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#stringReturnStatement}.
	 * @param ctx the parse tree
	 */
	void exitStringReturnStatement(HashParser.StringReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#voidReturnStatement}.
	 * @param ctx the parse tree
	 */
	void enterVoidReturnStatement(HashParser.VoidReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#voidReturnStatement}.
	 * @param ctx the parse tree
	 */
	void exitVoidReturnStatement(HashParser.VoidReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#switchStatements}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatements(HashParser.SwitchStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#switchStatements}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatements(HashParser.SwitchStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#caseStatements}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatements(HashParser.CaseStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#caseStatements}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatements(HashParser.CaseStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#loopStatements}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatements(HashParser.LoopStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#loopStatements}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatements(HashParser.LoopStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(HashParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(HashParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(HashParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(HashParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#goToStatements}.
	 * @param ctx the parse tree
	 */
	void enterGoToStatements(HashParser.GoToStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#goToStatements}.
	 * @param ctx the parse tree
	 */
	void exitGoToStatements(HashParser.GoToStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#importStatements}.
	 * @param ctx the parse tree
	 */
	void enterImportStatements(HashParser.ImportStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#importStatements}.
	 * @param ctx the parse tree
	 */
	void exitImportStatements(HashParser.ImportStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#moduleStatements}.
	 * @param ctx the parse tree
	 */
	void enterModuleStatements(HashParser.ModuleStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#moduleStatements}.
	 * @param ctx the parse tree
	 */
	void exitModuleStatements(HashParser.ModuleStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#assignmentsStatemetns}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentsStatemetns(HashParser.AssignmentsStatemetnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#assignmentsStatemetns}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentsStatemetns(HashParser.AssignmentsStatemetnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#ifElseStatments}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatments(HashParser.IfElseStatmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#ifElseStatments}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatments(HashParser.IfElseStatmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HashParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HashParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#loopBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopBodyStatement(HashParser.LoopBodyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#loopBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopBodyStatement(HashParser.LoopBodyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#ifElseStatmentsInLoop}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatmentsInLoop(HashParser.IfElseStatmentsInLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#ifElseStatmentsInLoop}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatmentsInLoop(HashParser.IfElseStatmentsInLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(HashParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(HashParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HashParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HashParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(HashParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(HashParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(HashParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(HashParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(HashParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(HashParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#comparitioanlExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparitioanlExpression(HashParser.ComparitioanlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#comparitioanlExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparitioanlExpression(HashParser.ComparitioanlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(HashParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(HashParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(HashParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(HashParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(HashParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(HashParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(HashParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(HashParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(HashParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(HashParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(HashParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(HashParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HashParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HashParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HashParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HashParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(HashParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(HashParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(HashParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(HashParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(HashParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(HashParser.BooleanLiteralContext ctx);
}