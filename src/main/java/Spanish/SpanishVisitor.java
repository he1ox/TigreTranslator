// Generated from C:/Users/georg/IdeaProjects/TigreTranslator/src\Spanish.g4 by ANTLR 4.12.0
package Spanish;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpanishParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpanishVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpanishParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(SpanishParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanishParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(SpanishParser.PhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanishParser#nounPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounPhrase(SpanishParser.NounPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanishParser#verbPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbPhrase(SpanishParser.VerbPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanishParser#adverbPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdverbPhrase(SpanishParser.AdverbPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanishParser#prepositionalPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepositionalPhrase(SpanishParser.PrepositionalPhraseContext ctx);
}