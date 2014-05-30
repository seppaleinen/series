package converters.jsonparser;

import objects.PirateBay;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GsonParser {
    private Gson gson;
    private JsonParser jsonParser;
    private JsonArray jsonArray;

    public GsonParser(){
        gson = new Gson();
        jsonParser = new JsonParser();
    }

    public List<PirateBay> getPirateBayObjectFromJSON(InputStream inputStream){
        List<PirateBay> pirateBayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        jsonArray = jsonParser.parse(bufferedReader).getAsJsonArray();
        for(JsonElement element : jsonArray){
            pirateBayList.add(gson.fromJson(element, PirateBay.class));
        }
        return pirateBayList;
    }
}
