import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public class CaptureErrors extends BaseErrorListener {
    private Map<String, String> lexicalErrors;
    private Map<String, String> syntaxErrors;
    private Map<String, String> semanticErrors;

    public CaptureErrors(){
        lexicalErrors = new HashMap<>();
        syntaxErrors = new HashMap<>();
        semanticErrors = new HashMap<>();
    }

    public Map<String, String> getLexicalErrors() {
        return lexicalErrors;
    }

    public Map<String, String> getSyntaxErrors() {
        return syntaxErrors;
    }

    public Map<String, String> getSemanticErrors() {
        return semanticErrors;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String errorKey = "Line " + line + ":" + charPositionInLine;
        if (offendingSymbol instanceof Token) {
            lexicalErrors.put("Lexical error: "+errorKey, msg);
        } else if (recognizer instanceof Parser) {
            syntaxErrors.put("Sintatic error: "+errorKey, msg);
        }
    }


    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        String errorKey = "Ambiguity at " + startIndex + ":" + stopIndex;
        String errorMsg = "Ambiguity found in parsing";
        semanticErrors.put("Semantic error"+errorKey, errorMsg);
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        String errorKey = "Full context at " + startIndex + ":" + stopIndex;
        String errorMsg = "Attempting full context parsing";
        semanticErrors.put("Semantic error"+errorKey, errorMsg);
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        String errorKey = "Context sensitivity at " + startIndex + ":" + stopIndex;
        String errorMsg = "Context sensitivity found in parsing";
        semanticErrors.put("Semantic error"+errorKey, errorMsg);
    }
}
