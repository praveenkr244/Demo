package resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonSerializer;

public class SerTest {
   /* public static void main(String[] args) {


        SamplePOJO sp = new SamplePOJO("ad", "ad", 1, "sdf");
        ObjectMapper objectMapper = new ObjectMapper();

        String json;

        {
            try {
                json = objectMapper.writeValueAsString(sp);
                System.out.println(json);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }

        String json1 = "{\"name\":\"ad\",\"address\":\"ad\",\"id\":1,\"user\":\"sdf\"}";

        // Convert JSON to Person object
        ObjectMapper objectMapper1 = new ObjectMapper();
        try {
            SamplePOJO sp1 = objectMapper1.readValue(json1, SamplePOJO.class);
            System.out.println("Name: " + sp.getName());
            System.out.println("Age: " + sp.getAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

}
