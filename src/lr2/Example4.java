package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цисло от 5 до 10: ");
        int a = in.nextInt();
        if (a >= 5 && a <=10)
            System.out.print("Попали в диапазон 5 - 10");
        else {
            System.out.print("Не попали в диапазон 5 - 10");
        }
        in.close();
    }
}
