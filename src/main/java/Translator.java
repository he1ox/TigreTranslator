import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import English.*;
import Spanish.*;

public class Translator {
    private SymbolTable symbolTable;
    private ErrorTable errorTable;

    public Translator() {
        this.symbolTable = new SymbolTable();
        this.errorTable = new ErrorTable();
    }

    public String translate(String input, boolean fromEnglishToSpanish) {
        Lexer lexer;
        ParserRuleContext parseTree;
        ParseTreeWalker walker = new ParseTreeWalker();
        String translatedText;

        if (fromEnglishToSpanish) {
            lexer = new EnglishLexer(CharStreams.fromString(input));
            EnglishParser parser = new EnglishParser(new CommonTokenStream(lexer));
            parseTree = parser.sentence();

            // Utilizar un ParseTreeWalker para recorrer el árbol de análisis
            TranslationListener translationListener = new TranslationListener(symbolTable);
            walker.walk(translationListener, parseTree);
            translatedText = translationListener.getTranslatedText();
        } else {
            lexer = new SpanishLexer(CharStreams.fromString(input));
            SpanishParser parser = new SpanishParser(new CommonTokenStream(lexer));
            parseTree = parser.sentence();

            // Utilizar un ParseTreeWalker para recorrer el árbol de análisis
            SpanishToEnglishListener spanishToEnglishListener = new SpanishToEnglishListener(symbolTable);
            walker.walk(spanishToEnglishListener, parseTree);
            translatedText = spanishToEnglishListener.getTranslatedText();
        }

        /* Verificar errores
        for (int i = 0; i < lexer.getNumberOfSyntaxErrors(); i++) {
            String errorMsg = "Error léxico: " + lexer.getErrorHeader(i);
            errorTable.addError(errorMsg);
        } */

        return translatedText;
    }


}
