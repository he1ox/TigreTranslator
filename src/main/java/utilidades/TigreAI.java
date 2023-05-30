package utilidades;

import com.jayway.jsonpath.JsonPath;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

public class TigreAI {
    public static final String API_KEY = OpenAI.API_KEY;
    public static final String MODEL = "gpt-3.5-turbo";
    public static void main(String[] args) throws Exception {
        //ejemploDeUso("the big cat");
        System.out.println(explicacion("the cat big"));
    }

    public static String explicacion(String frase){
        String ejemplo = "";

        String messageContent = "Estoy aprendiendo ingles. Explica de forma breve la siguiente frase o palabra'"+frase+"'";

        JSONObject requestBody = new JSONObject();
        JSONArray messagesArray = new JSONArray();

        JSONObject message = new JSONObject();
        message.put("role", "user");
        message.put("content", messageContent);

        messagesArray.put(message);

        requestBody.put("model", MODEL);
        requestBody.put("messages", messagesArray);


        HttpResponse<JsonNode> response = Unirest.post("https://api.openai.com/v1/chat/completions")
                .header("Content-Type", "application/json")
                .header("Authorization","Bearer "+API_KEY)
                .body(requestBody.toString())
                .asJson();

        ejemplo = JsonPath.read(response.getBody().toString(), "$.choices[0].message.content");

        return ejemplo;
    }

    public static String ejemploDeUso(String frase){
        String ejemplo = "";

        String messageContent = "Explica la frase o palabra y solo dame un ejemplo breve de su uso '"+frase+"' en la vida real";

        JSONObject requestBody = new JSONObject();
        JSONArray messagesArray = new JSONArray();

        JSONObject message = new JSONObject();
        message.put("role", "user");
        message.put("content", messageContent);

        messagesArray.put(message);

        requestBody.put("model", MODEL);
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
