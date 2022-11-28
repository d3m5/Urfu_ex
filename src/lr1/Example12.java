package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);

        System.out.print("Input year old: ");
        int yearsOld = in.nextInt();

        int age = currentYear-yearsOld;

        System.out.println("You are " +age+ " year of birth");
    }
}
