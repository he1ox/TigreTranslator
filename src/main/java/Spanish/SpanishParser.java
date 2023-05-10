// Generated from C:/Users/georg/IdeaProjects/TigreTranslator/src\Spanish.g4 by ANTLR 4.12.0
package Spanish;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SpanishParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARTICLE=1, ADJECTIVE=2, NOUN=3, VERB=4, PREPOSITION=5, ADVERB=6, POSSESSIVE_PRONOUN=7, 
		NUMERAL=8, PUNCTUATION=9, WS=10;
	public static final int
		RULE_sentence = 0, RULE_phrase = 1, RULE_nounPhrase = 2, RULE_verbPhrase = 3, 
		RULE_adverbPhrase = 4, RULE_prepositionalPhrase = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentence", "phrase", "nounPhrase", "verbPhrase", "adverbPhrase", "prepositionalPhrase"
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

	@Override
	public String getGrammarFileName() { return "Spanish.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpanishParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SpanishParser.EOF, 0); }
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(SpanishParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(SpanishParser.PUNCTUATION, i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanishVisitor ) return ((SpanishVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 446L) != 0)) {
				{
				setState(12);
				phrase();
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUNCTUATION) {
					{
					{
					setState(13);
					match(PUNCTUATION);
					setState(14);
					phrase();
					}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(22);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PhraseContext extends ParserRuleContext {
		public List<NounPhraseContext> nounPhrase() {
			return getRuleContexts(NounPhraseContext.class);
		}
		public NounPhraseContext nounPhrase(int i) {
			return getRuleContext(NounPhraseContext.class,i);
		}
		public List<VerbPhraseContext> verbPhrase() {
			return getRuleContexts(VerbPhraseContext.class);
		}
		public VerbPhraseContext verbPhrase(int i) {
			return getRuleContext(VerbPhraseContext.class,i);
		}
		public List<PrepositionalPhraseContext> prepositionalPhrase() {
			return getRuleContexts(PrepositionalPhraseContext.class);
		}
		public PrepositionalPhraseContext prepositionalPhrase(int i) {
			return getRuleContext(PrepositionalPhraseContext.class,i);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).exitPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanishVisitor ) return ((SpanishVisitor<? extends T>)visitor).visitPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_phrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(27);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ARTICLE:
				case ADJECTIVE:
				case NOUN:
				case POSSESSIVE_PRONOUN:
				case NUMERAL:
					{
					setState(24);
					nounPhrase();
					}
					break;
				case VERB:
					{
					setState(25);
					verbPhrase();
					}
					break;
				case PREPOSITION:
					{
					setState(26);
					prepositionalPhrase();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 446L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class NounPhraseContext extends ParserRuleContext {
		public TerminalNode NOUN() { return getToken(SpanishParser.NOUN, 0); }
		public TerminalNode ARTICLE() { return getToken(SpanishParser.ARTICLE, 0); }
		public TerminalNode POSSESSIVE_PRONOUN() { return getToken(SpanishParser.POSSESSIVE_PRONOUN, 0); }
		public List<TerminalNode> ADJECTIVE() { return getTokens(SpanishParser.ADJECTIVE); }
		public TerminalNode ADJECTIVE(int i) {
			return getToken(SpanishParser.ADJECTIVE, i);
		}
		public List<TerminalNode> NUMERAL() { return getTokens(SpanishParser.NUMERAL); }
		public TerminalNode NUMERAL(int i) {
			return getToken(SpanishParser.NUMERAL, i);
		}
		public NounPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).enterNounPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).exitNounPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanishVisitor ) return ((SpanishVisitor<? extends T>)visitor).visitNounPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounPhraseContext nounPhrase() throws RecognitionException {
		NounPhraseContext _localctx = new NounPhraseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nounPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARTICLE || _la==POSSESSIVE_PRONOUN) {
				{
				setState(31);
				_la = _input.LA(1);
				if ( !(_la==ARTICLE || _la==POSSESSIVE_PRONOUN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADJECTIVE || _la==NUMERAL) {
				{
				{
				setState(34);
				_la = _input.LA(1);
				if ( !(_la==ADJECTIVE || _la==NUMERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(NOUN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VerbPhraseContext extends ParserRuleContext {
		public TerminalNode VERB() { return getToken(SpanishParser.VERB, 0); }
		public List<AdverbPhraseContext> adverbPhrase() {
			return getRuleContexts(AdverbPhraseContext.class);
		}
		public AdverbPhraseContext adverbPhrase(int i) {
			return getRuleContext(AdverbPhraseContext.class,i);
		}
		public List<PrepositionalPhraseContext> prepositionalPhrase() {
			return getRuleContexts(PrepositionalPhraseContext.class);
		}
		public PrepositionalPhraseContext prepositionalPhrase(int i) {
			return getRuleContext(PrepositionalPhraseContext.class,i);
		}
		public VerbPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).enterVerbPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).exitVerbPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanishVisitor ) return ((SpanishVisitor<? extends T>)visitor).visitVerbPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbPhraseContext verbPhrase() throws RecognitionException {
		VerbPhraseContext _localctx = new VerbPhraseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_verbPhrase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(VERB);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(45);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADVERB:
						{
						setState(43);
						adverbPhrase();
						}
						break;
					case PREPOSITION:
						{
						setState(44);
						prepositionalPhrase();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdverbPhraseContext extends ParserRuleContext {
		public TerminalNode ADVERB() { return getToken(SpanishParser.ADVERB, 0); }
		public AdverbPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adverbPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).enterAdverbPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).exitAdverbPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanishVisitor ) return ((SpanishVisitor<? extends T>)visitor).visitAdverbPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdverbPhraseContext adverbPhrase() throws RecognitionException {
		AdverbPhraseContext _localctx = new AdverbPhraseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_adverbPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ADVERB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrepositionalPhraseContext extends ParserRuleContext {
		public TerminalNode PREPOSITION() { return getToken(SpanishParser.PREPOSITION, 0); }
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public PrepositionalPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepositionalPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).enterPrepositionalPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).exitPrepositionalPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanishVisitor ) return ((SpanishVisitor<? extends T>)visitor).visitPrepositionalPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrepositionalPhraseContext prepositionalPhrase() throws RecognitionException {
		PrepositionalPhraseContext _localctx = new PrepositionalPhraseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_prepositionalPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(PREPOSITION);
			setState(53);
			nounPhrase();
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

	public static final String _serializedATN =
		"\u0004\u0001\n8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0003\u0000\u0015\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001c"+
		"\b\u0001\u000b\u0001\f\u0001\u001d\u0001\u0002\u0003\u0002!\b\u0002\u0001"+
		"\u0002\u0005\u0002$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003.\b\u0003\n\u0003"+
		"\f\u00031\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
		"\u0002\u0002\u0000\u0001\u0001\u0007\u0007\u0002\u0000\u0002\u0002\b\b"+
		":\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000"+
		"\u0004 \u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b2\u0001"+
		"\u0000\u0000\u0000\n4\u0001\u0000\u0000\u0000\f\u0011\u0003\u0002\u0001"+
		"\u0000\r\u000e\u0005\t\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000"+
		"\u000f\r\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011"+
		"\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012"+
		"\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014"+
		"\f\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0000\u0000\u0001\u0017\u0001"+
		"\u0001\u0000\u0000\u0000\u0018\u001c\u0003\u0004\u0002\u0000\u0019\u001c"+
		"\u0003\u0006\u0003\u0000\u001a\u001c\u0003\n\u0005\u0000\u001b\u0018\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0003\u0001"+
		"\u0000\u0000\u0000\u001f!\u0007\u0000\u0000\u0000 \u001f\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!%\u0001\u0000\u0000\u0000\"$\u0007\u0001"+
		"\u0000\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000()\u0005\u0003\u0000\u0000)\u0005\u0001\u0000"+
		"\u0000\u0000*/\u0005\u0004\u0000\u0000+.\u0003\b\u0004\u0000,.\u0003\n"+
		"\u0005\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"0\u0007\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u0006"+
		"\u0000\u00003\t\u0001\u0000\u0000\u000045\u0005\u0005\u0000\u000056\u0003"+
		"\u0004\u0002\u00006\u000b\u0001\u0000\u0000\u0000\b\u0011\u0014\u001b"+
		"\u001d %-/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}