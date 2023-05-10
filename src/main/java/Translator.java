import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import English.*;
import Spanish.*;

import java.util.Map;

public class Translator {
    private SymbolTable symbolTable;
    private ErrorTable errorTable;
    private Map<String,String> alltokens;
    private Map<String,String> lexicalErr;
    private Map<String,String> syntaxErr;
    private Map<String,String> semanticErr;

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
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            EnglishParser parser = new EnglishParser(tokens);

            // Captura de errores
            CaptureErrors errorListener = new CaptureErrors();
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            lexicalErr = errorListener.getLexicalErrors();
            syntaxErr = errorListener.getSyntaxErrors();
            semanticErr = errorListener.getSemanticErrors();

            // Captura de Tokens
            TokenTable tokenTable = new TokenTable();
            tokenTable.tokensMapEnglish(tokens, parser);
            alltokens = tokenTable.getAllTokens();

            parseTree = parser.sentence();

            // Utilizar un ParseTreeWalker para recorrer el árbol de análisis
            TranslationListener translationListener = new TranslationListener(symbolTable);
            walker.walk(translationListener, parseTree);
            translatedText = translationListener.getTranslatedText();

        } else {
            lexer = new SpanishLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SpanishParser parser = new SpanishParser(tokens);

            // Captura de errores
            CaptureErrors errorListener = new CaptureErrors();
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            lexicalErr = errorListener.getLexicalErrors();
            syntaxErr = errorListener.getSyntaxErrors();
            semanticErr = errorListener.getSemanticErrors();

            // Captura de Tokens
            TokenTable tokenTable = new TokenTable();
            tokenTable.tokensMapSpanish(tokens, parser);
            alltokens = tokenTable.getAllTokens();

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
    // Retorna erroers lexicos
    public Map<String,String> returnLexicalErrors(){
        return this.lexicalErr;
    }
    // Retorna erroes sintacticos
    public Map<String,String> returnSyntaxErrors(){
        return this.syntaxErr;
    }
    //Retorna errores semanticos
    public Map<String,String> returnSemanticErrors(){
        return this.semanticErr;
    }


}
