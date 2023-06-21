package timus;

import java.util.Scanner;

public class task_1225 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        long f[] = new long[46];

        f[1] = 2;
        f[2] = 2;
        for (int i = 3; i <= N; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        System.out.println(f[N]);
    }

}

