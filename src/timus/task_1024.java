package timus;

import java.util.Scanner;

public class task_1024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int p[] = new int[N + 1];
        long t[] = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            p[i] = in.nextInt();
        }
        t[0] = 1;
        for (int i = 1; i <= N; i++) {

            int m = p[i];
            t[i] = 1;
            while (m != i) {
                m = p[m];
                t[i]++;
            }
        }
        System.out.println(lcm(t, N + 1));
    }

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static long lcm(long[] a, int n) {
        long res = 1;
        for (int i = 0; i < n; i++) {
            res = res * a[i] / gcd(res, a[i]);
        }
        return res;
    }

}