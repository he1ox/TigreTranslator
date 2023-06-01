// Generated from C:/Users/click/Documents/JS_Scripts/TigreTranslator/src\Spanish.g4 by ANTLR 4.12.0
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
		DETERM=1, ARTICLE=2, POSSESSIVE_PRONOUN=3, ADJETIVE=4, NUMERAL=5, NOUN=6, 
		PRONOUN=7, VERB=8, ADVERB=9, PREPOSITION=10, CONJUCTION=11, INTERJECTION=12, 
		PUNTUATION=13, WS=14;
	public static final int
		RULE_sentence = 0, RULE_phrase = 1, RULE_nounPhrase = 2, RULE_verbPhrase = 3, 
		RULE_prepositionalPhrase = 4, RULE_conjunctionPhrase = 5, RULE_interjectionPhrase = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentence", "phrase", "nounPhrase", "verbPhrase", "prepositionalPhrase", 
			"conjunctionPhrase", "interjectionPhrase"
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
			null, "DETERM", "ARTICLE", "POSSESSIVE_PRONOUN", "ADJETIVE", "NUMERAL", 
			"NOUN", "PRONOUN", "VERB", "ADVERB", "PREPOSITION", "CONJUCTION", "INTERJECTION", 
			"PUNTUATION", "WS"
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
		public List<TerminalNode> PUNTUATION() { return getTokens(SpanishParser.PUNTUATION); }
		public TerminalNode PUNTUATION(int i) {
			return getToken(SpanishParser.PUNTUATION, i);
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16366L) != 0)) {
				{
				setState(14);
				phrase();
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(15);
					match(PUNTUATION);
					setState(16);
					phrase();
					}
					}
					setState(19); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PUNTUATION );
				}
			}

			setState(23);
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
		public List<ConjunctionPhraseContext> conjunctionPhrase() {
			return getRuleContexts(ConjunctionPhraseContext.class);
		}
		public ConjunctionPhraseContext conjunctionPhrase(int i) {
			return getRuleContext(ConjunctionPhraseContext.class,i);
		}
		public List<InterjectionPhraseContext> interjectionPhrase() {
			return getRuleContexts(InterjectionPhraseContext.class);
		}
		public InterjectionPhraseContext interjectionPhrase(int i) {
			return getRuleContext(InterjectionPhraseContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(30);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(25);
						nounPhrase();
						}
						break;
					case 2:
						{
						setState(26);
						verbPhrase();
						}
						break;
					case 3:
						{
						setState(27);
						prepositionalPhrase();
						}
						break;
					case 4:
						{
						setState(28);
						conjunctionPhrase();
						}
						break;
					case 5:
						{
						setState(29);
						interjectionPhrase();
						}
						break;
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class NounPhraseContext extends ParserRuleContext {
		public TerminalNode DETERM() { return getToken(SpanishParser.DETERM, 0); }
		public TerminalNode ARTICLE() { return getToken(SpanishParser.ARTICLE, 0); }
		public TerminalNode POSSESSIVE_PRONOUN() { return getToken(SpanishParser.POSSESSIVE_PRONOUN, 0); }
		public TerminalNode PRONOUN() { return getToken(SpanishParser.PRONOUN, 0); }
		public List<TerminalNode> NUMERAL() { return getTokens(SpanishParser.NUMERAL); }
		public TerminalNode NUMERAL(int i) {
			return getToken(SpanishParser.NUMERAL, i);
		}
		public List<TerminalNode> ADVERB() { return getTokens(SpanishParser.ADVERB); }
		public TerminalNode ADVERB(int i) {
			return getToken(SpanishParser.ADVERB, i);
		}
		public List<TerminalNode> NOUN() { return getTokens(SpanishParser.NOUN); }
		public TerminalNode NOUN(int i) {
			return getToken(SpanishParser.NOUN, i);
		}
		public List<TerminalNode> VERB() { return getTokens(SpanishParser.VERB); }
		public TerminalNode VERB(int i) {
			return getToken(SpanishParser.VERB, i);
		}
		public List<TerminalNode> ADJETIVE() { return getTokens(SpanishParser.ADJETIVE); }
		public TerminalNode ADJETIVE(int i) {
			return getToken(SpanishParser.ADJETIVE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 686L) != 0)) {
				{
				setState(35);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 686L) != 0)) ) {
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
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38);
					_la = _input.LA(1);
					if ( !(_la==NOUN || _la==VERB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 816L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class VerbPhraseContext extends ParserRuleContext {
		public TerminalNode VERB() { return getToken(SpanishParser.VERB, 0); }
		public List<TerminalNode> ADVERB() { return getTokens(SpanishParser.ADVERB); }
		public TerminalNode ADVERB(int i) {
			return getToken(SpanishParser.ADVERB, i);
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
			setState(49);
			match(VERB);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(52);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADVERB:
						{
						setState(50);
						match(ADVERB);
						}
						break;
					case PREPOSITION:
						{
						setState(51);
						prepositionalPhrase();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 8, RULE_prepositionalPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(PREPOSITION);
			setState(58);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConjunctionPhraseContext extends ParserRuleContext {
		public TerminalNode CONJUCTION() { return getToken(SpanishParser.CONJUCTION, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public ConjunctionPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunctionPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).enterConjunctionPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).exitConjunctionPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanishVisitor ) return ((SpanishVisitor<? extends T>)visitor).visitConjunctionPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionPhraseContext conjunctionPhrase() throws RecognitionException {
		ConjunctionPhraseContext _localctx = new ConjunctionPhraseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conjunctionPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CONJUCTION);
			setState(61);
			phrase();
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
	public static class InterjectionPhraseContext extends ParserRuleContext {
		public TerminalNode INTERJECTION() { return getToken(SpanishParser.INTERJECTION, 0); }
		public InterjectionPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interjectionPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).enterInterjectionPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpanishListener ) ((SpanishListener)listener).exitInterjectionPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpanishVisitor ) return ((SpanishVisitor<? extends T>)visitor).visitInterjectionPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterjectionPhraseContext interjectionPhrase() throws RecognitionException {
		InterjectionPhraseContext _localctx = new InterjectionPhraseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interjectionPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(INTERJECTION);
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
		"\u0004\u0001\u000eB\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0003\u0000"+
		"\u0016\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t"+
		"\u0001\u0001\u0002\u0003\u0002%\b\u0002\u0001\u0002\u0004\u0002(\b\u0002"+
		"\u000b\u0002\f\u0002)\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u0002"+
		"0\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00035\b\u0003\n\u0003"+
		"\f\u00038\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007"+
		"\u0000\u0002\u0004\u0006\b\n\f\u0000\u0003\u0004\u0000\u0001\u0003\u0005"+
		"\u0005\u0007\u0007\t\t\u0002\u0000\u0006\u0006\b\b\u0002\u0000\u0004\u0005"+
		"\b\tF\u0000\u0015\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000"+
		"\u0004$\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b9\u0001"+
		"\u0000\u0000\u0000\n<\u0001\u0000\u0000\u0000\f?\u0001\u0000\u0000\u0000"+
		"\u000e\u0011\u0003\u0002\u0001\u0000\u000f\u0010\u0005\r\u0000\u0000\u0010"+
		"\u0012\u0003\u0002\u0001\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015"+
		"\u000e\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018"+
		"\u0001\u0001\u0000\u0000\u0000\u0019\u001f\u0003\u0004\u0002\u0000\u001a"+
		"\u001f\u0003\u0006\u0003\u0000\u001b\u001f\u0003\b\u0004\u0000\u001c\u001f"+
		"\u0003\n\u0005\u0000\u001d\u001f\u0003\f\u0006\u0000\u001e\u0019\u0001"+
		"\u0000\u0000\u0000\u001e\u001a\u0001\u0000\u0000\u0000\u001e\u001b\u0001"+
		"\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001"+
		"\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000"+
		"\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000"+
		"\" \u0001\u0000\u0000\u0000#%\u0007\u0000\u0000\u0000$#\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000&(\u0007\u0001"+
		"\u0000\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*.\u0001\u0000\u0000\u0000"+
		"+-\u0007\u0002\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0005\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000016\u0005\b\u0000\u000025\u0005"+
		"\t\u0000\u000035\u0003\b\u0004\u000042\u0001\u0000\u0000\u000043\u0001"+
		"\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u00007\u0007\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u00009:\u0005\n\u0000\u0000:;\u0003\u0004\u0002\u0000;\t\u0001"+
		"\u0000\u0000\u0000<=\u0005\u000b\u0000\u0000=>\u0003\u0002\u0001\u0000"+
		">\u000b\u0001\u0000\u0000\u0000?@\u0005\f\u0000\u0000@\r\u0001\u0000\u0000"+
		"\u0000\t\u0013\u0015\u001e $).46";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}