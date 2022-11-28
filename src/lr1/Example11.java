package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);

        System.out.print("Input you name: ");
        String name = in.next();

        System.out.print("Input are years old: ");
        int yearOfbirth = in.nextInt();
        int age = currentYear-yearOfbirth;

        System.out.println("You " + name + " " + age + " year of birth");
    }
}
