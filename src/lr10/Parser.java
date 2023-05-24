package lr10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Parser {
    public static void main(String[] args) {
        String url = "https://www.gismeteo.ru/weather-yekaterinburg-4517/"; //Ссылка на город
        ParseHttp parseHttp = new ParseHttp();
        String[] tempToSite = parseHttp.weatherGismeteo(url);
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Date date = new Date();
        if (tempToSite.length != 0) {
            try {
                Json json = new Json();
                json.weatherSave(tempToSite[0], dateFormat.format(date), tempToSite[1]); // Запишем даные в JSON
                json.weatherRead(); //Прочитаем JSON и выведем в консоль
            } catch (NullPointerException e) {
                System.out.println("Ошибка записи данных \n" + e);
                e.printStackTrace();
            }
        }
    }


}
