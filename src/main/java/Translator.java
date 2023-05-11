import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import English.*;
import Spanish.*;

import java.util.Map;

public class Translator {
    private SymbolTable symbolTable;
    private ErrorTable errorTable;
    private Map<String,String> alltokens;
    private Map<String,String> allErrors;

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
            // Lex para traduccion
            EnglishLexer lex = new EnglishLexer(CharStreams.fromString(input));
            CommonTokenStream token2 = new CommonTokenStream(lex);
            EnglishParser parser = new EnglishParser(token2);
            // Lex para errores
            lexer = new EnglishLexer(CharStreams.fromString(input));
            CommonTokenStream token = new CommonTokenStream(lexer);

            // Captura de errores
            CaptureErrors errorListener = new CaptureErrors();
            lex.removeErrorListeners();
            lex.addErrorListener(errorListener);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            // Elimina errores
            lexer.removeErrorListeners();

            // Captura de Tokens
            TokenTable tokenTable = new TokenTable();
            tokenTable.tokensMapEnglish(token, parser);
            alltokens = tokenTable.getAllTokens();
            allErrors = errorListener.getAllErrors();

            parseTree = parser.sentence();
            // Utilizar un ParseTreeWalker para recorrer el árbol de análisis
            TranslationListener translationListener = new TranslationListener(symbolTable);
            walker.walk(translationListener, parseTree);
            translatedText = translationListener.getTranslatedText();
        } else {
            // Lex para Traduccion
            SpanishLexer lex = new SpanishLexer(CharStreams.fromString(input));
            CommonTokenStream token = new CommonTokenStream(lex);
            SpanishParser parser = new SpanishParser(token);
            // Lex para errores
            lexer = new SpanishLexer(CharStreams.fromString(input));
            CommonTokenStream token2 = new CommonTokenStream(lexer);


            // Captura de errores
            CaptureErrors errorListener = new CaptureErrors();
            lex.removeErrorListeners();
            lex.addErrorListener(errorListener);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            // Elimina errores
            lexer.removeErrorListeners();

            // Captura de Tokens
            TokenTable tokenTable = new TokenTable();
            tokenTable.tokensMapSpanish(token2, parser);
            alltokens = tokenTable.getAllTokens();
            allErrors = errorListener.getAllErrors();

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

    //Retorna los tokens
    public Map<String,String> returnTokens(){
        return this.alltokens;
    }

    //Retorna errores semanticos
    public Map<String,String> allErrors(){
        return this.allErrors;
    }


}
