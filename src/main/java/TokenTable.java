import English.EnglishLexer;
import English.EnglishParser;
import Spanish.SpanishLexer;
import Spanish.SpanishParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;
import java.util.Map;

public class TokenTable {
    private Map<String, String> symbols;

    public TokenTable() {
        symbols = new HashMap<>();
    }

    public void tokensMapEnglish(CommonTokenStream tokens) {
        Token token = tokens.LT(1);
        while (token.getType() != Token.EOF) {
            String tokenText = token.getText();
            int tokenType = token.getType();
            int line = token.getLine();
            int charPositionInLine = token.getCharPositionInLine();
            String tokenCategory = switch (tokenType) {
                case EnglishLexer.NOUN-> "Noun";
                case EnglishLexer.ARTICLE -> "Article";
                case EnglishLexer.ADJETIVE -> "Adjetive";
                case EnglishLexer.VERB -> "Verb";
                case EnglishLexer.PREPOSITION -> "Preposition";
                case EnglishLexer.ADVERB -> "Adverb";
                case EnglishLexer.POSSESSIVE_PRONOUN, EnglishLexer.DETERM -> "Possesive pronoun";
                case EnglishLexer.NUMERAL-> "Numerical";
                case EnglishLexer.PUNCTUATION -> "Punctuation";
                case EnglishLexer.INTERJECTION -> "Interjeccion";
                case EnglishLexer.CONJUNCTION -> "Cojunction coordination";
                default -> "Otro";
            };
            symbols.put("Token: " + tokenText," [(Tipo: " + tokenCategory + "),"+"Line(" + line + "), posición(" + charPositionInLine+")]");
            tokens.consume(); // Avanza al siguiente token
            token = tokens.LT(1); // Obtiene el siguiente token
        }
    }

    public void tokensMapSpanish(CommonTokenStream tokens) {
        Token token = tokens.LT(1);
        while (token.getType() != Token.EOF) {
            String tokenText = token.getText();
            int tokenType = token.getType();
            int line = token.getLine();
            int charPositionInLine = token.getCharPositionInLine();
            String tokenCategory = switch (tokenType) {
                case SpanishLexer.ARTICLE -> "Article";
                case SpanishLexer.ADJETIVE -> "Adjetive";
                case SpanishLexer.NOUN -> "Noun";
                case SpanishLexer.VERB -> "Verb";
                case SpanishLexer.PREPOSITION -> "Preposition";
                case SpanishLexer.ADVERB -> "Adverb";
                case SpanishLexer.POSSESSIVE_PRONOUN, SpanishLexer.DETERM -> "Possesive_pronoun";
                case SpanishLexer.NUMERAL-> "Numerical";
                case SpanishLexer.PUNTUATION ->  "Punctuation";
                case SpanishLexer.INTERJECTION -> "Interjeccion";
                case SpanishLexer.CONJUCTION -> "Cojunction coordination";
                default -> "Otro";
            };
            symbols.put("Token: " + tokenText," [(Tipo: " + tokenCategory + "),"+"Line(" + line + "), posición(" + charPositionInLine+")]");

            tokens.consume(); // Avanza al siguiente token
            token = tokens.LT(1); // Obtiene el siguiente token
        }
        System.out.println(symbols.toString());
    }

    public Map<String,String> getAllTokens() {
        return symbols;
    }

}
