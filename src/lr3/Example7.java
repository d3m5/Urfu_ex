package lr3;

public class Example7 {
    public static void main(String[] args) {
        int a = 10;
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] arr1 = new String[a];
        int count = 0;
        int i = 0;
        while (i < a){
            char c = abc.charAt(count);
            arr1[i] = Character.toString(c);
            i++;
           count = count + 2 ;
        }
        System.out.println("Вывод от первого элемента к последнему: ");
        count = 0;
        while( count < 10){
            System.out.print(arr1[count] + " ");
            count++;
        }
        System.out.println("\n");
        System.out.println("Вывод от последнего элемента к первому");
        count = 10;
        while( count > 0){
            System.out.print(arr1[count-1] + " ");
            count--;
        }
    }
}
/*
 7.   Напишите программу, в которой создается одномерный
        символьный массив из 10 элементов. Массив заполняется буквами «через
        одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
        ' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
        порядке. Размер массива задается переменной.*/
