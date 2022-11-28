package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);

        System.out.print("Input year of birth: ");
        int yearOfbirth = in.nextInt();
        int age = currentYear-yearOfbirth;

        System.out.println("You are " +age+ " years old");
    }
}
