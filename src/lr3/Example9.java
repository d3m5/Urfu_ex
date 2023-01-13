package lr3;

import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int[] arr1 = new int[20];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = a + (int) (Math.random() * b) ;
        }
        Arrays.sort(arr1);
        System.out.println("Знчения массива: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Минимальные знчения массива: ");
        for (int i = 0; i < arr1.length; i++)
        if(arr1[0] == arr1[i]){
            System.out.println( "Значение: "+ arr1[i] + " Индекс: " + i);
        }
    }
}

/*
9. Напишите программу, в которой создается массив и заполняется
        случайными числами. Массив отображается в консольном окне. В этом
        массиве необходимо определить элемент с минимальным значением. В
        частности, программа должна вывести значение элемента с минимальным
        значением и индекс этого элемента. Если элементов с минимальным
        значением несколько, должны быть выведены индексы всех этих элементов.*/
