package GJ;

// Generated from GJGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GJGrammarParser}.
 */
public interface GJGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GJGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GJGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(GJGrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(GJGrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(GJGrammarParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(GJGrammarParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerAssignment}
	 * labeled alternative in {@link GJGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAssignment(GJGrammarParser.IntegerAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerAssignment}
	 * labeled alternative in {@link GJGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAssignment(GJGrammarParser.IntegerAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link GJGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAssignment(GJGrammarParser.BooleanAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link GJGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAssignment(GJGrammarParser.BooleanAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link GJGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringAssignment(GJGrammarParser.StringAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link GJGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringAssignment(GJGrammarParser.StringAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBoolean}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBoolean(GJGrammarParser.ExpressionBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBoolean}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBoolean(GJGrammarParser.ExpressionBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyBooleanIdentifier}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterOnlyBooleanIdentifier(GJGrammarParser.OnlyBooleanIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyBooleanIdentifier}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitOnlyBooleanIdentifier(GJGrammarParser.OnlyBooleanIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyBooleanExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterOnlyBooleanExpression(GJGrammarParser.OnlyBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyBooleanExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitOnlyBooleanExpression(GJGrammarParser.OnlyBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanParenthesisExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanParenthesisExpression(GJGrammarParser.BooleanParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanParenthesisExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanParenthesisExpression(GJGrammarParser.BooleanParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanComparisonExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanComparisonExpression(GJGrammarParser.BooleanComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanComparisonExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanComparisonExpression(GJGrammarParser.BooleanComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanConnectorExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConnectorExpression(GJGrammarParser.BooleanConnectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanConnectorExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConnectorExpression(GJGrammarParser.BooleanConnectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberComparisonExpression}
	 * labeled alternative in {@link GJGrammarParser#arithmeticComparison}.
	 * @param ctx the parse tree
	 */
	void enterNumberComparisonExpression(GJGrammarParser.NumberComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberComparisonExpression}
	 * labeled alternative in {@link GJGrammarParser#arithmeticComparison}.
	 * @param ctx the parse tree
	 */
	void exitNumberComparisonExpression(GJGrammarParser.NumberComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberMulDivExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterNumberMulDivExpr(GJGrammarParser.NumberMulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberMulDivExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitNumberMulDivExpr(GJGrammarParser.NumberMulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberTernaryExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterNumberTernaryExpr(GJGrammarParser.NumberTernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberTernaryExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitNumberTernaryExpr(GJGrammarParser.NumberTernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberParenthesesExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterNumberParenthesesExpr(GJGrammarParser.NumberParenthesesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberParenthesesExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitNumberParenthesesExpr(GJGrammarParser.NumberParenthesesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyNumberExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOnlyNumberExpr(GJGrammarParser.OnlyNumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyNumberExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOnlyNumberExpr(GJGrammarParser.OnlyNumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyNumberIdentifier}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOnlyNumberIdentifier(GJGrammarParser.OnlyNumberIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyNumberIdentifier}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOnlyNumberIdentifier(GJGrammarParser.OnlyNumberIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAddSubExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterNumberAddSubExpr(GJGrammarParser.NumberAddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAddSubExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitNumberAddSubExpr(GJGrammarParser.NumberAddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link GJGrammarParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(GJGrammarParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link GJGrammarParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(GJGrammarParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyStringExpr}
	 * labeled alternative in {@link GJGrammarParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterOnlyStringExpr(GJGrammarParser.OnlyStringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyStringExpr}
	 * labeled alternative in {@link GJGrammarParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitOnlyStringExpr(GJGrammarParser.OnlyStringExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#cond_expressn}.
	 * @param ctx the parse tree
	 */
	void enterCond_expressn(GJGrammarParser.Cond_expressnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#cond_expressn}.
	 * @param ctx the parse tree
	 */
	void exitCond_expressn(GJGrammarParser.Cond_expressnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(GJGrammarParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(GJGrammarParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#elseifCondition}.
	 * @param ctx the parse tree
	 */
	void enterElseifCondition(GJGrammarParser.ElseifConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#elseifCondition}.
	 * @param ctx the parse tree
	 */
	void exitElseifCondition(GJGrammarParser.ElseifConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void enterElseCondition(GJGrammarParser.ElseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void exitElseCondition(GJGrammarParser.ElseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(GJGrammarParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(GJGrammarParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(GJGrammarParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(GJGrammarParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#isEqualto}.
	 * @param ctx the parse tree
	 */
	void enterIsEqualto(GJGrammarParser.IsEqualtoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#isEqualto}.
	 * @param ctx the parse tree
	 */
	void exitIsEqualto(GJGrammarParser.IsEqualtoContext ctx);
}