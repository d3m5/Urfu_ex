package lr6;

public class Example5 {
    public static void main(String[] args) {
        int n = 6;
        int sq0 = (n*(n+1)*(2*n+1)/6);
        boolean test;
        System.out.println("Рекурсивный метод");
        int sq1 = squareSum.SquareSum1(n);
        test = sq1 == sq0;
        System.out.println("Вычисление cуvмы квадратов числа "+"\""+n+"\""+" = "+sq1+" ("+test+")");
        System.out.println("\n Метод без рекурсии");
        int sq2 = squareSum.SquareSum2(n);
        test = sq2 == sq0;
        System.out.println("Вычисление cуммы квадратов числа "+"\""+n+"\""+" = "+sq2+" ("+test+")");
    }
    private static class squareSum {
        private static int SquareSum1(int n) {
            //это рекурсивный метод
            int result =0;
            System.out.println("*" + n);
            if (n <= 1) return 1;//проверка входного параметра, если павен 1, то выход из метода
            result += SquareSum1(n-1)+n*n;
            return result;
        }

        private static int SquareSum2(int n){
            //это метод без рекурсии

            int result=0;
            int j = n;
            int s = 2;
            for(int i=n; i>0;i--){
                System.out.println("*" + j);
                result = (int)Math.pow(j,s) + result;
                j--;
            }
            return result;
        }
    }
}

/*
5. Напишите программу со статическим методом, которым вычисляется сумма
        квадратов натуральных чисел 1
        2 + 22 + 32 + ... + п
        2
        . Число п передается аргументом методу.
        Для проверки результата можно использовать формулу 12 + 22 +3 2+…+n2=(n+l) (2n + 1)/6*/
