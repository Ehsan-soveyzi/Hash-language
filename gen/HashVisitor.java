// Generated from E:/uni/term4/nazarie/antlr/prj2/Hash-language/src/Hash.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link HashParser#definedAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedAssignment(HashParser.DefinedAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#assignmentsStatemetns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentsStatemetns(HashParser.AssignmentsStatemetnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#defineVariableWithNoAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineVariableWithNoAssignmentStatement(HashParser.DefineVariableWithNoAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#ifElseStatments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatments(HashParser.IfElseStatmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#loopStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatements(HashParser.LoopStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#goToStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToStatements(HashParser.GoToStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#functionStatemnets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatemnets(HashParser.FunctionStatemnetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(HashParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(HashParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#switchStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatements(HashParser.SwitchStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#classStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatement(HashParser.ClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#thisAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAssignment(HashParser.ThisAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#instantiationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiationStatement(HashParser.InstantiationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#objectFieldAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFieldAssignment(HashParser.ObjectFieldAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(HashParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(HashParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#exceptionStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionStatements(HashParser.ExceptionStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#throwsException}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowsException(HashParser.ThrowsExceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#customExceptionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomExceptionStatement(HashParser.CustomExceptionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(HashParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(HashParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(HashParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#finallyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyClause(HashParser.FinallyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(HashParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#thisFieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisFieldAccess(HashParser.ThisFieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(HashParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(HashParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#caseStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatements(HashParser.CaseStatementsContext ctx);
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
	 * Visit a parse tree produced by {@link HashParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(HashParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(HashParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#classMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodDeclaration(HashParser.ClassMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(HashParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HashParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(HashParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(HashParser.ArgumentListContext ctx);
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
	 * Visit a parse tree produced by {@link HashParser#prefixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(HashParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#accessAndCallsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessAndCallsExpression(HashParser.AccessAndCallsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(HashParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#inputParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputParameters(HashParser.InputParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HashParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HashParser#functionTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypes(HashParser.FunctionTypesContext ctx);
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