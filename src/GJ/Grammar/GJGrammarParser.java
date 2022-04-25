// Generated from GJGrammar.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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
		public Token bop;
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUESTIONMARK() { return getToken(GJGrammarParser.QUESTIONMARK, 0); }
		public TerminalNode COLON() { return getToken(GJGrammarParser.COLON, 0); }
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
						_localctx = new OperatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operator);
						setState(123);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
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
						operator(7);
						}
						break;
					case 2:
						{
						_localctx = new OperatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operator);
						setState(126);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
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
						operator(6);
						}
						break;
					case 3:
						{
						_localctx = new OperatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operator);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
						((OperatorContext)_localctx).op = match(QUESTIONMARK);
						setState(131);
						expr();
						setState(132);
						((OperatorContext)_localctx).bop = match(COLON);
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
					_localctx = new StringExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stringExpression);
					setState(143);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(144);
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
		"\u0004\u0001\"\u00ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001%\b\u0001"+
		"\u000b\u0001\f\u0001&\u0003\u0001)\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003D\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003R\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\\\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004d\b\u0004\n\u0004\f\u0004g\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006w\b\u0006\u0001\u0006\u0003\u0006z\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0088\b\u0006\n\u0006\f\u0006\u008b\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0093\b\u0007\n"+
		"\u0007\f\u0007\u0096\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a2\b\t\n\t\f\t\u00a5\t\t"+
		"\u0001\t\u0003\t\u00a8\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c4\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0003\b\f\u000e\u000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u0000\u0005\u0001\u0000\u001c\u001d\u0001\u0000\u0016\u0017\u0001\u0000"+
		"\u0018\u001d\u0001\u0000\u0014\u0015\u0001\u0000\u0012\u0013\u00da\u0000"+
		"\u001e\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004.\u0001"+
		"\u0000\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000"+
		"\u0000\nh\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000\u000e\u008c"+
		"\u0001\u0000\u0000\u0000\u0010\u0097\u0001\u0000\u0000\u0000\u0012\u009b"+
		"\u0001\u0000\u0000\u0000\u0014\u00ab\u0001\u0000\u0000\u0000\u0016\u00b1"+
		"\u0001\u0000\u0000\u0000\u0018\u00b6\u0001\u0000\u0000\u0000\u001a\u00bc"+
		"\u0001\u0000\u0000\u0000\u001c\u00c7\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005\u0001\u0000\u0000\u001f \u0003\u0002\u0001\u0000 !\u0005\u0002"+
		"\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\")\u0001\u0000\u0000\u0000"+
		"#%\u0003\u0004\u0002\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000"+
		"\u0000\u0000(\"\u0001\u0000\u0000\u0000($\u0001\u0000\u0000\u0000)\u0003"+
		"\u0001\u0000\u0000\u0000*/\u0003\u0012\t\u0000+/\u0003\u0018\f\u0000,"+
		"/\u0003\u001a\r\u0000-/\u0003\u0006\u0003\u0000.*\u0001\u0000\u0000\u0000"+
		".+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000"+
		"\u0000/\u0005\u0001\u0000\u0000\u000001\u0005\u0003\u0000\u000015\u0005"+
		" \u0000\u000023\u0003\u001c\u000e\u000034\u0003\f\u0006\u000046\u0001"+
		"\u0000\u0000\u000052\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6R\u0001\u0000\u0000\u000078\u0005\u0004\u0000\u00008<\u0005 \u0000\u0000"+
		"9:\u0003\u001c\u000e\u0000:;\u0003\b\u0004\u0000;=\u0001\u0000\u0000\u0000"+
		"<9\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=R\u0001\u0000\u0000"+
		"\u0000>?\u0005\u0005\u0000\u0000?C\u0005 \u0000\u0000@A\u0003\u001c\u000e"+
		"\u0000AB\u0003\u000e\u0007\u0000BD\u0001\u0000\u0000\u0000C@\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DR\u0001\u0000\u0000\u0000EF\u0005"+
		" \u0000\u0000FG\u0003\u001c\u000e\u0000GH\u0003\f\u0006\u0000HR\u0001"+
		"\u0000\u0000\u0000IJ\u0005 \u0000\u0000JK\u0003\u001c\u000e\u0000KL\u0003"+
		"\b\u0004\u0000LR\u0001\u0000\u0000\u0000MN\u0005 \u0000\u0000NO\u0003"+
		"\u001c\u000e\u0000OP\u0003\u000e\u0007\u0000PR\u0001\u0000\u0000\u0000"+
		"Q0\u0001\u0000\u0000\u0000Q7\u0001\u0000\u0000\u0000Q>\u0001\u0000\u0000"+
		"\u0000QE\u0001\u0000\u0000\u0000QI\u0001\u0000\u0000\u0000QM\u0001\u0000"+
		"\u0000\u0000R\u0007\u0001\u0000\u0000\u0000ST\u0006\u0004\uffff\uffff"+
		"\u0000T\\\u0003\n\u0005\u0000UV\u0005\u0006\u0000\u0000VW\u0003\b\u0004"+
		"\u0000WX\u0005\u0007\u0000\u0000X\\\u0001\u0000\u0000\u0000Y\\\u0005\u0010"+
		"\u0000\u0000Z\\\u0005 \u0000\u0000[S\u0001\u0000\u0000\u0000[U\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\e\u0001"+
		"\u0000\u0000\u0000]^\n\u0006\u0000\u0000^_\u0007\u0000\u0000\u0000_d\u0003"+
		"\b\u0004\u0007`a\n\u0005\u0000\u0000ab\u0007\u0001\u0000\u0000bd\u0003"+
		"\b\u0004\u0006c]\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000dg\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"f\t\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0003\f\u0006"+
		"\u0000ij\u0007\u0002\u0000\u0000jk\u0003\f\u0006\u0000k\u000b\u0001\u0000"+
		"\u0000\u0000lm\u0006\u0006\uffff\uffff\u0000mn\u0005\u0006\u0000\u0000"+
		"no\u0003\f\u0006\u0000op\u0005\u0007\u0000\u0000pz\u0001\u0000\u0000\u0000"+
		"qs\u0005\u0013\u0000\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tz\u0005\u000f\u0000\u0000uw\u0005\u0013"+
		"\u0000\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xz\u0005 \u0000\u0000yl\u0001\u0000\u0000\u0000yr\u0001"+
		"\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000z\u0089\u0001\u0000\u0000"+
		"\u0000{|\n\u0006\u0000\u0000|}\u0007\u0003\u0000\u0000}\u0088\u0003\f"+
		"\u0006\u0007~\u007f\n\u0005\u0000\u0000\u007f\u0080\u0007\u0004\u0000"+
		"\u0000\u0080\u0088\u0003\f\u0006\u0006\u0081\u0082\n\u0003\u0000\u0000"+
		"\u0082\u0083\u0005\u001e\u0000\u0000\u0083\u0084\u0003\u0006\u0003\u0000"+
		"\u0084\u0085\u0005\u001f\u0000\u0000\u0085\u0086\u0003\u0006\u0003\u0000"+
		"\u0086\u0088\u0001\u0000\u0000\u0000\u0087{\u0001\u0000\u0000\u0000\u0087"+
		"~\u0001\u0000\u0000\u0000\u0087\u0081\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\r\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0006\u0007\uffff\uffff\u0000\u008d\u008e"+
		"\u0005\u0011\u0000\u0000\u008e\u0094\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\n\u0002\u0000\u0000\u0090\u0091\u0007\u0000\u0000\u0000\u0091\u0093\u0003"+
		"\u000e\u0007\u0003\u0092\u008f\u0001\u0000\u0000\u0000\u0093\u0096\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u000f\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005\u0006\u0000\u0000\u0098\u0099\u0003"+
		"\b\u0004\u0000\u0099\u009a\u0005\u0007\u0000\u0000\u009a\u0011\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005\b\u0000\u0000\u009c\u009d\u0003\u0010\b"+
		"\u0000\u009d\u009e\u0005\u0001\u0000\u0000\u009e\u009f\u0003\u0002\u0001"+
		"\u0000\u009f\u00a3\u0005\u0002\u0000\u0000\u00a0\u00a2\u0003\u0014\n\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a8\u0003\u0016\u000b\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005\t\u0000\u0000\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\n\u0000\u0000\u00ac\u00ad\u0003\u0010\b\u0000\u00ad\u00ae"+
		"\u0005\u0001\u0000\u0000\u00ae\u00af\u0003\u0002\u0001\u0000\u00af\u00b0"+
		"\u0005\u0002\u0000\u0000\u00b0\u0015\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005\u000b\u0000\u0000\u00b2\u00b3\u0005\u0001\u0000\u0000\u00b3\u00b4"+
		"\u0003\u0002\u0001\u0000\u00b4\u00b5\u0005\u0002\u0000\u0000\u00b5\u0017"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\f\u0000\u0000\u00b7\u00b8\u0003"+
		"\u0010\b\u0000\u00b8\u00b9\u0005\u0001\u0000\u0000\u00b9\u00ba\u0003\u0002"+
		"\u0001\u0000\u00ba\u00bb\u0005\u0002\u0000\u0000\u00bb\u0019\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\r\u0000\u0000\u00bd\u00c3\u0005\u0006\u0000"+
		"\u0000\u00be\u00c4\u0005\u000f\u0000\u0000\u00bf\u00c4\u0005\u0010\u0000"+
		"\u0000\u00c0\u00c4\u0005 \u0000\u0000\u00c1\u00c4\u0003\f\u0006\u0000"+
		"\u00c2\u00c4\u0003\b\u0004\u0000\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0007\u0000\u0000\u00c6"+
		"\u001b\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u000e\u0000\u0000\u00c8"+
		"\u001d\u0001\u0000\u0000\u0000\u0013&(.5<CQ[cervy\u0087\u0089\u0094\u00a3"+
		"\u00a7\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}