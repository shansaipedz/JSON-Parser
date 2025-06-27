/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonpractice2;

/**
 *
 * @author ssmpedrozo
 */
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class MyJSONParser {

    public void parseJSON(String fileName) {
        try {
    JSONParser parser = new JSONParser();
    JSONObject obj = (JSONObject) parser.parse(new FileReader(fileName));

    JSONArray usersArray = (JSONArray) obj.get("users");

    System.out.printf("%-8s %-12s %-12s %-14s %-30s\n", 
        "userId", "firstName", "lastName", "phoneNumber", "emailAddress");
    System.out.println("--------------------------------------------------------------------------------");

    for (Object userObj : usersArray) {
        JSONObject user = (JSONObject) userObj;

        long userId = (Long) user.get("userId");
        String firstName = (String) user.get("firstName");
        String lastName = (String) user.get("lastName");
        String phoneNumber = (String) user.get("phoneNumber");
        String emailAddress = (String) user.get("emailAddress");

        System.out.printf("%-8d %-12s %-12s %-14s %-30s\n", 
            userId, firstName, lastName, phoneNumber, emailAddress);
    }
} catch (Exception e) {
    e.printStackTrace();
}

    }
}
