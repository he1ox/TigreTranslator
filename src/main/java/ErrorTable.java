import java.util.ArrayList;
import java.util.List;

public class ErrorTable {
    private ArrayList<String> errors;

    public ErrorTable() {
        this.errors = new ArrayList<>();
    }

    public void addError(String error) {
        this.errors.add(error);
    }

    public List<String> getErrors() {
        return this.errors;
    }
}
