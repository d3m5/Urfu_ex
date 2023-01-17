package lr6;

import java.util.Random;

public class Example8 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        int ArrayLength = 11;
        int[] intArray = new int[ArrayLength];
        for (int i = 0 ; i <ArrayLength; i++){
            intArray[i] = random.nextInt(1000);
            System.out.println("intArray["+i+"] = "+intArray[i]);
        }

        System.out.println("Среднее значение intArray["+ArrayLength+"] = "+Lab6.ArrayAvg(intArray));
    }
    protected static class Lab6{
        private static double ArrayAvg (int[] Array){
            int sum=0;
            for (int j : Array) {
                sum += j;
            }
            return (double)sum/Array.length;
        }
    }
}
/*
8. Напишите программу со статическим методом, аргументом которому передается
        целочисленный массив, а результатом возвращается среднее значение для элементов
        массива (сумма значений элементов, деленная на количество элементов в массиве).
*/
