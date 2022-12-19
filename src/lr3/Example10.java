package lr3;

import java.util.Arrays;
import java.util.Collections;

public class Example10 {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[30];
        int a = 0;
        int b = 100;
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = a + (int) (Math.random() * b) ;
        }
        System.out.println("Оригинальный массив: " + Arrays.toString(arr1));
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println("Отсортированный массив по убыванию: " + Arrays.toString(arr1));

    }
}
/*
10. Напишите программу, в которой создается целочисленный
        массив, заполняется случайными числами и после этого значения элементов в
        массиве сортируются в порядке убывания значений.*/