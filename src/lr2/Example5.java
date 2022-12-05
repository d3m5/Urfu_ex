package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число А: ");
        int a = in.nextInt();
        System.out.println("Тысяч в числе A: " + a / 1000);
        in.close();
    }
}
