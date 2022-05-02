package GJ;

// Generated from GJGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GJGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GJGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GJGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GJGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GJGrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(GJGrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GJGrammarParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(GJGrammarParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerAssignment}
	 * labeled alternative in {@link GJGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAssignment(GJGrammarParser.IntegerAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAssignment}
	 * labeled alternative in {@link GJGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAssignment(GJGrammarParser.BooleanAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link GJGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignment(GJGrammarParser.StringAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionBoolean}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBoolean(GJGrammarParser.ExpressionBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onlyBooleanIdentifier}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyBooleanIdentifier(GJGrammarParser.OnlyBooleanIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onlyBooleanExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyBooleanExpression(GJGrammarParser.OnlyBooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanParenthesisExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanParenthesisExpression(GJGrammarParser.BooleanParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanComparisonExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanComparisonExpression(GJGrammarParser.BooleanComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanConnectorExpression}
	 * labeled alternative in {@link GJGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConnectorExpression(GJGrammarParser.BooleanConnectorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberComparisonExpression}
	 * labeled alternative in {@link GJGrammarParser#arithmeticComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberComparisonExpression(GJGrammarParser.NumberComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberMulDivExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberMulDivExpr(GJGrammarParser.NumberMulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberTernaryExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberTernaryExpr(GJGrammarParser.NumberTernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberParenthesesExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberParenthesesExpr(GJGrammarParser.NumberParenthesesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onlyNumberExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyNumberExpr(GJGrammarParser.OnlyNumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onlyNumberIdentifier}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyNumberIdentifier(GJGrammarParser.OnlyNumberIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAddSubExpr}
	 * labeled alternative in {@link GJGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAddSubExpr(GJGrammarParser.NumberAddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link GJGrammarParser#stringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(GJGrammarParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onlyStringExpr}
	 * labeled alternative in {@link GJGrammarParser#stringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyStringExpr(GJGrammarParser.OnlyStringExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GJGrammarParser#cond_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expressn(GJGrammarParser.Cond_expressnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GJGrammarParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(GJGrammarParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GJGrammarParser#elseifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifCondition(GJGrammarParser.ElseifConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GJGrammarParser#elseCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCondition(GJGrammarParser.ElseConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GJGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(GJGrammarParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GJGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(GJGrammarParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GJGrammarParser#isEqualto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsEqualto(GJGrammarParser.IsEqualtoContext ctx);
}