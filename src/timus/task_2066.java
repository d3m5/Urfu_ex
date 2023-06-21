package timus;

import java.util.Scanner;

public class task_2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        int sumMin = 0;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        in.close();
        if (b == 0) {
            sumMin = a * b - c;
        } else if (b == 1) {
            sumMin = a - b - c;
        } else if (b > 0) {
            sumMin = a - b * c;
        }

        System.out.print(sumMin);
    }
}
