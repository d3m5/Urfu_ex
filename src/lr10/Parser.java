package lr10;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Parser {
    public static void main(String[] args) {
        int out = 0;
        while (out == 0) {
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            Date date = new Date();
            System.out.println("Программа парсер, выберите вид парсера: ");
            System.out.println("1. HTTP парсер, умеет получать температуру с сайта www.gismeteo.ru.");
            System.out.println("2. JSON парсер, умеет писать в файл и читать из файла.");
            System.out.println("3. Excel парсер, умеет писать в файл и читать из файла.");
            System.out.println("4. XML парсер, умеет писапать в файл и читать из файла.");
            System.out.println("5. Выход");
            Scanner in = new Scanner(System.in);
            int select = in.nextInt();
            if (select == 1) {
                System.out.println("Выбран HTTP парсер.");
                System.out.println("Запрос погоды...");
                String url = "https://www.gismeteo.ru/weather-yekaterinburg-4517/"; //Ссылка на город
                //System.out.println("Введите ссылку на город: ");
                //String url = in.next();
                ParseHttp parseHttp = new ParseHttp();
                String[] tempToSite = parseHttp.weatherGismeteo(url);
                System.out.println(dateFormat.format(date));
                try {
                    System.out.println(tempToSite[0] + " " + tempToSite[1]);
                    System.out.println("\n");
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Ошибка " + e);
                    System.out.println("\n");

                }

            }
            else if (select == 2) {
                System.out.println("Выбран JSON парсер.");
                try {
                    Json json = new Json();
                    System.out.println("Запишем данные в JSON:");
                    json.jsonWrite(); // Запишем даные в JSON
                    System.out.println("Прочитаем записаные данные:");
                    json.jsonRead(); //Прочитаем JSON и выведем в консоль
                    System.out.println("\n");
                } catch (NullPointerException e) {
                    System.out.println("Ошибка записи данных \n" + e);
                    e.printStackTrace();
                }
            }
            else if (select == 3) {
                System.out.println("Выбран EXCEL парсер.");
                try {
                    ParseExcel parseExel = new ParseExcel();
                    System.out.println();
                    parseExel.fileWrite();
                    System.out.println();
                    parseExel.readFile();
                    System.out.println("\n");
                } catch (IOException e) {
                    System.out.println("Ошибка доступа к файлу \n" + e);
                }
            }
           else if (select == 4) {
               ParseXML parseXML = new ParseXML();
                System.out.println("Записываем файл... ");
               parseXML.fileWrite();
                System.out.println("Читаем файл... ");
                parseXML.fileRead();
                System.out.println(" Читаем файл... ");
                System.out.println("\n");

            }
           else if (select == 5) {
                System.out.println("Завершаем работу программы...");
                out = 1;

            } else {
                System.out.println("Вы ввели не правильное значение");
                System.out.println("Попробуйте еще раз. \n");
            }
        }
    }
}