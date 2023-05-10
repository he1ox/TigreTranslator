// Generated from C:/Users/georg/IdeaProjects/TigreTranslator/src\English.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by {@link EnglishParser#adverbPhrase}.
	 * @param ctx the parse tree
	 */
	void enterAdverbPhrase(EnglishParser.AdverbPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#adverbPhrase}.
	 * @param ctx the parse tree
	 */
	void exitAdverbPhrase(EnglishParser.AdverbPhraseContext ctx);
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
}