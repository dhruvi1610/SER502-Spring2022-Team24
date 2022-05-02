package compiler;

import java.io.IOException;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import GJ.GJGrammarBaseVisitor;
import GJ.GJGrammarParser;
import GJ.GJGrammarParser.BodyContext;
import GJ.GJGrammarParser.BooleanAssignmentContext;
import GJ.GJGrammarParser.BooleanComparisonExpressionContext;
import GJ.GJGrammarParser.BooleanConnectorExpressionContext;
import GJ.GJGrammarParser.BooleanParenthesisExpressionContext;
import GJ.GJGrammarParser.Cond_expressnContext;
import GJ.GJGrammarParser.ElseConditionContext;
import GJ.GJGrammarParser.ElseifConditionContext;
import GJ.GJGrammarParser.ExpressionBooleanContext;
import GJ.GJGrammarParser.IfConditionContext;
import GJ.GJGrammarParser.IntegerAssignmentContext;
import GJ.GJGrammarParser.IsEqualtoContext;
import GJ.GJGrammarParser.NumberAddSubExprContext;
import GJ.GJGrammarParser.NumberComparisonExpressionContext;
import GJ.GJGrammarParser.NumberMulDivExprContext;
import GJ.GJGrammarParser.NumberParenthesesExprContext;
import GJ.GJGrammarParser.NumberTernaryExprContext;
import GJ.GJGrammarParser.OnlyBooleanExpressionContext;
import GJ.GJGrammarParser.OnlyBooleanIdentifierContext;
import GJ.GJGrammarParser.OnlyNumberExprContext;
import GJ.GJGrammarParser.OnlyNumberIdentifierContext;
import GJ.GJGrammarParser.OnlyStringExprContext;
import GJ.GJGrammarParser.PrintStatementContext;
import GJ.GJGrammarParser.ProgramContext;
import GJ.GJGrammarParser.StringAssignmentContext;
import GJ.GJGrammarParser.StringExprContext;
import GJ.GJGrammarParser.StringExpressionContext;
import GJ.GJGrammarParser.TermsContext;
import GJ.GJGrammarParser.WhileLoopContext;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import runtime.GJRuntimeConstants;

/**
 * This class
 * @author
 * @since April-28-2022
 * @version 1.0
 */

public class GJCompiler extends GJGrammarBaseVisitor<Object>
{

	ArrayList<String> list = new ArrayList<>();


	private class CreateIntermediate

	/* Generating Intermediate Code */

	{
		private String imc = "";

		private void addCode(String s)
		{
			this.imc+=s+"\n";
		}
	}

	private CreateIntermediate codegen = new CreateIntermediate();

	/* To print the Intermediate Code */
	public String giveOutput()
	{
		return codegen.imc;
	}



	/* When ank is read it is considered as an Intger data type */

	@Override

	public Object visitIntegerAssignment(IntegerAssignmentContext ctx) {
		String id = ctx.IDENTIFIER().getText();

		if(ctx.getText().contains("ank"))
		{
			addVar(id);
		}
		else
		{
			if(!checkExistanceofVar(id))
			{
				System.err.print("\n The given variable :"+id+" is not defined. Throwing Compile time error!");
				System.exit(1);
			}
		}

		if(ctx.isEqualto()!=null)
		{
			visit(ctx.operator());
			codegen.addCode(GJRuntimeConstants.SACHAV + " "+id+" "+GJRuntimeConstants.ACCUMULATOR);
		}
		else
		{
			codegen.addCode(GJRuntimeConstants.SACHAV + " "+id+" "+GJRuntimeConstants.ACCUMULATOR +" "+GJRuntimeConstants.ANK_DEFAULT);
			codegen.addCode(GJRuntimeConstants.SACHAV + " "+id+" "+GJRuntimeConstants.ACCUMULATOR);
		}
		return null;
	}


	@Override
	public Object visitBooleanAssignment(BooleanAssignmentContext ctx)
	{
		String id = ctx.IDENTIFIER().getText();

		if(ctx.getText().contains("tark"))
		{
			addVar(id);
		}
		else
		{
			if(!checkExistanceofVar(id))
			{
				System.err.print("\n The given variable :"+id+" is not defined. Throwing Compile time error!");
				System.exit(1);
			}
		}

		if(ctx.isEqualto() != null)
		{
			visit(ctx.booleanExpression());
			codegen.addCode(GJRuntimeConstants.SACHAV + " "+id + " "+GJRuntimeConstants.ACCUMULATOR);
		}

		else
		{
			codegen.addCode(GJRuntimeConstants.SACHAV +" "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.TARK_DEFAULT);
			codegen.addCode(GJRuntimeConstants.SACHAV + " "+id+" "+GJRuntimeConstants.ACCUMULATOR);
		}
		return null;
	}

	/* When vakya is read it is considered as a String data type */
	@Override
	public Object visitStringAssignment(StringAssignmentContext ctx) {
		String id = ctx.IDENTIFIER().getText();

		if(ctx.getText().contains("vakya"))
		{
			addVar(id);
		}
		else
		{
			if(!checkExistanceofVar(id))
			{
				System.err.print("\n The given variable :"+id+" is not defined. Throwing Compile time error!");
				System.exit(1);
			}
		}

		if(ctx.isEqualto()!=null)
		{
			visit(ctx.stringExpression());
			codegen.addCode(GJRuntimeConstants.SACHAV + " "+id+" "+GJRuntimeConstants.ACCUMULATOR);
		}
		else
		{
			codegen.addCode(GJRuntimeConstants.SACHAV + " "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.VAKYA_DEFAULT);
			codegen.addCode(GJRuntimeConstants.SACHAV+" "+id+" "+GJRuntimeConstants.ACCUMULATOR);
		}
		return null;
	}

	/* Function visits the boolean expression */
	@Override
	public Object visitExpressionBoolean(ExpressionBooleanContext ctx)
	{
		visit(ctx.booleanExpression(0));
		codegen.addCode(GJRuntimeConstants.SACHAV + " "+GJRuntimeConstants.BIJU_REGISTER+" "+GJRuntimeConstants.ACCUMULATOR);

		visit(ctx.booleanExpression(1));
		codegen.addCode(GJRuntimeConstants.SACHAV + " "+GJRuntimeConstants.TIJU_REGISTER+" "+GJRuntimeConstants.ACCUMULATOR);

		switch(ctx.op.getType())
		{
			case GJGrammarParser.Equals:
				codegen.addCode(GJRuntimeConstants.SARKHU + " "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.BIJU_REGISTER+" "+GJRuntimeConstants.TIJU_REGISTER);
				break;

			case GJGrammarParser.NotEqual:
				codegen.addCode(GJRuntimeConstants.SARKHU_NAHI+" "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.BIJU_REGISTER+" "+GJRuntimeConstants.TIJU_REGISTER);
				break;
		}
		return null;
	}

	/* Function visits the boolean identifier */
	@Override
	public Object visitOnlyBooleanIdentifier(OnlyBooleanIdentifierContext ctx) {
		String id = ctx.IDENTIFIER().getText();

		if(checkExistanceofVar(id))
		{
			codegen.addCode(GJRuntimeConstants.SACHAV+" "+GJRuntimeConstants.ACCUMULATOR+" "+id);
		}
		else
		{
			System.err.print("\n The given variable :"+id+" is not defined. Throwing Compile time error!");
			System.exit(1);
		}
		return null;
	}

	/* Function visits only the boolean expression */
	@Override
	public Object visitOnlyBooleanExpression(OnlyBooleanExpressionContext ctx) {
		String s = ctx.BOOL().getText();
		codegen.addCode(GJRuntimeConstants.SACHAV + " "+GJRuntimeConstants.ACCUMULATOR+" "+s);
		return null;
	}

	/* Function visits evaluates the boolean parenthesis */
	@Override
	public Object visitBooleanParenthesisExpression(BooleanParenthesisExpressionContext ctx) {
		visit(ctx.booleanExpression());
		return null;
	}

	/* Function evaluates the boolean comparison expression */
	@Override
	public Object visitBooleanComparisonExpression(BooleanComparisonExpressionContext ctx) {
		visit(ctx.arithmeticComparison());
		return null;
	}

	@Override
	public Object visitProgram(ProgramContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitBody(BodyContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitTerms(TermsContext ctx) {
		return visitChildren(ctx);
	}


	/* Function visits the boolean connector expression */
	@Override
	public Object visitBooleanConnectorExpression(BooleanConnectorExpressionContext ctx)
	{
		visit(ctx.booleanExpression(0));
		codegen.addCode(GJRuntimeConstants.SACHAV+" "+GJRuntimeConstants.BIJU_REGISTER+" "+GJRuntimeConstants.ACCUMULATOR);

		visit(ctx.booleanExpression(1));
		codegen.addCode(GJRuntimeConstants.SACHAV+" "+GJRuntimeConstants.TIJU_REGISTER+" "+GJRuntimeConstants.ACCUMULATOR);

		switch(ctx.op.getType())
		{
			case GJGrammarParser.AND:
				codegen.addCode(GJRuntimeConstants.AND + " "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.BIJU_REGISTER+" "+GJRuntimeConstants.TIJU_REGISTER);
				break;


			case GJGrammarParser.OR:
				codegen.addCode(GJRuntimeConstants.OR+" "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.BIJU_REGISTER+" "+GJRuntimeConstants.TIJU_REGISTER);
				break;
		}

		return null;
	}

	/* Comparing numbers using registers named ACC, KA, KHA, GA */
	@Override
	public Object visitNumberComparisonExpression(NumberComparisonExpressionContext ctx) {

		visit(ctx.operator(0));
		codegen.addCode(GJRuntimeConstants.SACHAV+" "+GJRuntimeConstants.TIJU_REGISTER+" "+GJRuntimeConstants.ACCUMULATOR);

		visit(ctx.operator(1));
		codegen.addCode(GJRuntimeConstants.SACHAV+" "+GJRuntimeConstants.CHOTHU_REGISTER+" "+GJRuntimeConstants.ACCUMULATOR);


		switch(ctx.op.getType())
		{
			case GJGrammarParser.GreaterThan:
				codegen.addCode(GJRuntimeConstants.VADHARE+" "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.TIJU_REGISTER+" "+GJRuntimeConstants.CHOTHU_REGISTER);
				break;

			case GJGrammarParser.GreaterEqual:
				codegen.addCode(GJRuntimeConstants.VADHARE_K_SARKHU+" "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.TIJU_REGISTER+" "+GJRuntimeConstants.CHOTHU_REGISTER);
				break;

			case GJGrammarParser.Lessthan:
				codegen.addCode(GJRuntimeConstants.OCHHU+" "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.TIJU_REGISTER+" "+GJRuntimeConstants.CHOTHU_REGISTER);
				break;

			case GJGrammarParser.LessEqual:
				codegen.addCode(GJRuntimeConstants.OCHHU_K_SARKHU+" "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.TIJU_REGISTER+" "+GJRuntimeConstants.CHOTHU_REGISTER);
				break;

			case GJGrammarParser.Equals:
				codegen.addCode(GJRuntimeConstants.SARKHU+" "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.TIJU_REGISTER+" "+GJRuntimeConstants.CHOTHU_REGISTER);
				break;

			case GJGrammarParser.NotEqual:
				codegen.addCode(GJRuntimeConstants.SARKHU_NAHI+" "+GJRuntimeConstants.ACCUMULATOR+" "+GJRuntimeConstants.TIJU_REGISTER+" "+GJRuntimeConstants.CHOTHU_REGISTER);
				break;
		}
		return null;
	}

	/* Function visits the if condition expression */
	@Override
	public Object visitIfCondition(IfConditionContext ctx) {
		codegen.addCode(GJRuntimeConstants.JO_TOH_START);
		codegen.addCode(GJRuntimeConstants.JO_START);

		visit(ctx.cond_expressn());
		visit(ctx.body());

		codegen.addCode(GJRuntimeConstants.JO_END);

		for(int i=0;i<ctx.elseifCondition().size();i++)
		{
			visit(ctx.elseifCondition(i));
		}

		if(ctx.elseCondition()!=null)
		{
			visit(ctx.elseCondition());
		}

		codegen.addCode(GJRuntimeConstants.JO_TOH_END);

		return null;
	}

	/* Multiple and divison expressions */
	@Override
	public Object visitNumberMulDivExpr(NumberMulDivExprContext ctx) {
		System.out.print(ctx.getText());
		String r1 = "";
		String r2 = "";

		int t1 = 1;
		int t2 = 0;

		if(!(ctx.operator(1).getChildCount() > ctx.operator(0).getChildCount()))
		{
			t1 = 0;
			t2 = 1;
		}

		if(!((ctx.operator(1).getChildCount() > 2) && (ctx.operator(0).getChildCount() > 2)))
		{
			r1 = GJRuntimeConstants.TIJU_REGISTER;
			r2 = GJRuntimeConstants.CHOTHU_REGISTER;
		}
		else
		{
			r1 = GJRuntimeConstants.BIJU_REGISTER;
			r2 = GJRuntimeConstants.TIJU_REGISTER;
		}

		visit(ctx.operator(t1));
		codegen.addCode(GJRuntimeConstants.SACHAV+" "+r1+" "+GJRuntimeConstants.ACCUMULATOR);

		visit(ctx.operator(t2));
		codegen.addCode(GJRuntimeConstants.SACHAV+" "+r2+" "+GJRuntimeConstants.ACCUMULATOR);

		switch(ctx.op.getType())
		{
			case GJGrammarParser.MULTIPLY:
				codegen.addCode(GJRuntimeConstants.MULTIPLY+" "+GJRuntimeConstants.ACCUMULATOR+" "+r1+" "+r2);
				break;

			case GJGrammarParser.DIVIDE:
				codegen.addCode(GJRuntimeConstants.DIVIDE+" "+GJRuntimeConstants.ACCUMULATOR+" "+r1+" "+r2);
				break;
		}
		return null;
	}

	/* Function evaluates the Ternary expression */
	@Override
	public Object visitNumberTernaryExpr(NumberTernaryExprContext ctx) {
		visit(ctx.operator());
		return null;
	}

	/* Function evaluates the Parentheis of an expression */
	@Override
	public Object visitNumberParenthesesExpr(NumberParenthesesExprContext ctx) {
		visit(ctx.operator());
		return null;
	}

	/* Function visits the numbers of an expression */
	@Override
	public Object visitOnlyNumberExpr(OnlyNumberExprContext ctx) {
		String s = ctx.DIGITS().getText();

		Integer val = Integer.parseInt(s);

		if(ctx.SUBTRACTION() != null)
		{
			val = -val;
		}
		codegen.addCode(GJRuntimeConstants.SACHAV+" "+GJRuntimeConstants.ACCUMULATOR+" "+val);
		return null;
	}

	/* Function visits the identifiers of a number in an expression */
	@Override
	public Object visitOnlyNumberIdentifier(OnlyNumberIdentifierContext ctx) {
		String id = ctx.IDENTIFIER().getText();

		if(checkExistanceofVar(id))
		{
			codegen.addCode(GJRuntimeConstants.SACHAV+" "+GJRuntimeConstants.ACCUMULATOR+" "+id);

			if(ctx.SUBTRACTION() != null)
			{
				codegen.addCode(GJRuntimeConstants.UNARY_MINUS+" "+GJRuntimeConstants.ACCUMULATOR);
			}
		}
		else
		{
			System.err.print("\n The given variable :"+id+" is not defined. Throwing Compile time error!");
			System.exit(1);
		}

		return null;
	}

	/* Function visits the addition and subtraction expression */
	@Override
	public Object visitNumberAddSubExpr(NumberAddSubExprContext ctx)
	{
		int t1 = 1;
		int t2 = 0;

		String r1 = "";
		String r2 = "";

		if(!(ctx.operator(0).getChildCount() > ctx.operator(0).getChildCount()))
		{
			t1 = 0;
			t2 = 1;
		}

		if(!((ctx.operator(1).getChildCount() > 2) && (ctx.operator(0).getChildCount()>2)))
		{
			r1 = GJRuntimeConstants.TIJU_REGISTER;
			r2 = GJRuntimeConstants.CHOTHU_REGISTER;
		}
		else
		{
			r1 = GJRuntimeConstants.BIJU_REGISTER;
			r2 = GJRuntimeConstants.TIJU_REGISTER;
		}

		visit(ctx.operator(t1));
		codegen.addCode(GJRuntimeConstants.SACHAV+ " "+r1+" "+GJRuntimeConstants.ACCUMULATOR);

		visit(ctx.operator(t2));
		codegen.addCode(GJRuntimeConstants.SACHAV + " "+r2+" "+GJRuntimeConstants.ACCUMULATOR);

		switch(ctx.op.getType())
		{
			case GJGrammarParser.ADDITION:
				codegen.addCode(GJRuntimeConstants.ADDITION+" "+GJRuntimeConstants.ACCUMULATOR+" "+r1+" "+r2);
				break;

			case GJGrammarParser.SUBTRACTION:
				codegen.addCode(GJRuntimeConstants.SUBTRACTION+" "+GJRuntimeConstants.ACCUMULATOR+" "+r1+" "+r2);
				break;
		}
		return null;
	}

	/* Function visits the string expression */
	@Override
	public Object visitStringExpr(StringExprContext ctx) {
		visit(ctx.stringExpression(0));
		return null;
	}


	/* Function visits only the string expression */
	@Override
	public Object visitOnlyStringExpr(OnlyStringExprContext ctx) {
		String s = ctx.STR().getText();
		codegen.addCode(GJRuntimeConstants.SACHAV + " "+GJRuntimeConstants.ACCUMULATOR+" "+s);
		return null;
	}

	/* Function visits the conditional expression */
	@Override
	public Object visitCond_expressn(Cond_expressnContext ctx) {

		codegen.addCode(GJRuntimeConstants.START_CONDITION);
		visit(ctx.booleanExpression());
		codegen.addCode(GJRuntimeConstants.END_CONDITION);
		return null;
	}





	void addVar(String variable)
	{
		list.add(variable);
	}

	boolean checkExistanceofVar(String variable)
	{
		boolean assume = false;
		if(list.contains(variable))
		{
			assume = true;
		}
		return assume;
	}

	/* Function visits the else-if conditional expression */
	@Override
	public Object visitElseifCondition(ElseifConditionContext ctx) {

		codegen.addCode(GJRuntimeConstants.NAHITOH_JO_START);
		visit(ctx.cond_expressn());
		visit(ctx.body());
		codegen.addCode(GJRuntimeConstants.NAHITOH_JO_END);
		return null;
	}

	/* Function visits the else conditional expression */
	@Override
	public Object visitElseCondition(ElseConditionContext ctx) {
		codegen.addCode(GJRuntimeConstants.NAHITOH_START);
		visit(ctx.body());
		codegen.addCode(GJRuntimeConstants.NAHITOH_END);
		return null;
	}

	/* Function visits the while conditional expression */
	@Override
	public Object visitWhileLoop(WhileLoopContext ctx) {
		codegen.addCode(GJRuntimeConstants.SUDHI_START);
		visit(ctx.cond_expressn());
		visit(ctx.body());
		codegen.addCode(GJRuntimeConstants.SUDHI_END);
		return null;
	}




	/* Function visits the print expression */


	@Override
	public Object visitPrintStatement(PrintStatementContext ctx) {
		if(ctx.IDENTIFIER() != null)
		{
			if(checkExistanceofVar(ctx.IDENTIFIER().getText()))
			{
				codegen.addCode(GJRuntimeConstants.LAKH+" "+ ctx.IDENTIFIER().getText());
			}
			else
			{
				System.err.print("\n The given variable :"+ctx.IDENTIFIER().getText()+" is not defined. Throwing Compile time error!");
				System.exit(1);
			}
		}
		else if(ctx.DIGITS()!=null)
		{
			codegen.addCode(GJRuntimeConstants.LAKH+" "+ctx.DIGITS().getText());
		}
		else if(ctx.BOOL() !=null)
		{
			codegen.addCode(GJRuntimeConstants.LAKH+" "+ctx.BOOL().getText());
		}
		else if(ctx.operator()!=null)
		{
			visit(ctx.operator());
			codegen.addCode(GJRuntimeConstants.LAKH + " "+GJRuntimeConstants.ACCUMULATOR);
		}
		else if(ctx.booleanExpression()!=null)
		{
			visit(ctx.booleanExpression());
			codegen.addCode(GJRuntimeConstants.LAKH+" "+GJRuntimeConstants.ACCUMULATOR);
		}
		return null;
	}


}
