package timus.task_1293;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a*b*p*2);
        in.close();
    }
}
