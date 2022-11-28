package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number A: ");
        int a = in.nextInt();

        System.out.print("Input number B: ");
        int b = in.nextInt();

        int c = a+b;

        System.out.printf("A+B=" + c);
        in.close();
    }
}