package fr.intech.tp2;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {
    public static void main(String[] args) throws Exception{

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url("\n" +
                "https://api.navitia.io/v1/coverage/sncf/stop_areas/stop_area%3AOCE%3ASA" +
                "%3A87686006/commercial_modes/commercial_mode%3Atgv/departures?from_datetime" +
                "=20190917T144459&").header("Authorization","0859e454-1a16-41bb-bcab-9d034f0594c2").build();

        Response response = client.newCall(request).execute();

        System.out.println(response.code());

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        fr.intech.tp2.model.Response reponse = objectMapper.readValue(response.body().charStream(),fr.intech.tp2.model.Response.class);

        System.out.println(reponse.toString());
        objectMapper.writeValue(System.out,reponse);
    }

}
