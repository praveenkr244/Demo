package tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestAPI {
    public static void main(String[] args) {


        SmapleCucumber smapleCucumber = new SmapleCucumber("praveen", "first", 1);
        ObjectMapper objectMapper = new ObjectMapper();

        String json;

        {
            try {
                json = objectMapper.writeValueAsString(smapleCucumber);
                System.out.println(json);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
    }
}
