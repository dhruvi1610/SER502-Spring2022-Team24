package GJ;

// Generated from GJGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GJGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, DIGITS=15, BOOL=16, STR=17, 
		ADDITION=18, SUBTRACTION=19, MULTIPLY=20, DIVIDE=21, AND=22, OR=23, Lessthan=24, 
		GreaterThan=25, LessEqual=26, GreaterEqual=27, NotEqual=28, Equals=29, 
		QUESTIONMARK=30, COLON=31, IDENTIFIER=32, WS=33, Comment=34;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_terms = 2, RULE_expr = 3, RULE_booleanExpression = 4, 
		RULE_arithmeticComparison = 5, RULE_operator = 6, RULE_stringExpression = 7, 
		RULE_cond_expressn = 8, RULE_ifCondition = 9, RULE_elseifCondition = 10, 
		RULE_elseCondition = 11, RULE_whileLoop = 12, RULE_printStatement = 13, 
		RULE_isEqualto = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "terms", "expr", "booleanExpression", "arithmeticComparison", 
			"operator", "stringExpression", "cond_expressn", "ifCondition", "elseifCondition", 
			"elseCondition", "whileLoop", "printStatement", "isEqualto"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'ank'", "'tark'", "'vakya'", "'('", "')'", "'jo'", 
			"'bas'", "'nahitoh'", "'toh'", "'sudhi'", "'batav'", "'='", null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'<'", "'>'", "'<='", 
			"'>='", "'!='", "'=='", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "DIGITS", "BOOL", "STR", "ADDITION", "SUBTRACTION", 
			"MULTIPLY", "DIVIDE", "AND", "OR", "Lessthan", "GreaterThan", "LessEqual", 
			"GreaterEqual", "NotEqual", "Equals", "QUESTIONMARK", "COLON", "IDENTIFIER", 
			"WS", "Comment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GJGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GJGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			body();
			setState(32);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<TermsContext> terms() {
			return getRuleContexts(TermsContext.class);
		}
		public TermsContext terms(int i) {
			return getRuleContext(TermsContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__7:
			case T__11:
			case T__12:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(35);
					terms();
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << IDENTIFIER))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermsContext extends ParserRuleContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_terms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(42);
				ifCondition();
				}
				break;
			case T__11:
				{
				setState(43);
				whileLoop();
				}
				break;
			case T__12:
				{
				setState(44);
				printStatement();
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case IDENTIFIER:
				{
				setState(45);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerAssignmentContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(GJGrammarParser.IDENTIFIER, 0); }
		public IsEqualtoContext isEqualto() {
			return getRuleContext(IsEqualtoContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public IntegerAssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterIntegerAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitIntegerAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitIntegerAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAssignmentContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(GJGrammarParser.IDENTIFIER, 0); }
		public IsEqualtoContext isEqualto() {
			return getRuleContext(IsEqualtoContext.class,0);
		}
		public StringExpressionContext stringExpression() {
			return getRuleContext(StringExpressionContext.class,0);
		}
		public StringAssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterStringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitStringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitStringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAssignmentContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(GJGrammarParser.IDENTIFIER, 0); }
		public IsEqualtoContext isEqualto() {
			return getRuleContext(IsEqualtoContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BooleanAssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterBooleanAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitBooleanAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitBooleanAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IntegerAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T__2);
				setState(49);
				match(IDENTIFIER);
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(50);
					isEqualto();
					setState(51);
					operator(0);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new BooleanAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__3);
				setState(56);
				match(IDENTIFIER);
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(57);
					isEqualto();
					setState(58);
					booleanExpression(0);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new StringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(T__4);
				setState(63);
				match(IDENTIFIER);
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(64);
					isEqualto();
					setState(65);
					stringExpression(0);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new IntegerAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(IDENTIFIER);
				setState(70);
				isEqualto();
				setState(71);
				operator(0);
				}
				break;
			case 5:
				_localctx = new BooleanAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(IDENTIFIER);
				setState(74);
				isEqualto();
				setState(75);
				booleanExpression(0);
				}
				break;
			case 6:
				_localctx = new StringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(IDENTIFIER);
				setState(78);
				isEqualto();
				setState(79);
				stringExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionBooleanContext extends BooleanExpressionContext {
		public Token op;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(GJGrammarParser.Equals, 0); }
		public TerminalNode NotEqual() { return getToken(GJGrammarParser.NotEqual, 0); }
		public ExpressionBooleanContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterExpressionBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitExpressionBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitExpressionBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OnlyBooleanIdentifierContext extends BooleanExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(GJGrammarParser.IDENTIFIER, 0); }
		public OnlyBooleanIdentifierContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterOnlyBooleanIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitOnlyBooleanIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitOnlyBooleanIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OnlyBooleanExpressionContext extends BooleanExpressionContext {
		public TerminalNode BOOL() { return getToken(GJGrammarParser.BOOL, 0); }
		public OnlyBooleanExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterOnlyBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitOnlyBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitOnlyBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanParenthesisExpressionContext extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BooleanParenthesisExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterBooleanParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitBooleanParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitBooleanParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanComparisonExpressionContext extends BooleanExpressionContext {
		public ArithmeticComparisonContext arithmeticComparison() {
			return getRuleContext(ArithmeticComparisonContext.class,0);
		}
		public BooleanComparisonExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterBooleanComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitBooleanComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitBooleanComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanConnectorExpressionContext extends BooleanExpressionContext {
		public Token op;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(GJGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(GJGrammarParser.OR, 0); }
		public BooleanConnectorExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterBooleanConnectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitBooleanConnectorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitBooleanConnectorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new BooleanComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(84);
				arithmeticComparison();
				}
				break;
			case 2:
				{
				_localctx = new BooleanParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(T__5);
				setState(86);
				booleanExpression(0);
				setState(87);
				match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new OnlyBooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(BOOL);
				}
				break;
			case 4:
				{
				_localctx = new OnlyBooleanIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionBooleanContext(new BooleanExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(93);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(94);
						((ExpressionBooleanContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==NotEqual || _la==Equals) ) {
							((ExpressionBooleanContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						booleanExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new BooleanConnectorExpressionContext(new BooleanExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(96);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(97);
						((BooleanConnectorExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((BooleanConnectorExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						booleanExpression(6);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArithmeticComparisonContext extends ParserRuleContext {
		public ArithmeticComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticComparison; }
	 
		public ArithmeticComparisonContext() { }
		public void copyFrom(ArithmeticComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberComparisonExpressionContext extends ArithmeticComparisonContext {
		public Token op;
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public TerminalNode GreaterThan() { return getToken(GJGrammarParser.GreaterThan, 0); }
		public TerminalNode Lessthan() { return getToken(GJGrammarParser.Lessthan, 0); }
		public TerminalNode GreaterEqual() { return getToken(GJGrammarParser.GreaterEqual, 0); }
		public TerminalNode LessEqual() { return getToken(GJGrammarParser.LessEqual, 0); }
		public TerminalNode Equals() { return getToken(GJGrammarParser.Equals, 0); }
		public TerminalNode NotEqual() { return getToken(GJGrammarParser.NotEqual, 0); }
		public NumberComparisonExpressionContext(ArithmeticComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterNumberComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitNumberComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitNumberComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticComparisonContext arithmeticComparison() throws RecognitionException {
		ArithmeticComparisonContext _localctx = new ArithmeticComparisonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arithmeticComparison);
		int _la;
		try {
			_localctx = new NumberComparisonExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			operator(0);
			setState(105);
			((NumberComparisonExpressionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Lessthan) | (1L << GreaterThan) | (1L << LessEqual) | (1L << GreaterEqual) | (1L << NotEqual) | (1L << Equals))) != 0)) ) {
				((NumberComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			operator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	 
		public OperatorContext() { }
		public void copyFrom(OperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberMulDivExprContext extends OperatorContext {
		public Token op;
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(GJGrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(GJGrammarParser.DIVIDE, 0); }
		public NumberMulDivExprContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterNumberMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitNumberMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitNumberMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberTernaryExprContext extends OperatorContext {
		public Token op;
		public Token bop;
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUESTIONMARK() { return getToken(GJGrammarParser.QUESTIONMARK, 0); }
		public TerminalNode COLON() { return getToken(GJGrammarParser.COLON, 0); }
		public NumberTernaryExprContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterNumberTernaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitNumberTernaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitNumberTernaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberParenthesesExprContext extends OperatorContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public NumberParenthesesExprContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterNumberParenthesesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitNumberParenthesesExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitNumberParenthesesExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OnlyNumberExprContext extends OperatorContext {
		public TerminalNode DIGITS() { return getToken(GJGrammarParser.DIGITS, 0); }
		public TerminalNode SUBTRACTION() { return getToken(GJGrammarParser.SUBTRACTION, 0); }
		public OnlyNumberExprContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterOnlyNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitOnlyNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitOnlyNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OnlyNumberIdentifierContext extends OperatorContext {
		public TerminalNode IDENTIFIER() { return getToken(GJGrammarParser.IDENTIFIER, 0); }
		public TerminalNode SUBTRACTION() { return getToken(GJGrammarParser.SUBTRACTION, 0); }
		public OnlyNumberIdentifierContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterOnlyNumberIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitOnlyNumberIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitOnlyNumberIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAddSubExprContext extends OperatorContext {
		public Token op;
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public TerminalNode ADDITION() { return getToken(GJGrammarParser.ADDITION, 0); }
		public TerminalNode SUBTRACTION() { return getToken(GJGrammarParser.SUBTRACTION, 0); }
		public NumberAddSubExprContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterNumberAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitNumberAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitNumberAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		return operator(0);
	}

	private OperatorContext operator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperatorContext _localctx = new OperatorContext(_ctx, _parentState);
		OperatorContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_operator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new NumberParenthesesExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(109);
				match(T__5);
				setState(110);
				operator(0);
				setState(111);
				match(T__6);
				}
				break;
			case 2:
				{
				_localctx = new OnlyNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACTION) {
					{
					setState(113);
					match(SUBTRACTION);
					}
				}

				setState(116);
				match(DIGITS);
				}
				break;
			case 3:
				{
				_localctx = new OnlyNumberIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACTION) {
					{
					setState(117);
					match(SUBTRACTION);
					}
				}

				setState(120);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new NumberMulDivExprContext(new OperatorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator);
						setState(123);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(124);
						((NumberMulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
							((NumberMulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						operator(7);
						}
						break;
					case 2:
						{
						_localctx = new NumberAddSubExprContext(new OperatorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator);
						setState(126);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(127);
						((NumberAddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADDITION || _la==SUBTRACTION) ) {
							((NumberAddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						operator(6);
						}
						break;
					case 3:
						{
						_localctx = new NumberTernaryExprContext(new OperatorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operator);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
						((NumberTernaryExprContext)_localctx).op = match(QUESTIONMARK);
						setState(131);
						expr();
						setState(132);
						((NumberTernaryExprContext)_localctx).bop = match(COLON);
						setState(133);
						expr();
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StringExpressionContext extends ParserRuleContext {
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
	 
		public StringExpressionContext() { }
		public void copyFrom(StringExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringExprContext extends StringExpressionContext {
		public Token se;
		public List<StringExpressionContext> stringExpression() {
			return getRuleContexts(StringExpressionContext.class);
		}
		public StringExpressionContext stringExpression(int i) {
			return getRuleContext(StringExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(GJGrammarParser.Equals, 0); }
		public TerminalNode NotEqual() { return getToken(GJGrammarParser.NotEqual, 0); }
		public StringExprContext(StringExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OnlyStringExprContext extends StringExpressionContext {
		public TerminalNode STR() { return getToken(GJGrammarParser.STR, 0); }
		public OnlyStringExprContext(StringExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterOnlyStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitOnlyStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitOnlyStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		return stringExpression(0);
	}

	private StringExpressionContext stringExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, _parentState);
		StringExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_stringExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OnlyStringExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(141);
			match(STR);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StringExprContext(new StringExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_stringExpression);
					setState(143);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(144);
					((StringExprContext)_localctx).se = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==NotEqual || _la==Equals) ) {
						((StringExprContext)_localctx).se = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(145);
					stringExpression(3);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Cond_expressnContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public Cond_expressnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expressn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterCond_expressn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitCond_expressn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitCond_expressn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_expressnContext cond_expressn() throws RecognitionException {
		Cond_expressnContext _localctx = new Cond_expressnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cond_expressn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__5);
			setState(152);
			booleanExpression(0);
			setState(153);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public Cond_expressnContext cond_expressn() {
			return getRuleContext(Cond_expressnContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ElseifConditionContext> elseifCondition() {
			return getRuleContexts(ElseifConditionContext.class);
		}
		public ElseifConditionContext elseifCondition(int i) {
			return getRuleContext(ElseifConditionContext.class,i);
		}
		public ElseConditionContext elseCondition() {
			return getRuleContext(ElseConditionContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__7);
			setState(156);
			cond_expressn();
			setState(157);
			match(T__0);
			setState(158);
			body();
			setState(159);
			match(T__1);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(160);
				elseifCondition();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(166);
				elseCondition();
				}
			}

			setState(169);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifConditionContext extends ParserRuleContext {
		public Cond_expressnContext cond_expressn() {
			return getRuleContext(Cond_expressnContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseifConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterElseifCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitElseifCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitElseifCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifConditionContext elseifCondition() throws RecognitionException {
		ElseifConditionContext _localctx = new ElseifConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__9);
			setState(172);
			cond_expressn();
			setState(173);
			match(T__0);
			setState(174);
			body();
			setState(175);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseConditionContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterElseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitElseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitElseCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseConditionContext elseCondition() throws RecognitionException {
		ElseConditionContext _localctx = new ElseConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__10);
			setState(178);
			match(T__0);
			setState(179);
			body();
			setState(180);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public Cond_expressnContext cond_expressn() {
			return getRuleContext(Cond_expressnContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__11);
			setState(183);
			cond_expressn();
			setState(184);
			match(T__0);
			setState(185);
			body();
			setState(186);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(GJGrammarParser.DIGITS, 0); }
		public TerminalNode BOOL() { return getToken(GJGrammarParser.BOOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GJGrammarParser.IDENTIFIER, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__12);
			setState(189);
			match(T__5);
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(190);
				match(DIGITS);
				}
				break;
			case 2:
				{
				setState(191);
				match(BOOL);
				}
				break;
			case 3:
				{
				setState(192);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(193);
				operator(0);
				}
				break;
			case 5:
				{
				setState(194);
				booleanExpression(0);
				}
				break;
			}
			setState(197);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsEqualtoContext extends ParserRuleContext {
		public IsEqualtoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isEqualto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterIsEqualto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitIsEqualto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GJGrammarVisitor ) return ((GJGrammarVisitor<? extends T>)visitor).visitIsEqualto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsEqualtoContext isEqualto() throws RecognitionException {
		IsEqualtoContext _localctx = new IsEqualtoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_isEqualto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 6:
			return operator_sempred((OperatorContext)_localctx, predIndex);
		case 7:
			return stringExpression_sempred((StringExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean operator_sempred(OperatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean stringExpression_sempred(StringExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\6\3\'\n\3\r\3\16\3(\5\3+\n\3\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\5\58\n\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5F\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6f\n\6\f"+
		"\6\16\6i\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bu\n\b\3\b\3\b"+
		"\5\by\n\b\3\b\5\b|\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0095\n"+
		"\t\f\t\16\t\u0098\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u00a4\n\13\f\13\16\13\u00a7\13\13\3\13\5\13\u00aa\n\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c6\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\2\5\n\16\20\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3"+
		"\2\36\37\3\2\30\31\3\2\32\37\3\2\26\27\3\2\24\25\2\u00dc\2 \3\2\2\2\4"+
		"*\3\2\2\2\6\60\3\2\2\2\bS\3\2\2\2\n]\3\2\2\2\fj\3\2\2\2\16{\3\2\2\2\20"+
		"\u008e\3\2\2\2\22\u0099\3\2\2\2\24\u009d\3\2\2\2\26\u00ad\3\2\2\2\30\u00b3"+
		"\3\2\2\2\32\u00b8\3\2\2\2\34\u00be\3\2\2\2\36\u00c9\3\2\2\2 !\7\3\2\2"+
		"!\"\5\4\3\2\"#\7\4\2\2#\3\3\2\2\2$+\3\2\2\2%\'\5\6\4\2&%\3\2\2\2\'(\3"+
		"\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*$\3\2\2\2*&\3\2\2\2+\5\3\2\2\2,\61"+
		"\5\24\13\2-\61\5\32\16\2.\61\5\34\17\2/\61\5\b\5\2\60,\3\2\2\2\60-\3\2"+
		"\2\2\60.\3\2\2\2\60/\3\2\2\2\61\7\3\2\2\2\62\63\7\5\2\2\63\67\7\"\2\2"+
		"\64\65\5\36\20\2\65\66\5\16\b\2\668\3\2\2\2\67\64\3\2\2\2\678\3\2\2\2"+
		"8T\3\2\2\29:\7\6\2\2:>\7\"\2\2;<\5\36\20\2<=\5\n\6\2=?\3\2\2\2>;\3\2\2"+
		"\2>?\3\2\2\2?T\3\2\2\2@A\7\7\2\2AE\7\"\2\2BC\5\36\20\2CD\5\20\t\2DF\3"+
		"\2\2\2EB\3\2\2\2EF\3\2\2\2FT\3\2\2\2GH\7\"\2\2HI\5\36\20\2IJ\5\16\b\2"+
		"JT\3\2\2\2KL\7\"\2\2LM\5\36\20\2MN\5\n\6\2NT\3\2\2\2OP\7\"\2\2PQ\5\36"+
		"\20\2QR\5\20\t\2RT\3\2\2\2S\62\3\2\2\2S9\3\2\2\2S@\3\2\2\2SG\3\2\2\2S"+
		"K\3\2\2\2SO\3\2\2\2T\t\3\2\2\2UV\b\6\1\2V^\5\f\7\2WX\7\b\2\2XY\5\n\6\2"+
		"YZ\7\t\2\2Z^\3\2\2\2[^\7\22\2\2\\^\7\"\2\2]U\3\2\2\2]W\3\2\2\2][\3\2\2"+
		"\2]\\\3\2\2\2^g\3\2\2\2_`\f\b\2\2`a\t\2\2\2af\5\n\6\tbc\f\7\2\2cd\t\3"+
		"\2\2df\5\n\6\be_\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\13\3"+
		"\2\2\2ig\3\2\2\2jk\5\16\b\2kl\t\4\2\2lm\5\16\b\2m\r\3\2\2\2no\b\b\1\2"+
		"op\7\b\2\2pq\5\16\b\2qr\7\t\2\2r|\3\2\2\2su\7\25\2\2ts\3\2\2\2tu\3\2\2"+
		"\2uv\3\2\2\2v|\7\21\2\2wy\7\25\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7\""+
		"\2\2{n\3\2\2\2{t\3\2\2\2{x\3\2\2\2|\u008b\3\2\2\2}~\f\b\2\2~\177\t\5\2"+
		"\2\177\u008a\5\16\b\t\u0080\u0081\f\7\2\2\u0081\u0082\t\6\2\2\u0082\u008a"+
		"\5\16\b\b\u0083\u0084\f\5\2\2\u0084\u0085\7 \2\2\u0085\u0086\5\b\5\2\u0086"+
		"\u0087\7!\2\2\u0087\u0088\5\b\5\2\u0088\u008a\3\2\2\2\u0089}\3\2\2\2\u0089"+
		"\u0080\3\2\2\2\u0089\u0083\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\17\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f"+
		"\b\t\1\2\u008f\u0090\7\23\2\2\u0090\u0096\3\2\2\2\u0091\u0092\f\4\2\2"+
		"\u0092\u0093\t\2\2\2\u0093\u0095\5\20\t\5\u0094\u0091\3\2\2\2\u0095\u0098"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\21\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\7\b\2\2\u009a\u009b\5\n\6\2\u009b\u009c\7\t"+
		"\2\2\u009c\23\3\2\2\2\u009d\u009e\7\n\2\2\u009e\u009f\5\22\n\2\u009f\u00a0"+
		"\7\3\2\2\u00a0\u00a1\5\4\3\2\u00a1\u00a5\7\4\2\2\u00a2\u00a4\5\26\f\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\5\30\r\2"+
		"\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\7\13\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00af\5\22\n\2\u00af"+
		"\u00b0\7\3\2\2\u00b0\u00b1\5\4\3\2\u00b1\u00b2\7\4\2\2\u00b2\27\3\2\2"+
		"\2\u00b3\u00b4\7\r\2\2\u00b4\u00b5\7\3\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7"+
		"\7\4\2\2\u00b7\31\3\2\2\2\u00b8\u00b9\7\16\2\2\u00b9\u00ba\5\22\n\2\u00ba"+
		"\u00bb\7\3\2\2\u00bb\u00bc\5\4\3\2\u00bc\u00bd\7\4\2\2\u00bd\33\3\2\2"+
		"\2\u00be\u00bf\7\17\2\2\u00bf\u00c5\7\b\2\2\u00c0\u00c6\7\21\2\2\u00c1"+
		"\u00c6\7\22\2\2\u00c2\u00c6\7\"\2\2\u00c3\u00c6\5\16\b\2\u00c4\u00c6\5"+
		"\n\6\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\t"+
		"\2\2\u00c8\35\3\2\2\2\u00c9\u00ca\7\20\2\2\u00ca\37\3\2\2\2\25(*\60\67"+
		">ES]egtx{\u0089\u008b\u0096\u00a5\u00a9\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}