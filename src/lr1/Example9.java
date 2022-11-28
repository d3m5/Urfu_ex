package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name month: ");
        String month = in.next();
        System.out.print("Input number day: ");
        int date = in.nextInt();
        System.out.printf("Day in month: %s %d ",month, date);
        in.close();
    }

}
