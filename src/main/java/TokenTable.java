import English.EnglishParser;
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

    public void tokensMapEnglish(CommonTokenStream tokens, EnglishParser parser) {
        Token token = tokens.LT(1);
        while (token.getType() != Token.EOF) {
            String tokenText = token.getText();
            int tokenType = token.getType();
            int line = token.getLine();
            int charPositionInLine = token.getCharPositionInLine();
            String tokenCategory;
            switch (tokenType) {
                case 1:
                    tokenCategory = "Article";
                    break;
                case 2:
                    tokenCategory = "Adjetive";
                    break;
                case 3:
                    tokenCategory = "Noun";
                    break;
                case 4:
                    tokenCategory = "Verb";
                    break;
                case 5:
                    tokenCategory = "Preposition";
                    break;
                case 6:
                    tokenCategory = "Adverb";
                    break;
                case 7:
                    tokenCategory = "Possesive_pronoun";
                    break;
                case 8:
                    tokenCategory = "Numerical";
                    break;
                case 9:
                    tokenCategory = "Punctuation";
                    break;
                default:
                    tokenCategory = "Otro";
                    break;
            }
            symbols.put("Token: " + tokenText," [(Tipo: " + tokenCategory + "),"+"Line(" + line + "), posición(" + charPositionInLine+")]");
            System.out.println("Token: " + tokenText+" [(Tipo: " + tokenCategory + "),"+"Line(" + line + "), posición(" + charPositionInLine+")]");

            tokens.consume(); // Avanza al siguiente token
            token = tokens.LT(1); // Obtiene el siguiente token
        }
    }

    public void tokensMapSpanish(CommonTokenStream tokens, SpanishParser parser) {
        Token token = tokens.LT(1);
        while (token.getType() != Token.EOF) {
            String tokenText = token.getText();
            int tokenType = token.getType();
            int line = token.getLine();
            int charPositionInLine = token.getCharPositionInLine();
            String tokenCategory;
            switch (tokenType) {
                case 1:
                    tokenCategory = "Article";
                    break;
                case 2:
                    tokenCategory = "Adjetive";
                    break;
                case 3:
                    tokenCategory = "Noun";
                    break;
                case 4:
                    tokenCategory = "Verb";
                    break;
                case 5:
                    tokenCategory = "Preposition";
                    break;
                case 6:
                    tokenCategory = "Adverb";
                    break;
                case 7:
                    tokenCategory = "Possesive_pronoun";
                    break;
                case 8:
                    tokenCategory = "Numerical";
                    break;
                case 9:
                    tokenCategory = "Punctuation";
                    break;
                default:
                    tokenCategory = "Otro";
                    break;
            }
            symbols.put("Token: " + tokenText," [(Tipo: " + tokenCategory + "),"+"Line(" + line + "), posición(" + charPositionInLine+")]");
            System.out.println("Token: " + tokenText+" [(Tipo: " + tokenCategory + "),"+"Line(" + line + "), posición(" + charPositionInLine+")]");

            tokens.consume(); // Avanza al siguiente token
            token = tokens.LT(1); // Obtiene el siguiente token
        }
    }

    public Map<String,String> getAllTokens() {
        return symbols;
    }

}
