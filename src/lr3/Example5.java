package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите желаемое колличество чисел: ");
        int a = in.nextInt();
        int b = 0;
        int c = 0;
        int d = 1;
        System.out.println("Цикл FOR:");
        for (int i = 0; d <= a; i++) {
            b++;
            if (b % 5 == 2 || b % 3 == 1) {
                System.out.print(b);
                c = c + b;
                d++;
                if (d <= a) {
                    System.out.print("+");
                }
            }
        }
        System.out.print("=" + c);

        System.out.print("\n");
        System.out.println("Цикл WHILE:");
        b = 0;
        c = 0;
        int count = 1;
        while (count <= a) {
            b++;
            if (b % 5 == 2 || b % 3 == 1) {
                System.out.print(b);
                c = c + b;
                count++;
                if (count <= a) {
                    System.out.print("+");
                }
            }
        }
        System.out.print("=" + c);
        in.close();
    }
}
/*
5. Напишите программу, в которой вычисляется сумма чисел,
        удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
        вводится пользователем. Программа отображает числа, которые
        суммируются, и значение суммы. Предложите версии программы,
        использующие разные операторы цикла.
*/
