package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Json {

    protected void weatherSave(String site, String date, String temperature){
        JSONObject logTemerature = new JSONObject();
        JSONArray sites = new JSONArray();

        JSONObject site1 = new JSONObject();
        site1.put("site", site);
        site1.put("date", date);
        site1.put("temperature", temperature);
        sites.add(site1);
        logTemerature.put("sites", sites);

        try {
            FileWriter file = new FileWriter("src\\lr10\\Site-temperature.json", false);
            file.write(logTemerature.toJSONString());
            file.flush();
            file.close();
            System.out.println("Json файл успешно создан");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    protected void weatherRead(){
        try{
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src\\lr10\\Site-temperature.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("sites");

            for (Object o :jsonArray){
                JSONObject weather = (JSONObject) o;
                System.out.println("Запомненая погода");
                System.out.println("Город:  " + weather.get("site"));
                System.out.println("Дата:  " + weather.get("date"));
                System.out.println("Температура: " + weather.get("temperature") + " C");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
