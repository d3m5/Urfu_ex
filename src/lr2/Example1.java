package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextInt();
        if (a % 3 == 0) {
            System.out.printf("A делится на 3");
        } else {
            System.out.printf("A не делится на 3");

        }
        ;
    }
}
