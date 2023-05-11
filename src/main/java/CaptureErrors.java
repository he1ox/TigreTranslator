import English.EnglishLexer;
import English.EnglishListener;
import English.EnglishParser;
import Spanish.SpanishLexer;
import Spanish.SpanishParser;
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
    private Map<String, String> allErrors;

    public CaptureErrors(){
        allErrors = new HashMap<>();
    }

    public Map<String, String> getAllErrors() {
        return this.allErrors;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String errorKey = "Line " + line + " : " + charPositionInLine;
        if (offendingSymbol instanceof EnglishLexer || offendingSymbol instanceof SpanishLexer) {
            allErrors.put("Lexical error: "+errorKey, msg);
        } else if (recognizer instanceof EnglishParser || recognizer instanceof SpanishParser) {
            allErrors.put("Sintatic error: "+errorKey, msg);
        }
        else{
            allErrors.put("Semantic error: "+errorKey, msg);
        }

    }


    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        String errorKey = "Ambiguity at " + startIndex + ":" + stopIndex;
        String errorMsg = "Ambiguity found in parsing";
        allErrors.put("Semantic error"+errorKey, errorMsg);
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        String errorKey = "Full context at " + startIndex + ":" + stopIndex;
        String errorMsg = "Attempting full context parsing";
        allErrors.put("Semantic error"+errorKey, errorMsg);
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        String errorKey = "Context sensitivity at " + startIndex + ":" + stopIndex;
        String errorMsg = "Context sensitivity found in parsing";
        allErrors.put("Semantic error"+errorKey, errorMsg);
    }
}
