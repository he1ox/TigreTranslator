// Generated from C:/Users/georg/IdeaProjects/TigreTranslator/src\Spanish.g4 by ANTLR 4.12.0
package Spanish;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpanishParser}.
 */
public interface SpanishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SpanishParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SpanishParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanishParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SpanishParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanishParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(SpanishParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanishParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(SpanishParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanishParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNounPhrase(SpanishParser.NounPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanishParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNounPhrase(SpanishParser.NounPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanishParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void enterVerbPhrase(SpanishParser.VerbPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanishParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void exitVerbPhrase(SpanishParser.VerbPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanishParser#adverbPhrase}.
	 * @param ctx the parse tree
	 */
	void enterAdverbPhrase(SpanishParser.AdverbPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanishParser#adverbPhrase}.
	 * @param ctx the parse tree
	 */
	void exitAdverbPhrase(SpanishParser.AdverbPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanishParser#prepositionalPhrase}.
	 * @param ctx the parse tree
	 */
	void enterPrepositionalPhrase(SpanishParser.PrepositionalPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanishParser#prepositionalPhrase}.
	 * @param ctx the parse tree
	 */
	void exitPrepositionalPhrase(SpanishParser.PrepositionalPhraseContext ctx);
}