package timus;

import java.math.BigInteger;
import java.util.Scanner;

public class task_1012 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        BigInteger K = BigInteger.valueOf(in.nextInt());

        BigInteger M = K.subtract(BigInteger.ONE);
        BigInteger D = BigInteger.ZERO;
        int i;
        for (i = 1; i < N; i++) {
            BigInteger T = M;
            M = M.multiply(K).subtract(D);
            D = T.subtract(D);
        }
        System.out.println(M);
    }
}
