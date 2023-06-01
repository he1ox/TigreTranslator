// Generated from C:/Users/click/Documents/JS_Scripts/TigreTranslator/src\English.g4 by ANTLR 4.12.0
package English;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnglishParser}.
 */
public interface EnglishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnglishParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(EnglishParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(EnglishParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(EnglishParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(EnglishParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNounPhrase(EnglishParser.NounPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNounPhrase(EnglishParser.NounPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void enterVerbPhrase(EnglishParser.VerbPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void exitVerbPhrase(EnglishParser.VerbPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#prepositionalPhrase}.
	 * @param ctx the parse tree
	 */
	void enterPrepositionalPhrase(EnglishParser.PrepositionalPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#prepositionalPhrase}.
	 * @param ctx the parse tree
	 */
	void exitPrepositionalPhrase(EnglishParser.PrepositionalPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#conjunctionPhrase}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionPhrase(EnglishParser.ConjunctionPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#conjunctionPhrase}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionPhrase(EnglishParser.ConjunctionPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#interjectionPhrase}.
	 * @param ctx the parse tree
	 */
	void enterInterjectionPhrase(EnglishParser.InterjectionPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#interjectionPhrase}.
	 * @param ctx the parse tree
	 */
	void exitInterjectionPhrase(EnglishParser.InterjectionPhraseContext ctx);
}