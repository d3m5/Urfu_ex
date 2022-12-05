package timus.task_2012;

import java.util.Scanner;

public class main {
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
