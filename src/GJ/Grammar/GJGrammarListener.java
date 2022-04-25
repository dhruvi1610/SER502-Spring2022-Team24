// Generated from GJGrammar.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link GJGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GJGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GJGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(GJGrammarParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(GJGrammarParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operatorComparison}
	 * labeled alternative in {@link GJGrammarParser#arithmeticComparison}.
	 * @param ctx the parse tree
	 */
	void enterOperatorComparison(GJGrammarParser.OperatorComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatorComparison}
	 * labeled alternative in {@link GJGrammarParser#arithmeticComparison}.
	 * @param ctx the parse tree
	 */
	void exitOperatorComparison(GJGrammarParser.OperatorComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(GJGrammarParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(GJGrammarParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GJGrammarParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(GJGrammarParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GJGrammarParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(GJGrammarParser.StringExpressionContext ctx);
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