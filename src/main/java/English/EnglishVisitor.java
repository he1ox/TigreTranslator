// Generated from C:/Users/georg/IdeaProjects/TigreTranslator/src\English.g4 by ANTLR 4.12.0
package English;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnglishParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnglishVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EnglishParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(EnglishParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(EnglishParser.PhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#nounPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounPhrase(EnglishParser.NounPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#verbPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbPhrase(EnglishParser.VerbPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#prepositionalPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepositionalPhrase(EnglishParser.PrepositionalPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#conjunctionPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionPhrase(EnglishParser.ConjunctionPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#interjectionPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterjectionPhrase(EnglishParser.InterjectionPhraseContext ctx);
}