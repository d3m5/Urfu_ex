package lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name day: ");
        String day = in.next();
        System.out.print("Input month: ");
        String month = in.next();
        System.out.print("Input number day: ");
        int date = in.nextInt();
        System.out.printf("Today: %s %s %d ", day, month, date);
        in.close();

    }
}
