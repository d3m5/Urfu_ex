package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        int a = in.nextInt();
        System.out.println("Введите второе число : ");
        int b = in.nextInt();
        if (a > b) {
            System.out.print("FOR : ");
            for (int i = b; a  >= i; i++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
            System.out.print("WHILE: ");
            int count = b;
            while (count <= a){
                System.out.print(count + " ");
                count++;
            }
        } else if (b > a) {
            System.out.print("FOR : ");
            for (int i = a; b  >= i; i++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
            System.out.print("WHILE: ");
            int count = a;
            while (count <= b){
                System.out.print(count + " ");
                count++;
            }
        }
        in.close();
    }
}
/*
4. Напишите программу, в которой пользователем вводится два
        целых числа. Программа выводит все целые числа — начиная с наименьшего
        (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
        чисел). Предложите разные версии программы (с использованием разных
        операторов цикла).*/