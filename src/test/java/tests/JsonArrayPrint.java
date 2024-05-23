package tests;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class JsonArrayPrint {
    public static void main(String[] args) throws ParseException {

        String js = "{\n" +
                "\t\"students\":[\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"Ram\",\n" +
                "\t\t\t\"score\" : 80,\n" +
                "\t\t\t\"marks\" : [\n" +
                "\t\t\t\t70,\n" +
                "\t\t\t\t80,\n" +
                "\t\t\t\t50\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"Hari\",\n" +
                "\t\t\t\"score\" : 90,\n" +
                "\t\t\t\"marks\" : [\n" +
                "\t\t\t\t50,\n" +
                "\t\t\t\t90,\n" +
                "\t\t\t\t60\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"Sita\",\n" +
                "\t\t\t\"score\" : 80,\n" +
                "\t\t\t\"marks\" : [\n" +
                "\t\t\t\t75,\n" +
                "\t\t\t\t80,\n" +
                "\t\t\t\t60\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"Gita\",\n" +
                "\t\t\t\"score\" : 90,\n" +
                "\t\t\t\"marks\" : [\n" +
                "\t\t\t\t70,\n" +
                "\t\t\t\t40,\n" +
                "\t\t\t\t60\n" +
                "\t\t\t]\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}\n";

        JSONParser parser = new JSONParser();

        try {
            // Parse JSON string
            JSONObject jsonObject = (JSONObject) parser.parse(js);

            // Get the students array
            JSONArray studentsArray = (JSONArray) jsonObject.get("students");

            for (Object obj : studentsArray) {
                JSONObject studentObject = (JSONObject) obj;
                String name = (String) studentObject.get("name");
                int score = (int) studentObject.get("score");
               // int[] marks = (int[]) studentObject.get("marks");

                System.out.println("Name: " + name);
                System.out.println("score: " + score);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        }
}