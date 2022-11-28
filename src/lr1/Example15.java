package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number A: ");
        int a = in.nextInt();
        System.out.print("Input number B: ");
        int b = in.nextInt();

        System.out.print("A+B=");
        System.out.println(a + b);

        System.out.print("A-B=");
        System.out.println(a-b);

        in.close();
    }
}
