package lr6;

public class Example7 {
    public static void main(String[] args) {
        char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        Lab6.convertCharArray(alphabet);
        Lab6.viewArray();

    }
    private static class Lab6 {
        static int[] IntArray;
        private static void convertCharArray(char[] ChArray) {
            IntArray = new int[ChArray.length];
            for (int i = 0; i < ChArray.length; i++) {
                IntArray[i] = ChArray[i];
            }
        }
        private static void viewArray() {
            for (int i = 0; i < IntArray.length; i++) {
                System.out.println("IntArray[" + i + "] = " + IntArray[i]);
            }
        }
    }
}
/*
7. Напишите программу со статическим методом, аргументом которому передастся
        символьный массив, а результатом возвращается ссылка на целочисленным массив,
        состоящий из кодов символов из массива- аргумента.
*/
