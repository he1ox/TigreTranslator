import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private HashMap<String, String> dictionary;

    public SymbolTable() {
        this.dictionary = new HashMap<>();
        dictionary.put("dog", "perro");
        dictionary.put("cat", "gato");
        dictionary.put("chair", "silla");
        dictionary.put("table", "mesa");
        dictionary.put("book", "libro");
        dictionary.put("phone", "teléfono");
        dictionary.put("computer", "computadora");
        dictionary.put("car", "coche");
        dictionary.put("bicycle", "bicicleta");
        dictionary.put("plane", "avión");
        dictionary.put("train", "tren");
        dictionary.put("bus", "autobús");
        dictionary.put("cup", "taza");
        dictionary.put("plate", "plato");
        dictionary.put("fork", "tenedor");
        dictionary.put("spoon", "cuchara");
        dictionary.put("knife", "cuchillo");
        dictionary.put("television", "televisión");
        dictionary.put("movie", "película");
        dictionary.put("music", "música");
        dictionary.put("art", "arte");
        dictionary.put("science", "ciencia");
        dictionary.put("math", "matemáticas");
        dictionary.put("history", "historia");
        dictionary.put("geography", "geografía");
        dictionary.put("language", "idioma");
        dictionary.put("food", "comida");
        dictionary.put("water", "agua");
        dictionary.put("air", "aire");
        dictionary.put("earth", "tierra");
        dictionary.put("sun", "sol");
        dictionary.put("moon", "luna");
        dictionary.put("star", "estrella");
        dictionary.put("planet", "planeta");
        dictionary.put("universe", "universo");
        dictionary.put("galaxy", "galaxia");
        dictionary.put("ocean", "océano");
        dictionary.put("river", "río");
        dictionary.put("mountain", "montaña");
        dictionary.put("forest", "bosque");
        dictionary.put("park", "parque");
        dictionary.put("beach", "playa");
        dictionary.put("city", "ciudad");
        dictionary.put("town", "pueblo");
        dictionary.put("village", "aldea");
        dictionary.put("country", "país");
        dictionary.put("world", "mundo");
        dictionary.put("globe", "globo");
        dictionary.put("map", "mapa");
        dictionary.put("compass", "brújula");
        dictionary.put("camera", "cámara");
        dictionary.put("photo", "foto");
        dictionary.put("video", "video");
        dictionary.put("game", "juego");
        dictionary.put("sport", "deporte");
        dictionary.put("ball", "pelota");
        dictionary.put("bat", "bate");
        dictionary.put("glove", "guante");
        dictionary.put("shoe", "zapato");
        dictionary.put("hat", "sombrero");
        dictionary.put("jacket", "chaqueta");
        dictionary.put("shirt", "camisa");
        dictionary.put("pants", "pantalones");
        dictionary.put("dress", "vestido");
        dictionary.put("skirt", "falda");
        dictionary.put("sock", "calcetín");
        dictionary.put("boot", "bota");
        dictionary.put("sandal", "sandalia");
        dictionary.put("sneaker", "zapatilla");
        dictionary.put("glasses", "gafas");
        dictionary.put("sunglasses", "gafas de sol");
        dictionary.put("cap", "gorra");
        dictionary.put("scarf", "bufanda");
        dictionary.put("gloves", "guantes");
        dictionary.put("bag", "bolsa");
        dictionary.put("wallet", "cartera");
        dictionary.put("key", "llave");
        dictionary.put("lock", "cerradura");
        dictionary.put("door", "puerta");
        dictionary.put("window", "ventana");
        dictionary.put("chair", "silla");
        dictionary.put("table", "mesa");
        dictionary.put("book", "libro");
        dictionary.put("phone", "teléfono");
        dictionary.put("computer", "computadora");
        dictionary.put("car", "auto");
        dictionary.put("bicycle", "bicicleta");
        dictionary.put("plane", "avión");
        dictionary.put("train", "tren");
        dictionary.put("bus", "autobús");
        dictionary.put("cup", "taza");
        dictionary.put("plate", "plato");
        dictionary.put("fork", "tenedor");
        dictionary.put("spoon", "cuchara");
        dictionary.put("knife", "cuchillo");
        dictionary.put("television", "televisión");
        dictionary.put("movie", "película");
        dictionary.put("music", "música");
        dictionary.put("art", "arte");
        dictionary.put("science", "ciencia");
        dictionary.put("math", "matemáticas");
        dictionary.put("history", "historia");
        dictionary.put("geography", "geografía");
        dictionary.put("language", "idioma");
        dictionary.put("food", "comida");
        dictionary.put("water", "agua");
        dictionary.put("air", "aire");
        dictionary.put("earth", "tierra");
        dictionary.put("sun", "sol");
        dictionary.put("moon", "luna");
        dictionary.put("star", "estrella");
        dictionary.put("planet", "planeta");
        dictionary.put("universe", "universo");
        dictionary.put("galaxy", "galaxia");
        dictionary.put("ocean", "océano");
        dictionary.put("river", "río");
        dictionary.put("mountain", "montaña");
        dictionary.put("forest", "bosque");
        dictionary.put("park", "parque");
        dictionary.put("beach", "playa");
        dictionary.put("city", "ciudad");
        dictionary.put("town", "pueblo");
        dictionary.put("village", "aldea");
        dictionary.put("country", "país");
        dictionary.put("world", "mundo");
        dictionary.put("globe", "globo terráqueo");
        dictionary.put("map", "mapa");
        dictionary.put("compass", "brújula");
        dictionary.put("camera", "cámara");
        dictionary.put("photo", "foto");
        dictionary.put("video", "video");
        dictionary.put("game", "juego");
        dictionary.put("sport", "deporte");
        dictionary.put("ball", "pelota");
        dictionary.put("bat", "bate");
        dictionary.put("glove", "guante");
        dictionary.put("shoe", "zapato");
        dictionary.put("hat", "sombrero");
        dictionary.put("jacket", "chaqueta");
        dictionary.put("shirt", "camisa");
        dictionary.put("pants", "pantalones");
        dictionary.put("dress", "vestido");
        dictionary.put("skirt", "falda");
        dictionary.put("sock", "calcetín");
        dictionary.put("boot", "bota");
        dictionary.put("sandal", "sandalia");
        dictionary.put("sneaker", "tenis");
        dictionary.put("glasses", "lentes");
        dictionary.put("sunglasses", "anteojos de sol");
        dictionary.put("cap", "gorra");
        dictionary.put("scarf", "bufanda");
        dictionary.put("gloves", "guantes");
        dictionary.put("bag", "bolso");
        dictionary.put("wallet", "billetera");
        dictionary.put("key", "llave");
        dictionary.put("lock", "cerradura");
        dictionary.put("door", "puerta");
        dictionary.put("window", "ventana");
        dictionary.put("wall", "pared");
        dictionary.put("roof", "techo");

        //---------------------------------------------------


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
