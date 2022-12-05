package lr2;

import java.util.Scanner;

public class Example2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Ведите А: ");
            float a = in.nextInt();
            if (a % 5 == 2 && a % 7 == 1 ) {
                System.out.print("A делится на 5 и 7 ");
            } else {
                System.out.print("В остатке не 2 и 1" );

            }
            in.close();
        }
    }
