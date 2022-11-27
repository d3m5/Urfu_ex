package lr1;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input First Name: ");
        String lastName = in.next();

        System.out.print("Input Last name: ");
        String firstName = in.next();

        System.out.print("Input patronymic: ");
        String patron = in.next();

        System.out.printf("Hello "+ lastName + " " + firstName + " " + patron);
        in.close();

    }
}