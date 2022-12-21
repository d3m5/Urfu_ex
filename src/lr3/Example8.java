package lr3;

public class Example8 {
    public static void main(String[] args) {
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String b = "BCDFGHJKLMNPQRSTVWXYZ";
        String[] arr1 = new String[10];
        int count = 0;
        for (int i = 0; i < 26; i++ ) {
            char c = a.charAt(i);
            for (int e = 0; e < 21; e++){
                char d = b.charAt(e);
                if (c == d) {
                    arr1[count] = Character.toString(c);
                    count++;
                }
            }
            if (count == 10) {
                break;
            }
        }
        for (int i = 0; i < 10; i++ ) {
            System.out.print(arr1[i] + ",");
        }
        }
    }
/*
8. Напишите программу, в которой создается символьный массив из
        10 элементов. Массив заполнить большими (прописными) буквами
        английского алфавита. Буквы берутся подряд, но только согласные (то есть
        гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
        нужно пропустить). Отобразите содержимое созданного массива в консольном
        окне.*/
