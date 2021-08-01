// Generated from FracLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FracLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, STRING=13, Number=14, ID=15, WS=16, COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "STRING", "Number", "ID", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'<='", "'display'", "'('", "')'", "'*'", "':'", "'+'", 
			"'-'", "'/'", "'read'", "'reduce'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "Number", "ID", "WS", "COMMENT"
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


	public FracLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FracLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16O\n\16\f\16\16\16R\13\16\3\16\3\16\3"+
		"\17\6\17W\n\17\r\17\16\17X\3\20\6\20\\\n\20\r\20\16\20]\3\21\6\21a\n\21"+
		"\r\21\16\21b\3\21\3\21\3\22\3\22\3\22\3\22\7\22k\n\22\f\22\16\22n\13\22"+
		"\3\22\3\22\3\22\3\22\4Pl\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\5\3\2\62;\3\2c|\5\2\13"+
		"\f\17\17\"\"\2w\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7*\3\2\2\2\t\62\3\2\2\2\13\64"+
		"\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2"+
		"\27@\3\2\2\2\31E\3\2\2\2\33L\3\2\2\2\35V\3\2\2\2\37[\3\2\2\2!`\3\2\2\2"+
		"#f\3\2\2\2%&\7=\2\2&\4\3\2\2\2\'(\7>\2\2()\7?\2\2)\6\3\2\2\2*+\7f\2\2"+
		"+,\7k\2\2,-\7u\2\2-.\7r\2\2./\7n\2\2/\60\7c\2\2\60\61\7{\2\2\61\b\3\2"+
		"\2\2\62\63\7*\2\2\63\n\3\2\2\2\64\65\7+\2\2\65\f\3\2\2\2\66\67\7,\2\2"+
		"\67\16\3\2\2\289\7<\2\29\20\3\2\2\2:;\7-\2\2;\22\3\2\2\2<=\7/\2\2=\24"+
		"\3\2\2\2>?\7\61\2\2?\26\3\2\2\2@A\7t\2\2AB\7g\2\2BC\7c\2\2CD\7f\2\2D\30"+
		"\3\2\2\2EF\7t\2\2FG\7g\2\2GH\7f\2\2HI\7w\2\2IJ\7e\2\2JK\7g\2\2K\32\3\2"+
		"\2\2LP\7$\2\2MO\13\2\2\2NM\3\2\2\2OR\3\2\2\2PQ\3\2\2\2PN\3\2\2\2QS\3\2"+
		"\2\2RP\3\2\2\2ST\7$\2\2T\34\3\2\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3"+
		"\2\2\2XY\3\2\2\2Y\36\3\2\2\2Z\\\t\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2"+
		"]^\3\2\2\2^ \3\2\2\2_a\t\4\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2"+
		"cd\3\2\2\2de\b\21\2\2e\"\3\2\2\2fg\7/\2\2gh\7/\2\2hl\3\2\2\2ik\13\2\2"+
		"\2ji\3\2\2\2kn\3\2\2\2lm\3\2\2\2lj\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\f\2"+
		"\2pq\3\2\2\2qr\b\22\2\2r$\3\2\2\2\b\2PX]bl\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}