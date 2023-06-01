import English.EnglishBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TranslationListener extends EnglishBaseListener {
    private final SymbolTable symbolTable;
    private final StringBuilder translatedText;

    public TranslationListener(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.translatedText = new StringBuilder();
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        String word = node.getText();

        // Ignorar el nodo <EOF>
        if (word.equals("<EOF>")) {
            return;
        }

        String translatedWord = symbolTable.translateInverse(word);
        translatedText.append(translatedWord).append(" ");
    }

    public String getTranslatedText() {
        return translatedText.toString().trim();
    }
}
