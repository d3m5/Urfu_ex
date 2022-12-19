package lr3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите номер дня недели: ");
        int a = in.nextInt();
        if (a > 0 && a < 8 ) {
            switch (a) {
                case 1 -> System.out.println("Понедельник");
                case 2 -> System.out.println("Вторник");
                case 3 -> System.out.println("Среда");
                case 4 -> System.out.println("Четверг");
                case 5 -> System.out.println("Пятница");
                case 6 -> System.out.println("Суббота");
                case 7 -> System.out.println("Воскресение");
            }
        }
        else {
            System.out.println("Вы ввели не правильное число, допустимые значения от 1 до 7.");
        }
        in.close();
    }
}

/*
1. Напишите программу, в которой пользователь вводит целое число
        в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
        Если введенное пользователем число выходит за допустимый диапазон,
        выводится сообщение о том, что введено некорректное значение. Используйте
        оператор выбора switch.*/
