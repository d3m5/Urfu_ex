package lr10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ParseHttp {

    protected String[] weatherGismeteo(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Elements city = doc.select("[class=page-title]"); //Город
            Elements temp = doc.select("[class=unit unit_temperature_c]"); //Температура
            String site = city.first().text();
            String temperature = temp.first().text();

            return new String[]{site, temperature}; //Полученые данные возвращаем в массиве
        } catch (IOException e) {
            System.out.println("Невозможно получить данные, проверьте адрес \n" + e);
        }
        return new String[]{}; //Возвращаем пустой массив для корректной обработки ошибки
    }
}
