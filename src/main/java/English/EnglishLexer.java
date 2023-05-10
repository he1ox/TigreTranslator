// Generated from C:/Users/georg/IdeaProjects/TigreTranslator/src\English.g4 by ANTLR 4.12.0
package English;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EnglishLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARTICLE=1, ADJECTIVE=2, NOUN=3, VERB=4, PREPOSITION=5, ADVERB=6, POSSESSIVE_PRONOUN=7, 
		NUMERAL=8, PUNCTUATION=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARTICLE", "ADJECTIVE", "NOUN", "VERB", "PREPOSITION", "ADVERB", "POSSESSIVE_PRONOUN", 
			"NUMERAL", "PUNCTUATION", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARTICLE", "ADJECTIVE", "NOUN", "VERB", "PREPOSITION", "ADVERB", 
			"POSSESSIVE_PRONOUN", "NUMERAL", "PUNCTUATION", "WS"
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


	public EnglishLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "English.g4"; }

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
		"\u0004\u0000\n\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001c\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002F\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003T\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005{\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0089"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009a\b\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0004\t\u009f\b\t\u000b\t\f\t\u00a0\u0001\t\u0001\t"+
		"\u0000\u0000\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0001\u0000\u0002\u0003\u0000"+
		",,..;;\u0003\u0000\t\n\r\r  \u00bc\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003.\u0001"+
		"\u0000\u0000\u0000\u0005E\u0001\u0000\u0000\u0000\u0007S\u0001\u0000\u0000"+
		"\u0000\ta\u0001\u0000\u0000\u0000\u000bz\u0001\u0000\u0000\u0000\r\u0088"+
		"\u0001\u0000\u0000\u0000\u000f\u0099\u0001\u0000\u0000\u0000\u0011\u009b"+
		"\u0001\u0000\u0000\u0000\u0013\u009e\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0005t\u0000\u0000\u0016\u0017\u0005h\u0000\u0000\u0017\u001c\u0005e"+
		"\u0000\u0000\u0018\u001c\u0005a\u0000\u0000\u0019\u001a\u0005a\u0000\u0000"+
		"\u001a\u001c\u0005n\u0000\u0000\u001b\u0015\u0001\u0000\u0000\u0000\u001b"+
		"\u0018\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c"+
		"\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005b\u0000\u0000\u001e\u001f"+
		"\u0005i\u0000\u0000\u001f/\u0005g\u0000\u0000 !\u0005s\u0000\u0000!\""+
		"\u0005m\u0000\u0000\"#\u0005a\u0000\u0000#$\u0005l\u0000\u0000$/\u0005"+
		"l\u0000\u0000%&\u0005t\u0000\u0000&\'\u0005a\u0000\u0000\'(\u0005l\u0000"+
		"\u0000(/\u0005l\u0000\u0000)*\u0005s\u0000\u0000*+\u0005h\u0000\u0000"+
		"+,\u0005o\u0000\u0000,-\u0005r\u0000\u0000-/\u0005t\u0000\u0000.\u001d"+
		"\u0001\u0000\u0000\u0000. \u0001\u0000\u0000\u0000.%\u0001\u0000\u0000"+
		"\u0000.)\u0001\u0000\u0000\u0000/\u0004\u0001\u0000\u0000\u000001\u0005"+
		"d\u0000\u000012\u0005o\u0000\u00002F\u0005g\u0000\u000034\u0005c\u0000"+
		"\u000045\u0005a\u0000\u00005F\u0005t\u0000\u000067\u0005b\u0000\u0000"+
		"78\u0005i\u0000\u000089\u0005r\u0000\u00009F\u0005d\u0000\u0000:;\u0005"+
		"h\u0000\u0000;<\u0005o\u0000\u0000<=\u0005u\u0000\u0000=>\u0005s\u0000"+
		"\u0000>F\u0005e\u0000\u0000?@\u0005s\u0000\u0000@A\u0005t\u0000\u0000"+
		"AB\u0005r\u0000\u0000BC\u0005e\u0000\u0000CD\u0005e\u0000\u0000DF\u0005"+
		"t\u0000\u0000E0\u0001\u0000\u0000\u0000E3\u0001\u0000\u0000\u0000E6\u0001"+
		"\u0000\u0000\u0000E:\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000"+
		"F\u0006\u0001\u0000\u0000\u0000GH\u0005r\u0000\u0000HI\u0005u\u0000\u0000"+
		"IT\u0005n\u0000\u0000JK\u0005j\u0000\u0000KL\u0005u\u0000\u0000LM\u0005"+
		"m\u0000\u0000MT\u0005p\u0000\u0000NO\u0005f\u0000\u0000OP\u0005l\u0000"+
		"\u0000PT\u0005y\u0000\u0000QR\u0005i\u0000\u0000RT\u0005s\u0000\u0000"+
		"SG\u0001\u0000\u0000\u0000SJ\u0001\u0000\u0000\u0000SN\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000T\b\u0001\u0000\u0000\u0000UV\u0005i\u0000"+
		"\u0000Vb\u0005n\u0000\u0000WX\u0005o\u0000\u0000Xb\u0005n\u0000\u0000"+
		"YZ\u0005a\u0000\u0000Zb\u0005t\u0000\u0000[\\\u0005o\u0000\u0000\\]\u0005"+
		"v\u0000\u0000]^\u0005e\u0000\u0000^b\u0005r\u0000\u0000_`\u0005b\u0000"+
		"\u0000`b\u0005y\u0000\u0000aU\u0001\u0000\u0000\u0000aW\u0001\u0000\u0000"+
		"\u0000aY\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000b\n\u0001\u0000\u0000\u0000cd\u0005q\u0000\u0000de\u0005u"+
		"\u0000\u0000ef\u0005i\u0000\u0000fg\u0005c\u0000\u0000gh\u0005k\u0000"+
		"\u0000hi\u0005l\u0000\u0000i{\u0005y\u0000\u0000jk\u0005s\u0000\u0000"+
		"kl\u0005l\u0000\u0000lm\u0005o\u0000\u0000mn\u0005w\u0000\u0000no\u0005"+
		"l\u0000\u0000o{\u0005y\u0000\u0000pq\u0005g\u0000\u0000qr\u0005r\u0000"+
		"\u0000rs\u0005a\u0000\u0000st\u0005c\u0000\u0000tu\u0005e\u0000\u0000"+
		"uv\u0005f\u0000\u0000vw\u0005u\u0000\u0000wx\u0005l\u0000\u0000xy\u0005"+
		"l\u0000\u0000y{\u0005y\u0000\u0000zc\u0001\u0000\u0000\u0000zj\u0001\u0000"+
		"\u0000\u0000zp\u0001\u0000\u0000\u0000{\f\u0001\u0000\u0000\u0000|}\u0005"+
		"m\u0000\u0000}\u0089\u0005y\u0000\u0000~\u007f\u0005y\u0000\u0000\u007f"+
		"\u0080\u0005o\u0000\u0000\u0080\u0081\u0005u\u0000\u0000\u0081\u0089\u0005"+
		"r\u0000\u0000\u0082\u0083\u0005h\u0000\u0000\u0083\u0084\u0005i\u0000"+
		"\u0000\u0084\u0089\u0005s\u0000\u0000\u0085\u0086\u0005h\u0000\u0000\u0086"+
		"\u0087\u0005e\u0000\u0000\u0087\u0089\u0005r\u0000\u0000\u0088|\u0001"+
		"\u0000\u0000\u0000\u0088~\u0001\u0000\u0000\u0000\u0088\u0082\u0001\u0000"+
		"\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0089\u000e\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005o\u0000\u0000\u008b\u008c\u0005n\u0000\u0000"+
		"\u008c\u009a\u0005e\u0000\u0000\u008d\u008e\u0005t\u0000\u0000\u008e\u008f"+
		"\u0005w\u0000\u0000\u008f\u009a\u0005o\u0000\u0000\u0090\u0091\u0005t"+
		"\u0000\u0000\u0091\u0092\u0005h\u0000\u0000\u0092\u0093\u0005r\u0000\u0000"+
		"\u0093\u0094\u0005e\u0000\u0000\u0094\u009a\u0005e\u0000\u0000\u0095\u0096"+
		"\u0005f\u0000\u0000\u0096\u0097\u0005o\u0000\u0000\u0097\u0098\u0005u"+
		"\u0000\u0000\u0098\u009a\u0005r\u0000\u0000\u0099\u008a\u0001\u0000\u0000"+
		"\u0000\u0099\u008d\u0001\u0000\u0000\u0000\u0099\u0090\u0001\u0000\u0000"+
		"\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u009a\u0010\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0007\u0000\u0000\u0000\u009c\u0012\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0007\u0001\u0000\u0000\u009e\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0006\t\u0000\u0000\u00a3\u0014\u0001\u0000\u0000\u0000"+
		"\n\u0000\u001b.ESaz\u0088\u0099\u00a0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}