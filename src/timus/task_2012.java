package timus;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        in.close();
    }
}
