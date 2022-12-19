package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите требуемое колличество чисел: ");
        int a = in.nextInt();
        int c = 1;
        int e = 0;
        System.out.print("FOR: ");
        for (int i = 0; i <= a ; i++) {
           int summ = c + e;
            c = e;
            e = summ;
            System.out.print(e + " ");
        }

        System.out.println(" ");

        e = 0;
        c = 1;
        System.out.print("WHILE: ");
        int count = 0;
        while (count <= a){
            int summ = c + e;
            c = e;
            e = summ;
            System.out.print(e + " ");
            count++;
        }
        in.close();
    }
}

/*
3. Напишите программу, которая выводит последовательность чисел
        Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
        следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
        в последовательности вводится пользователем. Предложите версии
        программы, использующие разные операторы цикла*/
