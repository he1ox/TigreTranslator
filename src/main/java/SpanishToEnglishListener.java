import Spanish.SpanishBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SpanishToEnglishListener extends SpanishBaseListener {
    private final SymbolTable symbolTable;
    private final StringBuilder translatedText;

    public SpanishToEnglishListener(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.translatedText = new StringBuilder();
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        String word = node.getText();

        // Ignorar el nodo <EOF>
        if (word.equals("<EOF>") || word.equals("¿") || word.equals("¡")) {
            return;
        }
        String translatedWord = symbolTable.translate(word);
        translatedText.append(translatedWord).append(" ");

    }

    public String getTranslatedText() {
        return translatedText.toString().trim();
    }
}
