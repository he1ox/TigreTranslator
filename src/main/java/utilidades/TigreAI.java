package utilidades;

import com.google.api.client.json.Json;
import com.jayway.jsonpath.JsonPath;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

public class TigreAI {
    public static final String API_KEY = OpenAI.API_KEY;
    public static final String MODEL_CHAT = "gpt-3.5-turbo";
    public static final String MODEL_EDIT = "text-davinci-edit-001";

    public static void main(String[] args) throws Exception {
        //ejemploDeUso("the big cat");
        //System.out.println(explicacion("the cat big"));
        //System.out.println(arreglarGramatica("the cat big"));
        System.out.println(explicacion("the cat big"));
    }

    public static String arreglarGramatica(String frasePalabra){

        if (frasePalabra.isEmpty()){
            return "";
        } else {
            String instruction = "Fix the grammar";

            String input = frasePalabra;

            JSONObject requestBody = new JSONObject();

            requestBody.put("model",MODEL_EDIT);
            requestBody.put("instruction",instruction);
            requestBody.put("input", input);
            requestBody.put("temperature",0.8);

            HttpResponse<JsonNode> response = Unirest.post("https://api.openai.com/v1/edits")
                    .header("Content-Type","application/json")
                    .header("Authorization","Bearer "+API_KEY)
                    .body(requestBody.toString())
                    .asJson();

            System.out.println(response.getBody().toString());

            return JsonPath.read(response.getBody().toString(),"$.choices[0].text");
        }

    }

    public static String explicacion(String frasePalabra){

        String ejemplo = "";

        String messageContent = "A partir de ahora eres mi maestro de inglés. Explicame de forma breve la siguiente oracion o palabra: "+frasePalabra+"";

        JSONObject requestBody = new JSONObject();
        JSONArray messagesArray = new JSONArray();

        JSONObject message = new JSONObject();
        message.put("role", "user");
        message.put("content", messageContent);

        messagesArray.put(message);

        requestBody.put("model", MODEL_CHAT);
        requestBody.put("messages", messagesArray);


        HttpResponse<JsonNode> response = Unirest.post("https://api.openai.com/v1/chat/completions")
                .header("Content-Type", "application/json")
                .header("Authorization","Bearer "+API_KEY)
                .body(requestBody.toString())
                .asJson();

        ejemplo = JsonPath.read(response.getBody().toString(), "$.choices[0].message.content");

        return ejemplo;
    }

    public static String ejemploDeUso(String frasePalabra){
        String ejemplo = "";

        String messageContent = "Explica la frase o palabra y solo dame un ejemplo breve de su uso '"+frasePalabra+"' en la vida real. Si reconoces que la frase es muy corta o en este caso puede ser gramaticalmente incorrecta, por ejemplo 'the cat big' , tu la reconocerias automaticamente como 'The big cat.' es decir, corrigela tras banbalinas sin mencionar que es gramaticalmente incorrecta.Tu respuesta debe empezar estrictamente como, es decir, la primera linea de tu respuesta.Ejemplo 1 Usuario: Explica la frase o palabra y solo dame un ejemplo breve de su uso 'the cat big' en la vida real.Respuesta: La frase 'The big cat' se refiere a un gato que es grande en tamaño.Ejemplo de uso: A: 'Have you seen our neighbor's new cat?' B: 'Yes, it's huge - the big cat is always in her yard!' Ejemplo 2 Usuario: Explica la frase o palabra y solo dame un ejemplo breve de su uso 'the dog big' en la vida real.Respuesta: La frase 'The big dog.' se refiere a un gato que es grande en tamaño. Ejemplo de uso...";

        JSONObject requestBody = new JSONObject();
        JSONArray messagesArray = new JSONArray();

        JSONObject message = new JSONObject();
        message.put("role", "user");
        message.put("content", messageContent);

        messagesArray.put(message);

        requestBody.put("model", MODEL_CHAT);
        requestBody.put("messages", messagesArray);


        HttpResponse<JsonNode> response = Unirest.post("https://api.openai.com/v1/chat/completions")
                .header("Content-Type", "application/json")
                .header("Authorization","Bearer "+API_KEY)
                .body(requestBody.toString())
                .asJson();

        ejemplo = JsonPath.read(response.getBody().toString(), "$.choices[0].message.content");

        return ejemplo;
    }
}
