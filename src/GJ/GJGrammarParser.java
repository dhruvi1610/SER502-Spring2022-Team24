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
		IDENTIFIER=30, WS=31, Comment=32;
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
			"'>='", "'!='", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "DIGITS", "BOOL", "STR", "ADDITION", "SUBTRACTION", 
			"MULTIPLY", "DIVIDE", "AND", "OR", "Lessthan", "GreaterThan", "LessEqual", 
			"GreaterEqual", "NotEqual", "Equals", "IDENTIFIER", "WS", "Comment"
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
		public TerminalNode IDENTIFIER() { return getToken(GJGrammarParser.IDENTIFIER, 0); }
		public IsEqualtoContext isEqualto() {
			return getRuleContext(IsEqualtoContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public StringExpressionContext stringExpression() {
			return getRuleContext(StringExpressionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T__2);
				setState(49);
				match(IDENTIFIER);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(50);
					isEqualto();
					setState(51);
					operator(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__3);
				setState(56);
				match(IDENTIFIER);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(57);
					isEqualto();
					setState(58);
					booleanExpression(0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(T__4);
				setState(63);
				match(IDENTIFIER);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(64);
					isEqualto();
					setState(65);
					stringExpression(0);
					}
				}

				}
				break;
			case 4:
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
		public Token op;
		public ArithmeticComparisonContext arithmeticComparison() {
			return getRuleContext(ArithmeticComparisonContext.class,0);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode BOOL() { return getToken(GJGrammarParser.BOOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GJGrammarParser.IDENTIFIER, 0); }
		public TerminalNode Equals() { return getToken(GJGrammarParser.Equals, 0); }
		public TerminalNode NotEqual() { return getToken(GJGrammarParser.NotEqual, 0); }
		public TerminalNode AND() { return getToken(GJGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(GJGrammarParser.OR, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitBooleanExpression(this);
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
				setState(84);
				arithmeticComparison();
				}
				break;
			case 2:
				{
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
				setState(89);
				match(BOOL);
				}
				break;
			case 4:
				{
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
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(93);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(94);
						((BooleanExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==NotEqual || _la==Equals) ) {
							((BooleanExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(96);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(97);
						((BooleanExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((BooleanExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
	public static class OperatorComparisonContext extends ArithmeticComparisonContext {
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
		public OperatorComparisonContext(ArithmeticComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterOperatorComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitOperatorComparison(this);
		}
	}

	public final ArithmeticComparisonContext arithmeticComparison() throws RecognitionException {
		ArithmeticComparisonContext _localctx = new ArithmeticComparisonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arithmeticComparison);
		int _la;
		try {
			_localctx = new OperatorComparisonContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			operator(0);
			setState(105);
			((OperatorComparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Lessthan) | (1L << GreaterThan) | (1L << LessEqual) | (1L << GreaterEqual) | (1L << NotEqual) | (1L << Equals))) != 0)) ) {
				((OperatorComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
		public Token op;
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public TerminalNode DIGITS() { return getToken(GJGrammarParser.DIGITS, 0); }
		public TerminalNode SUBTRACTION() { return getToken(GJGrammarParser.SUBTRACTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GJGrammarParser.IDENTIFIER, 0); }
		public TerminalNode MULTIPLY() { return getToken(GJGrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(GJGrammarParser.DIVIDE, 0); }
		public TerminalNode ADDITION() { return getToken(GJGrammarParser.ADDITION, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitOperator(this);
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
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new OperatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operator);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124);
						((OperatorContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
							((OperatorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						operator(6);
						}
						break;
					case 2:
						{
						_localctx = new OperatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operator);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127);
						((OperatorContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADDITION || _la==SUBTRACTION) ) {
							((OperatorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						operator(5);
						}
						break;
					}
					} 
				}
				setState(133);
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
		public Token se;
		public TerminalNode STR() { return getToken(GJGrammarParser.STR, 0); }
		public List<StringExpressionContext> stringExpression() {
			return getRuleContexts(StringExpressionContext.class);
		}
		public StringExpressionContext stringExpression(int i) {
			return getRuleContext(StringExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(GJGrammarParser.Equals, 0); }
		public TerminalNode NotEqual() { return getToken(GJGrammarParser.NotEqual, 0); }
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GJGrammarListener ) ((GJGrammarListener)listener).exitStringExpression(this);
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
			setState(135);
			match(STR);
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StringExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stringExpression);
					setState(137);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(138);
					((StringExpressionContext)_localctx).se = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==NotEqual || _la==Equals) ) {
						((StringExpressionContext)_localctx).se = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(139);
					stringExpression(3);
					}
					} 
				}
				setState(144);
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
	}

	public final Cond_expressnContext cond_expressn() throws RecognitionException {
		Cond_expressnContext _localctx = new Cond_expressnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cond_expressn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__5);
			setState(146);
			booleanExpression(0);
			setState(147);
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
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__7);
			setState(150);
			cond_expressn();
			setState(151);
			match(T__0);
			setState(152);
			body();
			setState(153);
			match(T__1);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(154);
				elseifCondition();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(160);
				elseCondition();
				}
			}

			setState(163);
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
	}

	public final ElseifConditionContext elseifCondition() throws RecognitionException {
		ElseifConditionContext _localctx = new ElseifConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__9);
			setState(166);
			cond_expressn();
			setState(167);
			match(T__0);
			setState(168);
			body();
			setState(169);
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
	}

	public final ElseConditionContext elseCondition() throws RecognitionException {
		ElseConditionContext _localctx = new ElseConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__10);
			setState(172);
			match(T__0);
			setState(173);
			body();
			setState(174);
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
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__11);
			setState(177);
			cond_expressn();
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
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__12);
			setState(183);
			match(T__5);
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(184);
				match(DIGITS);
				}
				break;
			case 2:
				{
				setState(185);
				match(BOOL);
				}
				break;
			case 3:
				{
				setState(186);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(187);
				operator(0);
				}
				break;
			case 5:
				{
				setState(188);
				booleanExpression(0);
				}
				break;
			}
			setState(191);
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
	}

	public final IsEqualtoContext isEqualto() throws RecognitionException {
		IsEqualtoContext _localctx = new IsEqualtoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_isEqualto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean stringExpression_sempred(StringExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\6\3\'\n\3\r\3\16\3(\5\3+\n\3\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\5\58\n\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5F\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6f\n\6\f"+
		"\6\16\6i\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bu\n\b\3\b\3\b"+
		"\5\by\n\b\3\b\5\b|\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0084\n\b\f\b\16\b"+
		"\u0087\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008f\n\t\f\t\16\t\u0092\13\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009e\n\13\f\13\16"+
		"\13\u00a1\13\13\3\13\5\13\u00a4\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00c0\n\17\3\17\3\17\3\20\3\20\3\20\2\5\n\16\20\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2\36\37\3\2\30\31\3\2\32"+
		"\37\3\2\26\27\3\2\24\25\2\u00d5\2 \3\2\2\2\4*\3\2\2\2\6\60\3\2\2\2\bS"+
		"\3\2\2\2\n]\3\2\2\2\fj\3\2\2\2\16{\3\2\2\2\20\u0088\3\2\2\2\22\u0093\3"+
		"\2\2\2\24\u0097\3\2\2\2\26\u00a7\3\2\2\2\30\u00ad\3\2\2\2\32\u00b2\3\2"+
		"\2\2\34\u00b8\3\2\2\2\36\u00c3\3\2\2\2 !\7\3\2\2!\"\5\4\3\2\"#\7\4\2\2"+
		"#\3\3\2\2\2$+\3\2\2\2%\'\5\6\4\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2"+
		"\2\2)+\3\2\2\2*$\3\2\2\2*&\3\2\2\2+\5\3\2\2\2,\61\5\24\13\2-\61\5\32\16"+
		"\2.\61\5\34\17\2/\61\5\b\5\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3"+
		"\2\2\2\61\7\3\2\2\2\62\63\7\5\2\2\63\67\7 \2\2\64\65\5\36\20\2\65\66\5"+
		"\16\b\2\668\3\2\2\2\67\64\3\2\2\2\678\3\2\2\28T\3\2\2\29:\7\6\2\2:>\7"+
		" \2\2;<\5\36\20\2<=\5\n\6\2=?\3\2\2\2>;\3\2\2\2>?\3\2\2\2?T\3\2\2\2@A"+
		"\7\7\2\2AE\7 \2\2BC\5\36\20\2CD\5\20\t\2DF\3\2\2\2EB\3\2\2\2EF\3\2\2\2"+
		"FT\3\2\2\2GH\7 \2\2HI\5\36\20\2IJ\5\16\b\2JT\3\2\2\2KL\7 \2\2LM\5\36\20"+
		"\2MN\5\n\6\2NT\3\2\2\2OP\7 \2\2PQ\5\36\20\2QR\5\20\t\2RT\3\2\2\2S\62\3"+
		"\2\2\2S9\3\2\2\2S@\3\2\2\2SG\3\2\2\2SK\3\2\2\2SO\3\2\2\2T\t\3\2\2\2UV"+
		"\b\6\1\2V^\5\f\7\2WX\7\b\2\2XY\5\n\6\2YZ\7\t\2\2Z^\3\2\2\2[^\7\22\2\2"+
		"\\^\7 \2\2]U\3\2\2\2]W\3\2\2\2][\3\2\2\2]\\\3\2\2\2^g\3\2\2\2_`\f\b\2"+
		"\2`a\t\2\2\2af\5\n\6\tbc\f\7\2\2cd\t\3\2\2df\5\n\6\be_\3\2\2\2eb\3\2\2"+
		"\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\13\3\2\2\2ig\3\2\2\2jk\5\16\b\2kl\t"+
		"\4\2\2lm\5\16\b\2m\r\3\2\2\2no\b\b\1\2op\7\b\2\2pq\5\16\b\2qr\7\t\2\2"+
		"r|\3\2\2\2su\7\25\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2v|\7\21\2\2wy\7\25"+
		"\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7 \2\2{n\3\2\2\2{t\3\2\2\2{x\3\2"+
		"\2\2|\u0085\3\2\2\2}~\f\7\2\2~\177\t\5\2\2\177\u0084\5\16\b\b\u0080\u0081"+
		"\f\6\2\2\u0081\u0082\t\6\2\2\u0082\u0084\5\16\b\7\u0083}\3\2\2\2\u0083"+
		"\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\17\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\t\1\2\u0089\u008a"+
		"\7\23\2\2\u008a\u0090\3\2\2\2\u008b\u008c\f\4\2\2\u008c\u008d\t\2\2\2"+
		"\u008d\u008f\5\20\t\5\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\21\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7\b\2\2\u0094\u0095\5\n\6\2\u0095\u0096\7\t\2\2\u0096\23\3\2\2"+
		"\2\u0097\u0098\7\n\2\2\u0098\u0099\5\22\n\2\u0099\u009a\7\3\2\2\u009a"+
		"\u009b\5\4\3\2\u009b\u009f\7\4\2\2\u009c\u009e\5\26\f\2\u009d\u009c\3"+
		"\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\5\30\r\2\u00a3\u00a2\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\13\2\2\u00a6"+
		"\25\3\2\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\5\22\n\2\u00a9\u00aa\7\3\2"+
		"\2\u00aa\u00ab\5\4\3\2\u00ab\u00ac\7\4\2\2\u00ac\27\3\2\2\2\u00ad\u00ae"+
		"\7\r\2\2\u00ae\u00af\7\3\2\2\u00af\u00b0\5\4\3\2\u00b0\u00b1\7\4\2\2\u00b1"+
		"\31\3\2\2\2\u00b2\u00b3\7\16\2\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\7\3"+
		"\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7\7\4\2\2\u00b7\33\3\2\2\2\u00b8\u00b9"+
		"\7\17\2\2\u00b9\u00bf\7\b\2\2\u00ba\u00c0\7\21\2\2\u00bb\u00c0\7\22\2"+
		"\2\u00bc\u00c0\7 \2\2\u00bd\u00c0\5\16\b\2\u00be\u00c0\5\n\6\2\u00bf\u00ba"+
		"\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\t\2\2\u00c2\35\3\2\2"+
		"\2\u00c3\u00c4\7\20\2\2\u00c4\37\3\2\2\2\25(*\60\67>ES]egtx{\u0083\u0085"+
		"\u0090\u009f\u00a3\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}