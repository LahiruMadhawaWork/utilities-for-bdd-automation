package utilities;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ResourceBundle;

public class CustomUtils {
    public static JSONObject stringToJsonObject(String sting_to_convert) throws ParseException {
        JSONParser parser_in = new JSONParser();
        return (JSONObject) parser_in.parse(sting_to_convert);
    }
    // method created for getting URL's from properties file
    public static ResourceBundle getPropertiesFromPropertyFile(String file_name)
    {
        return ResourceBundle.getBundle(file_name); // Load properties file  // name of the properties file
    }
}
