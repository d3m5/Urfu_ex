package timus;

import java.util.Scanner;

public class task_1409{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b - 1;
        System.out.println(c-a);
        System.out.println(c-b);
        in.close();
    }
}
