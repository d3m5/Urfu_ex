package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.next();
        System.out.print("Input year old: ");
        int yearOld = in.nextInt();
        System.out.printf("Hello " + name + " " + yearOld);
        in.close();
    }
}
