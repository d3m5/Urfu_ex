package timus;

import java.util.Scanner;

public class task_1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        in.close();
        int t = (a * b) % 2;
        String res;
        if (t == 0) {
            res = "[:=[first]";
        } else {
            res = "[second]=:]";
        }

        System.out.println(res);
    }
}
