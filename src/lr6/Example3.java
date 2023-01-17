package lr6;

public class Example3 {
    private static class Lab6{
    private static void max(int ... array){
        int max = array[0];
        for (int i =0; i<array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Максимальное значение = "+max);
    }
    private static void min(int ... array){
        int min = array[0];
        for (int i =0; i<array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Минимальное значение = "+min);
    }
    private static void avg(int ... array){
        int sum = 0;
        for (int i =0; i<array.length; i++) {
            sum = array[i]+sum;
        }
        double avg = (double)sum/array.length;
        System.out.println("Среднее значение = "+avg);
    }
}
    public static void main(String[] args) {
        Lab6.max(1,0,-9,5,25,-101);
        Lab6.min(3,0,500,-2,33,-5,6,17);
        Lab6.avg(3,0,50,-2,33,-5,6,17);
    }
}
/*
3. Напишите программу с классом, в котором есть статические методы, которым
        можно передавать произвольное количество целочисленных аргументов (или
        целочисленный массив). Методы, на основании переданных аргументов или массива,
        позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
        значение из набора чисел*/
