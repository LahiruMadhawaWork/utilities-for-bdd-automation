package utilities;

import com.google.gson.Gson;

public class JsonUtil {
    private static final Gson GSON = new Gson();

    public static <T> String objectToJson(T objectToJson) {
        Gson gson = new Gson();
        return gson.toJson(objectToJson);
    }

    public static String cleanJson(String json) {
        return json.replaceAll("\\\\", "")
                .replaceAll("\"\\{", "\\{")
                .replaceAll("\\}\"", "\\}")
                .replaceAll("\"", "")
                .replaceAll("\\s", "")
                .replaceAll("=", ":");
    }

    public static <T> T getObjectFromJsonString(String jsonString, Class<T> classToMap) {

        return GSON.fromJson(jsonString, classToMap);
    }

    public static <T> T[] getObjectArrayFromJsonString(String jsonString, Class<T[]> classToMap) {

        return GSON.fromJson(jsonString, classToMap);
    }
}
