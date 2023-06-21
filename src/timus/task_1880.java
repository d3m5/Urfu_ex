package timus;

import java.util.Scanner;

public class task_1880 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        int count = 0;
        a = in.nextInt();
        int[] numA = new int[a];
        for (int i = 0; i < a; i++) {
            numA[i] = in.nextInt();
        }
        b = in.nextInt();
        int[] numB = new int[b];
        for (int i = 0; i < b; i++) {
            numB[i] = in.nextInt();
        }
        c = in.nextInt();
        int[] numC = new int[c];
        for (int i = 0; i < c; i++) {
            numC[i] = in.nextInt();
        }
        for (int i1 : numA) {
            for (int i2 : numB) {
                if (i1 == i2) {
                    for (int i3 : numC) {
                        if (i1 == i2 && i2 == i3 && i3 == i1) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
