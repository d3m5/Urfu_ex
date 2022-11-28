package lr1;
import java.util.Scanner;
import java.util.Calendar;

public class Example17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        System.out.print("Input your age: ");
        int old = in.nextInt();

        int yearOFbirth = year - old;

        System.out.printf("Year of birth " + yearOFbirth);
        in.close();



    }
}
