package lr5;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите num1: ");
        int int1 = id.nextInt();
        System.out.print("Введите num2: ");
        int int2 = id.nextInt();
        Task3 task1 = new Task3();
        Task3 task2 = new Task3(int1);
        Task3 task3 = new Task3(int1,int2);
    }
}
class Task3 {
    private int num1;
    private int num2;

    //конструктор, позволяющий создавать объекты без передачи аргументов
    Task3(){
        System.out.println("Объект Task3(1) без аргументов");
    }
    //конструктор, позволяющий создавать объекты с передачей одного аргумента
    Task3(int num1){
        this.num1 = num1;
        System.out.println("Объект Task3(2) c одним аргументом - "+ num1);
    }
    //конструктор, позволяющий создавать объекты с передачей двух аргументов
    Task3(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Объект Task3(3) c двумя аргументами - " + num1 + " - " + num2);
    }
}

/*
3. Напишите программу с классом, у которого есть два целочисленных поля.
В классе должны быть описаны конструкторы,
позволяющие создавать объекты без передачи аргументов,
с передачей одного аргумента и
с передачей двух аргументов.
 */