package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random rn = new Random();
        int str = 4;
        int row = 3;
        int[][] arr1 = new int[str][row];

        //Записываем массив 1 случайными числами
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < row; j++) {
                int random = rn.nextInt(1000) + 1;
                arr1[i][j] = random;
            }
        }
        //Выводим оригинальный массив
        System.out.println("Оригинальный массив : ");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }
        //Перезаписываем данные в массив 2
        int[][] arr2 = new int[row][str];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                arr2[i][j] = arr1[j][i];
            }
        }
        //Выводим массив 2
        System.out.println("");
        System.out.println("Измененный массив : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

/*
5. Напишите программу, в которой создается двумерный целочисленный массив.
 Он заполняется случайными числами. Затем в этом массиве строи и столбцы меняются местами:
 первая строка становится первым столбцом, вторая строка становиться вторым столбцом и так далее.
 Например, если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив из 5 строк и 3 столбцов.*/
