package timus;

import java.util.Scanner;

public class task_1083 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int numb = in.nextInt();
        String semne = in.next();

        int howManySemne = 0;

        char[] semneToChar = semne.toCharArray();
        for (char c : semneToChar) {
            howManySemne++;
        }
        int k = 1;
        for (int i = numb; i > 0; i = i - howManySemne) {
            k = k* (numb);
            numb -= howManySemne;
        }
        System.out.println(k);
    }
}
