package lr6;

public class Example10 {
    public static void main(String[] args) {
        Lab6.calcMaxMin(1,0,-9,5,25,-101);
        Lab6.viewMaxMin();
        Lab6.calcMaxMin(3,0,500,-2,33,-5,6,17);
        Lab6.viewMaxMin();
        Lab6.calcMaxMin(3,0,50,-2,33,-5,6,17);
        Lab6.viewMaxMin();
    }
    protected static class Lab6{
        private static int[] MaxMin;
        private static void calcMaxMin(int ... array){
            int max = array[0];
            int min = array[0];
            for (int i =0; i<array.length; i++) {
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);
            }
            MaxMin= new int[]{max, min};
            //Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
        }
        private static void viewMaxMin() {
            System.out.println("MaxiMin[max] = " + MaxMin[0]);
            System.out.println("MaxiMin[min] = " + MaxMin[1]);
        }
    }
}
/*
        10. Напишите программу со статическим методом, аргументом которому передается
        произвольное количество целочисленных аргументов. Результатом метод возвращает
        массив из двух элементов: это значения наибольшего и наименьшего значений среди
        аргументов, переданных методу*/
