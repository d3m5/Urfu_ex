package lr4;

public class Example7 {
    public static void main(String[] args) {
        int str = 10;
        int row = 10;
        int count = 0;
        int[][] arr1 = new int[str][row];
        for (int i = 0; i < str; i++){

            if (i%2 == 0) {
                for (int j = 0; j < row; j++) {
                    arr1[i][j] = count;
                    count++;
                }
            }
            else  {
                for (int j = 9; j >= 0; j--) {
                    arr1[i][j] = count;
                    count++;
                }
            }
        }
        for(int i = 0; i < str; i++){
            for(int j = 0; j < row; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
/*
7. Напишите программу, в которой создается двумерный числовой массив и этот массив заполняется «змейкой»:
сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так далее.*/
