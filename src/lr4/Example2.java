package lr4;

public class Example2 {
    public static void main(String[] args) {
        int z = 5; // высота треугольника
        for (int i = 0; i <= z; i++) {
            for (int s = 0; s <= i; s++) {
                System.out.print("+");
            }
            System.out.print("\n"); // Новая строка
        }
        for (int i = 1; i <= z; i++) {
            for (int s = z; s >= i; s--) {
                System.out.print("+");
            }
            System.out.print("\n"); // Новая строка
        }
    }
}

/*
2. Напишите программу, которая выводит в консольное окно
        прямоугольный треугольник;*/
