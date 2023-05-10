import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private HashMap<String, String> dictionary;

    public SymbolTable() {
        this.dictionary = new HashMap<>();
        // Agregar sustantivos y sus traducciones
        dictionary.put("dog", "perro");
        dictionary.put("cat", "gato");
        dictionary.put("bird", "pájaro");
        dictionary.put("house", "casa");

        // Agregar adjetivos y sus traducciones
        dictionary.put("big", "grande");
        dictionary.put("small", "pequeño");
        dictionary.put("tall", "alto");
        dictionary.put("short", "corto");

        // Agregar verbos y sus traducciones
        dictionary.put("run", "corre");
        dictionary.put("jump", "salta");
        dictionary.put("fly", "vuela");
        dictionary.put("eat", "come");

        // Agregar adverbios y sus traducciones
        dictionary.put("quickly", "rápidamente");
        dictionary.put("slowly", "lentamente");
        dictionary.put("never", "nunca");
        dictionary.put("always", "siempre");

        // Agregar preposiciones y sus traducciones
        dictionary.put("in", "en");
        dictionary.put("on", "sobre");
        dictionary.put("over", "sobre");
        dictionary.put("under", "debajo");
        dictionary.put("between", "entre");

        // Agregar artículos y sus traducciones
        dictionary.put("the", "el"); // Nota: en realidad, necesitaría diferenciar entre "el", "la", "los" y "las"
        dictionary.put("a", "un"); // Nota: en realidad, necesitaría diferenciar entre "un" y "una"

        // Agregar pronombres y sus traducciones
        dictionary.put("I", "yo");
        dictionary.put("you", "tú");
        dictionary.put("he", "él");
        dictionary.put("she", "ella");

        dictionary.put("my","mi");

    }

    public String translateInverse(String word) {
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(word)) {
                return entry.getKey();
            }
        }
        return word; // Si no se encuentra la traducción, devolver la palabra original
    }


    public String translate(String word) {
        return this.dictionary.getOrDefault(word, word);
    }
}
