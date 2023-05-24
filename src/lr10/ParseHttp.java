package lr10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ParseHttp {

    protected String[] weatherGismeteo(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Elements city = doc.select("[class=page-title]");
            Elements temp = doc.select("[class=unit unit_temperature_c]");
            String site = city.first().text();
            String temperature = temp.first().text();
            String[] tempToSite = new String[] {site, temperature};
            return tempToSite;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String[]{" "};
    }
}
