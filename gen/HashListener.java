// Generated from E:/uni/term4/nazarie/antlr/prj2/Hash-language/src/Hash.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link HashParser#definedAssignment}.
	 * @param ctx the parse tree
	 */
	void enterDefinedAssignment(HashParser.DefinedAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#definedAssignment}.
	 * @param ctx the parse tree
	 */
	void exitDefinedAssignment(HashParser.DefinedAssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link HashParser#defineVariableWithNoAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefineVariableWithNoAssignmentStatement(HashParser.DefineVariableWithNoAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#defineVariableWithNoAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefineVariableWithNoAssignmentStatement(HashParser.DefineVariableWithNoAssignmentStatementContext ctx);
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
	 * Enter a parse tree produced by {@link HashParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(HashParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(HashParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(HashParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(HashParser.ReturnStatementContext ctx);
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
	 * Enter a parse tree produced by {@link HashParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassStatement(HashParser.ClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassStatement(HashParser.ClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#thisAssignment}.
	 * @param ctx the parse tree
	 */
	void enterThisAssignment(HashParser.ThisAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#thisAssignment}.
	 * @param ctx the parse tree
	 */
	void exitThisAssignment(HashParser.ThisAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#instantiationStatement}.
	 * @param ctx the parse tree
	 */
	void enterInstantiationStatement(HashParser.InstantiationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#instantiationStatement}.
	 * @param ctx the parse tree
	 */
	void exitInstantiationStatement(HashParser.InstantiationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#objectFieldAssignment}.
	 * @param ctx the parse tree
	 */
	void enterObjectFieldAssignment(HashParser.ObjectFieldAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#objectFieldAssignment}.
	 * @param ctx the parse tree
	 */
	void exitObjectFieldAssignment(HashParser.ObjectFieldAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(HashParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(HashParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(HashParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(HashParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#exceptionStatements}.
	 * @param ctx the parse tree
	 */
	void enterExceptionStatements(HashParser.ExceptionStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#exceptionStatements}.
	 * @param ctx the parse tree
	 */
	void exitExceptionStatements(HashParser.ExceptionStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#throwsException}.
	 * @param ctx the parse tree
	 */
	void enterThrowsException(HashParser.ThrowsExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#throwsException}.
	 * @param ctx the parse tree
	 */
	void exitThrowsException(HashParser.ThrowsExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#customExceptionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCustomExceptionStatement(HashParser.CustomExceptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#customExceptionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCustomExceptionStatement(HashParser.CustomExceptionStatementContext ctx);
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
	 * Enter a parse tree produced by {@link HashParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(HashParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(HashParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(HashParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(HashParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(HashParser.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(HashParser.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(HashParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(HashParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#thisFieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterThisFieldAccess(HashParser.ThisFieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#thisFieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitThisFieldAccess(HashParser.ThisFieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(HashParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(HashParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(HashParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(HashParser.MethodCallContext ctx);
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
	 * Enter a parse tree produced by {@link HashParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(HashParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(HashParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(HashParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(HashParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#classMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMethodDeclaration(HashParser.ClassMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#classMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMethodDeclaration(HashParser.ClassMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(HashParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(HashParser.ConstructorDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link HashParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HashParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HashParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(HashParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(HashParser.ArgumentListContext ctx);
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
	 * Enter a parse tree produced by {@link HashParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(HashParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(HashParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HashParser#accessAndCallsExpression}.
	 * @param ctx the parse tree
	 */
	void enterAccessAndCallsExpression(HashParser.AccessAndCallsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#accessAndCallsExpression}.
	 * @param ctx the parse tree
	 */
	void exitAccessAndCallsExpression(HashParser.AccessAndCallsExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link HashParser#inputParameters}.
	 * @param ctx the parse tree
	 */
	void enterInputParameters(HashParser.InputParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#inputParameters}.
	 * @param ctx the parse tree
	 */
	void exitInputParameters(HashParser.InputParametersContext ctx);
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
	 * Enter a parse tree produced by {@link HashParser#functionTypes}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypes(HashParser.FunctionTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HashParser#functionTypes}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypes(HashParser.FunctionTypesContext ctx);
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