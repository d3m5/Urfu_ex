package timus;

import java.util.Scanner;

public class task_1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first, second;
        String Answer = "no";
        first = in.nextInt();
        second = in.nextInt();
        in.close();
        if (first % 2 == 0 || second % 2 != 0) {
            Answer = "yes";
        }

        System.out.print(Answer);
    }
}
