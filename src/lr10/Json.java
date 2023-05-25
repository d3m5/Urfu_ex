package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Json {
    final String filename = "src\\lr10\\json-example.json";

    protected void jsonWrite() {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", 1869);

        JSONObject book2 = new JSONObject();
        book2.put("title", "Война и мир");
        book2.put("author", "Лев Толстой");
        book2.put("year", 1869);

        books.add(book1);
        books.add(book2);
        library.put("books", books);

        try {
            FileWriter file = new FileWriter(filename, false);
            file.write(library.toJSONString());
            file.flush();
            file.close();
            System.out.println("Json файл успешно создан " + filename);
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected void jsonRead() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(filename));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\n Текущий элемент: book");
                System.out.println("Название:  " + book.get("title"));
                System.out.println("Автор:  " + book.get("author"));
                System.out.println("Год: " + book.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
