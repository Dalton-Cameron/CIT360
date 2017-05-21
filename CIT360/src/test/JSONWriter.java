package test;
 
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriter {

 

    private static final String jsonFilePath = "C:\\Users\\camda\\Desktop\\jsonFile.json";

 

    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("URL", "www.camerondalton.com");
        jsonObject.put("Site Name", "Cameron Daltons Site");
        jsonObject.put("Page Views", 124);
 
        JSONArray jsonArray = new JSONArray();
        jsonArray.add("Cameron");
        jsonArray.add("Trevor");
        jsonObject.put("Names", jsonArray);
        try {
            FileWriter jsonFileWriter = new FileWriter(jsonFilePath);
          jsonFileWriter.write(jsonObject.toJSONString());
          jsonFileWriter.flush();
          jsonFileWriter.close();

            System.out.print(jsonObject);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
