// Generated from D:/ehsan/university/term4/language & machin theorem/hash_language/Hash_language_proje/src/Hash.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HashParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HashVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HashParser#startState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartState(HashParser.StartStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#supportedStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportedStatements(HashParser.SupportedStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#functionStatemnets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatemnets(HashParser.FunctionStatemnetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#functionTypesApproaches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypesApproaches(HashParser.FunctionTypesApproachesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#intReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntReturn(HashParser.IntReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#floatReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatReturn(HashParser.FloatReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#boolReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolReturn(HashParser.BoolReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#charReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharReturn(HashParser.CharReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#stringReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringReturn(HashParser.StringReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#voidReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidReturn(HashParser.VoidReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(HashParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#intFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntFunctionBody(HashParser.IntFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#floatFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatFunctionBody(HashParser.FloatFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#boolFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFunctionBody(HashParser.BoolFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#charFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunctionBody(HashParser.CharFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#stringFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFunctionBody(HashParser.StringFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#voidFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunctionBody(HashParser.VoidFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#intFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntFunctionStatement(HashParser.IntFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#floatFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatFunctionStatement(HashParser.FloatFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#boolFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFunctionStatement(HashParser.BoolFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#charFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunctionStatement(HashParser.CharFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#stringFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFunctionStatement(HashParser.StringFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#voidFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunctionStatement(HashParser.VoidFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#intReturnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntReturnStatement(HashParser.IntReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#floatReturnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatReturnStatement(HashParser.FloatReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#boolReturnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolReturnStatement(HashParser.BoolReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#charReturnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharReturnStatement(HashParser.CharReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#stringReturnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringReturnStatement(HashParser.StringReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#voidReturnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidReturnStatement(HashParser.VoidReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#switchStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatements(HashParser.SwitchStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#caseStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatements(HashParser.CaseStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#loopStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatements(HashParser.LoopStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(HashParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(HashParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#goToStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToStatements(HashParser.GoToStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#importStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatements(HashParser.ImportStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#moduleStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleStatements(HashParser.ModuleStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#assignmentsStatemetns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentsStatemetns(HashParser.AssignmentsStatemetnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#ifElseStatments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatments(HashParser.IfElseStatmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HashParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#loopBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBodyStatement(HashParser.LoopBodyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#ifElseStatmentsInLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatmentsInLoop(HashParser.IfElseStatmentsInLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(HashParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HashParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(HashParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(HashParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(HashParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#comparitioanlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparitioanlExpression(HashParser.ComparitioanlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(HashParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(HashParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(HashParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#powerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(HashParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(HashParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(HashParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HashParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(HashParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(HashParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName(HashParser.ModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(HashParser.BooleanLiteralContext ctx);
}