package lr4;

public class Example3 {
    public static void main(String[] args) {
        int a = 3; // Строки
        int b = 20; // Столбцы
        int[][] arr1 = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = 2;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.print("\n");
        }
    }
}
/*
3. Напишите программу, в которой создается двумерный массив, который
        выводи прямоугольник из цифр 2;
*/
