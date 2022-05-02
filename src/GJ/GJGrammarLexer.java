package GJ;

// Generated from GJGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GJGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "DIGITS", "BOOL", "STR", 
			"ADDITION", "SUBTRACTION", "MULTIPLY", "DIVIDE", "AND", "OR", "Lessthan", 
			"GreaterThan", "LessEqual", "GreaterEqual", "NotEqual", "Equals", "QUESTIONMARK", 
			"COLON", "IDENTIFIER", "WS", "Comment"
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


	public GJGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GJGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\7\20\u0082"+
		"\n\20\f\20\16\20\u0085\13\20\3\20\5\20\u0088\n\20\3\21\3\21\3\21\3\21"+
		"\5\21\u008e\n\21\3\22\3\22\7\22\u0092\n\22\f\22\16\22\u0095\13\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\7!\u00be\n!\f!\16!\u00c1\13"+
		"!\3\"\6\"\u00c4\n\"\r\"\16\"\u00c5\3\"\3\"\3#\3#\3#\3#\7#\u00ce\n#\f#"+
		"\16#\u00d1\13#\3#\3#\3#\3#\7#\u00d7\n#\f#\16#\u00da\13#\3#\3#\5#\u00de"+
		"\n#\3#\3#\3\u00d8\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$\3\2\t\3\2\63;\3\2\62;\5\2\62;C\\c|\5\2"+
		"C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00e9\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I"+
		"\3\2\2\2\7K\3\2\2\2\tO\3\2\2\2\13T\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21"+
		"^\3\2\2\2\23a\3\2\2\2\25e\3\2\2\2\27m\3\2\2\2\31q\3\2\2\2\33w\3\2\2\2"+
		"\35}\3\2\2\2\37\u0087\3\2\2\2!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0099\3\2"+
		"\2\2\'\u009b\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2-\u00a1\3\2\2\2/\u00a4"+
		"\3\2\2\2\61\u00a7\3\2\2\2\63\u00a9\3\2\2\2\65\u00ab\3\2\2\2\67\u00ae\3"+
		"\2\2\29\u00b1\3\2\2\2;\u00b4\3\2\2\2=\u00b7\3\2\2\2?\u00b9\3\2\2\2A\u00bb"+
		"\3\2\2\2C\u00c3\3\2\2\2E\u00dd\3\2\2\2GH\7}\2\2H\4\3\2\2\2IJ\7\177\2\2"+
		"J\6\3\2\2\2KL\7c\2\2LM\7p\2\2MN\7m\2\2N\b\3\2\2\2OP\7v\2\2PQ\7c\2\2QR"+
		"\7t\2\2RS\7m\2\2S\n\3\2\2\2TU\7x\2\2UV\7c\2\2VW\7m\2\2WX\7{\2\2XY\7c\2"+
		"\2Y\f\3\2\2\2Z[\7*\2\2[\16\3\2\2\2\\]\7+\2\2]\20\3\2\2\2^_\7l\2\2_`\7"+
		"q\2\2`\22\3\2\2\2ab\7d\2\2bc\7c\2\2cd\7u\2\2d\24\3\2\2\2ef\7p\2\2fg\7"+
		"c\2\2gh\7j\2\2hi\7k\2\2ij\7v\2\2jk\7q\2\2kl\7j\2\2l\26\3\2\2\2mn\7v\2"+
		"\2no\7q\2\2op\7j\2\2p\30\3\2\2\2qr\7u\2\2rs\7w\2\2st\7f\2\2tu\7j\2\2u"+
		"v\7k\2\2v\32\3\2\2\2wx\7d\2\2xy\7c\2\2yz\7v\2\2z{\7c\2\2{|\7x\2\2|\34"+
		"\3\2\2\2}~\7?\2\2~\36\3\2\2\2\177\u0083\t\2\2\2\u0080\u0082\t\3\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0088\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\62\2\2\u0087"+
		"\177\3\2\2\2\u0087\u0086\3\2\2\2\u0088 \3\2\2\2\u0089\u008a\7J\2\2\u008a"+
		"\u008e\7c\2\2\u008b\u008c\7P\2\2\u008c\u008e\7c\2\2\u008d\u0089\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008e\"\3\2\2\2\u008f\u0093\7$\2\2\u0090\u0092"+
		"\t\4\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7$"+
		"\2\2\u0097\u0098\7\f\2\2\u0098$\3\2\2\2\u0099\u009a\7-\2\2\u009a&\3\2"+
		"\2\2\u009b\u009c\7/\2\2\u009c(\3\2\2\2\u009d\u009e\7,\2\2\u009e*\3\2\2"+
		"\2\u009f\u00a0\7\61\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7(\2\2\u00a2\u00a3"+
		"\7(\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7~\2\2\u00a5\u00a6\7~\2\2\u00a6\60"+
		"\3\2\2\2\u00a7\u00a8\7>\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa"+
		"\64\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\7?\2\2\u00ad\66\3\2\2\2\u00ae"+
		"\u00af\7@\2\2\u00af\u00b0\7?\2\2\u00b08\3\2\2\2\u00b1\u00b2\7#\2\2\u00b2"+
		"\u00b3\7?\2\2\u00b3:\3\2\2\2\u00b4\u00b5\7?\2\2\u00b5\u00b6\7?\2\2\u00b6"+
		"<\3\2\2\2\u00b7\u00b8\7A\2\2\u00b8>\3\2\2\2\u00b9\u00ba\7<\2\2\u00ba@"+
		"\3\2\2\2\u00bb\u00bf\t\5\2\2\u00bc\u00be\t\6\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0B\3\2\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c2\u00c4\t\7\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\b\"\2\2\u00c8D\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7\61\2"+
		"\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\n\b\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00de\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\7,\2\2\u00d4\u00d8\3\2"+
		"\2\2\u00d5\u00d7\13\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00dc\7,\2\2\u00dc\u00de\7\61\2\2\u00dd\u00c9\3\2\2\2\u00dd"+
		"\u00d2\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b#\2\2\u00e0F\3\2\2\2\f"+
		"\2\u0083\u0087\u008d\u0093\u00bf\u00c5\u00cf\u00d8\u00dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}