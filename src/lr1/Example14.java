package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int a = in.nextInt();

        int b = a-1;
        int c = a+1;
        int e = a + b + c;

        System.out.print("Output: ");
        System.out.print(b + " ");
        System.out.print(a + " ");
        System.out.print(c + " ");
        System.out.print(e*e);

        in.close();

    }
}