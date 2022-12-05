package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число А которое делится на 4 и больльше 10: ");
        float a = in.nextInt();
        if (a % 4 == 0 && a >= 10) {
            System.out.print("Успешно, число A делится на 4 и больше 10");
        } else {
            System.out.print("Не успешно, попробуйте еще");
        }
        in.close();
    }
}
