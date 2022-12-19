package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = "Понедельник";
        String str2 = "Вторник";
        String str3 = "Среда";
        String str4 = "Четверг";
        String str5 = "Пятница";
        String str6 = "Суббота";
        String str7 = "Воскресение";

        System.out.print("Выберите вариант проверки 1 для IF или 2 для SWICH : ");
        int b = in.nextInt();
        System.out.println();
        //IF
        if (b == 1) {
            System.out.print("Введите день недели: ");
            String a = in.next();
            if (a.equalsIgnoreCase(str1)) {
                System.out.println("1й день недели");
            } else if (a.equalsIgnoreCase(str2)) {
                System.out.println("2й день недели");
            } else if (a.equalsIgnoreCase(str3)) {
                System.out.println("3й день недели");
            } else if (a.equalsIgnoreCase(str4)) {
                System.out.println("4й день недели");
            } else if (a.equalsIgnoreCase(str5)) {
                System.out.println("5й день недели");
            } else if (a.equalsIgnoreCase(str6)) {
                System.out.println("6й день недели");
            } else if (a.equalsIgnoreCase(str7)) {
                System.out.println("7й день недели");
            } else {
                System.out.println("Вы не ввели правильного дня недели");
            }
        }
        // SWITCH
        else if (b == 2) {
            System.out.print("Введите день недели: ");
            String a = in.next();
            switch (a) {
                case "Понедельник" -> System.out.println("1й день недели");
                case "Вторник" -> System.out.println("2й день недели");
                case "Среда" -> System.out.println("3й день недели");
                case "Четверг" -> System.out.println("4й день недели");
                case "Пятница" -> System.out.println("5й день недели");
                case "Суббота" -> System.out.println("6й день недели");
                case "Воскресение" -> System.out.println("7й день недели");
                default -> System.out.println("Вы не ввели правильного дня недели");
            }
        }
        else {
            System.out.println("Что-то пошло не так, возможные значения 1 или 2");
        }
        in.close();
    }
}

/*
2. Напишите программу, в которой пользователю предлагается
        ввести название дня недели. По введенному названию программа определяет
        порядковый номер дня в неделе. Если пользователь вводит неправильное
        название дня, программа выводит сообщение о том, что такого дня нет.
        Предложите версию программы на основе вложенных условных операторов и
        на основе оператора выбора switch.*/
