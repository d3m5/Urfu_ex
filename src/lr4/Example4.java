package lr4;


public class Example4 {
    public static void main(String[] args) {
        int str = 10;//Строки
        int row = 10; //Столбцы
        String[][] arr1 = new String[str][row];
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < row; j++) {
                if (i >= j) {
                    arr1[i][j] = "*";
                } else {
                    arr1[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < str; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println(" ");
        }
    }
}

/*
4. Напишите программу, в которой создается двумерный массив, который
        выводит прямоугольный треугольник;*/
