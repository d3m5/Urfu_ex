package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random(200); // Создание объекта класса Random
        int str = 5;
        int row = 5;
        int[][] arr1 = new int[str][row]; // создание первого массива
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < row; j++) {
                arr1[i][j] = random.nextInt(200);
            }
        }
        //Вывод  массива построчно
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        int deleteStr = random.nextInt(str - 1);
        int deleteRow = random.nextInt(row - 1);

        System.out.println("Удалили строку = " + (deleteStr));
        System.out.println("Удалили столбец = " + (deleteRow));
        System.out.println(" ");

        int[][] arr2 = new int[str - 1][row - 1]; // создание массива в котором удалена 1 строка и 1 столбец
        for (int i = 0, s = 0; i < str - 1; s++) {
            if (s != deleteStr) {
                for (int j = 0, k = 0; j < row - 1; k++) {
                    if (k != deleteRow) {
                        arr2[i][j] = arr1[s][k];
                        j++;
                    }
                }
                i++;
            }
        }

        //Вывод  массива построчно
        for (int i = 0; i < str - 1; i++) {
            for (int j = 0; j < row - 1; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
/*
6. Напишите программу, в которой создается и инициализируется двумерный числовой массив.
Затем из этого массива удаляется строка и столбец (создается новый массив, в котором по сравнению с исходным удалена одна строка и один столбец).
Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.
*/
