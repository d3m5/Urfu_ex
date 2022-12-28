package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.print("Введите ключ для шифрования (цифры 1 - 32) : ");
        int key = in.nextInt();
        if (key > 0 && key < 32) {
            char[] chars = text.toCharArray();
            int[] ints = new int[text.length()];
            for (int i = 0; i < chars.length; i++) {
                ints[i] = chars[i] + key;
                chars[i] = (char) ints[i];
            }
            System.out.println("Текст после преобразования - " + Arrays.toString(chars));
            System.out.print("Произвести обратное преобразование? Y(да) или N(нет) ");
            String answer = in.next();
            if (answer.equals("y")){
                for (int i = 0; i < chars.length; i++) {
                    ints[i] = chars[i] - key;
                    chars[i] = (char) ints[i];
                }
                System.out.println("Текст после преобразования - " + Arrays.toString(chars));
            }
            else if(answer.equals("n")) {
                System.out.println("До свидания!");
            }
            else {
                System.out.println("Вы ввели не правильное значение, проверьте корректность ввода, допустимы буквы Y и N");
            }
        } else {
            System.out.println("Вы ввели не правильное значение, проверьте корректность ввода, допустимы цифра от 1 до 32");
        }
    }
}
/*
8. Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст. Используете кодовую таблицу символов.
При запуске программы в консоль необходимо вывести сообщение: «Введите текст для шифрования», после ввода текста, появляется сообщение: «Введите ключ».
После того как введены все данные, необходимо вывести преобразованную строку с сообщением «Текст после преобразования : ».
Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)», если пользователь вводит «y», тогда выполнить обратное преобразование.
Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
Если пользователь вводит что-то другое, отличное от «y» или «n», то программа ему выводит сообщение: «Введите корректный ответ».
*/
