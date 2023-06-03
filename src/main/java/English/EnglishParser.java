// Generated from C:/Users/georg/IdeaProjects/TigreTranslator/src\English.g4 by ANTLR 4.12.0
package English;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EnglishParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DETERM=1, ARTICLE=2, POSSESSIVE_PRONOUN=3, ADJETIVE=4, NUMERAL=5, NOUN=6, 
		PRONOUN=7, VERB=8, ADVERB=9, PREPOSITION=10, CONJUNCTION=11, INTERJECTION=12, 
		PUNCTUATION=13, WS=14;
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
			"NOUN", "PRONOUN", "VERB", "ADVERB", "PREPOSITION", "CONJUNCTION", "INTERJECTION", 
			"PUNCTUATION", "WS"
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
	public String getGrammarFileName() { return "English.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnglishParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EnglishParser.EOF, 0); }
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(EnglishParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(EnglishParser.PUNCTUATION, i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitSentence(this);
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
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(14);
				phrase();
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUNCTUATION) {
					{
					{
					setState(15);
					match(PUNCTUATION);
					setState(16);
					phrase();
					}
					}
					setState(21);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(24);
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
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitPhrase(this);
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
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(31);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(26);
						nounPhrase();
						}
						break;
					case 2:
						{
						setState(27);
						verbPhrase();
						}
						break;
					case 3:
						{
						setState(28);
						prepositionalPhrase();
						}
						break;
					case 4:
						{
						setState(29);
						conjunctionPhrase();
						}
						break;
					case 5:
						{
						setState(30);
						interjectionPhrase();
						}
						break;
					}
					} 
				}
				setState(35);
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
		public List<TerminalNode> ARTICLE() { return getTokens(EnglishParser.ARTICLE); }
		public TerminalNode ARTICLE(int i) {
			return getToken(EnglishParser.ARTICLE, i);
		}
		public TerminalNode PUNCTUATION() { return getToken(EnglishParser.PUNCTUATION, 0); }
		public List<TerminalNode> ADJETIVE() { return getTokens(EnglishParser.ADJETIVE); }
		public TerminalNode ADJETIVE(int i) {
			return getToken(EnglishParser.ADJETIVE, i);
		}
		public TerminalNode ADVERB() { return getToken(EnglishParser.ADVERB, 0); }
		public List<TerminalNode> VERB() { return getTokens(EnglishParser.VERB); }
		public TerminalNode VERB(int i) {
			return getToken(EnglishParser.VERB, i);
		}
		public TerminalNode PREPOSITION() { return getToken(EnglishParser.PREPOSITION, 0); }
		public PrepositionalPhraseContext prepositionalPhrase() {
			return getRuleContext(PrepositionalPhraseContext.class,0);
		}
		public List<TerminalNode> NOUN() { return getTokens(EnglishParser.NOUN); }
		public TerminalNode NOUN(int i) {
			return getToken(EnglishParser.NOUN, i);
		}
		public TerminalNode DETERM() { return getToken(EnglishParser.DETERM, 0); }
		public TerminalNode POSSESSIVE_PRONOUN() { return getToken(EnglishParser.POSSESSIVE_PRONOUN, 0); }
		public TerminalNode PRONOUN() { return getToken(EnglishParser.PRONOUN, 0); }
		public List<TerminalNode> NUMERAL() { return getTokens(EnglishParser.NUMERAL); }
		public TerminalNode NUMERAL(int i) {
			return getToken(EnglishParser.NUMERAL, i);
		}
		public NounPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterNounPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitNounPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitNounPhrase(this);
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
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(36);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 174L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 304L) != 0)) ) {
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
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARTICLE) {
				{
				setState(45);
				match(ARTICLE);
				}
			}

			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNCTUATION) {
				{
				setState(48);
				match(PUNCTUATION);
				}
			}

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADJETIVE) {
				{
				setState(51);
				match(ADJETIVE);
				}
			}

			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADVERB) {
				{
				setState(54);
				match(ADVERB);
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERB) {
				{
				setState(57);
				match(VERB);
				}
			}

			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(60);
				match(PREPOSITION);
				}
				break;
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREPOSITION) {
				{
				setState(63);
				prepositionalPhrase();
				}
			}

			setState(67); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(66);
					match(NOUN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode VERB() { return getToken(EnglishParser.VERB, 0); }
		public List<TerminalNode> ADVERB() { return getTokens(EnglishParser.ADVERB); }
		public TerminalNode ADVERB(int i) {
			return getToken(EnglishParser.ADVERB, i);
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
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterVerbPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitVerbPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitVerbPhrase(this);
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
			setState(71);
			match(VERB);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(74);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADVERB:
						{
						setState(72);
						match(ADVERB);
						}
						break;
					case PREPOSITION:
						{
						setState(73);
						prepositionalPhrase();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(78);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrepositionalPhraseContext extends ParserRuleContext {
		public TerminalNode PREPOSITION() { return getToken(EnglishParser.PREPOSITION, 0); }
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public PrepositionalPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepositionalPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterPrepositionalPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitPrepositionalPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitPrepositionalPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrepositionalPhraseContext prepositionalPhrase() throws RecognitionException {
		PrepositionalPhraseContext _localctx = new PrepositionalPhraseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prepositionalPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(PREPOSITION);
			setState(80);
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
		public TerminalNode CONJUNCTION() { return getToken(EnglishParser.CONJUNCTION, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public ConjunctionPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunctionPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterConjunctionPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitConjunctionPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitConjunctionPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionPhraseContext conjunctionPhrase() throws RecognitionException {
		ConjunctionPhraseContext _localctx = new ConjunctionPhraseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conjunctionPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CONJUNCTION);
			setState(83);
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
		public TerminalNode INTERJECTION() { return getToken(EnglishParser.INTERJECTION, 0); }
		public InterjectionPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interjectionPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterInterjectionPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitInterjectionPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitInterjectionPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterjectionPhraseContext interjectionPhrase() throws RecognitionException {
		InterjectionPhraseContext _localctx = new InterjectionPhraseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interjectionPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		"\u0004\u0001\u000eX\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0003\u0000"+
		"\u0017\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001"+
		"\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0002\u0005\u0002)\b\u0002\n\u0002"+
		"\f\u0002,\t\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002\u0003\u0002"+
		"2\b\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002\u0003\u00028\b"+
		"\u0002\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0002\u0003\u0002>\b\u0002"+
		"\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0002\u0004\u0002D\b\u0002\u000b"+
		"\u0002\f\u0002E\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003K\b\u0003"+
		"\n\u0003\f\u0003N\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000"+
		"\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0002\u0003\u0000\u0001\u0003"+
		"\u0005\u0005\u0007\u0007\u0002\u0000\u0004\u0005\b\bc\u0000\u0016\u0001"+
		"\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000"+
		"\u0000\u0006G\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000\nR\u0001"+
		"\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000e\u0013\u0003\u0002"+
		"\u0001\u0000\u000f\u0010\u0005\r\u0000\u0000\u0010\u0012\u0003\u0002\u0001"+
		"\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000"+
		"\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0016\u000e\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000"+
		"\u0001\u0019\u0001\u0001\u0000\u0000\u0000\u001a \u0003\u0004\u0002\u0000"+
		"\u001b \u0003\u0006\u0003\u0000\u001c \u0003\b\u0004\u0000\u001d \u0003"+
		"\n\u0005\u0000\u001e \u0003\f\u0006\u0000\u001f\u001a\u0001\u0000\u0000"+
		"\u0000\u001f\u001b\u0001\u0000\u0000\u0000\u001f\u001c\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000$&\u0007\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&*\u0001\u0000\u0000\u0000\')\u0007\u0001\u0000\u0000(\'\u0001"+
		"\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000-/\u0005\u0002\u0000\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/1\u0001\u0000\u0000\u000002\u0005\r\u0000\u000010\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u000035\u0005"+
		"\u0004\u0000\u000043\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"57\u0001\u0000\u0000\u000068\u0005\t\u0000\u000076\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u00009;\u0005\b\u0000\u0000"+
		":9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000"+
		"\u0000<>\u0005\n\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?A\u0003\b\u0004\u0000@?\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000BD\u0005\u0006"+
		"\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0005\u0001\u0000\u0000"+
		"\u0000GL\u0005\b\u0000\u0000HK\u0005\t\u0000\u0000IK\u0003\b\u0004\u0000"+
		"JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0007\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\n\u0000\u0000PQ\u0003"+
		"\u0004\u0002\u0000Q\t\u0001\u0000\u0000\u0000RS\u0005\u000b\u0000\u0000"+
		"ST\u0003\u0002\u0001\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0005\f\u0000"+
		"\u0000V\r\u0001\u0000\u0000\u0000\u0010\u0013\u0016\u001f!%*.147:=@EJ"+
		"L";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}