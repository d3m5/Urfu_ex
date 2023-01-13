package lr5;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любой символ: ");
        String symbol = in.next();
        task1.setCh1(symbol.charAt(0));

        System.out.println("getCodeSymbol = " + task1.getCodeSymbol());

        task1.showCodeAndValue();

    }
}
class Task1 {
    private char ch1;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }
    public int getCodeSymbol(){
        return ch1;
    }
    public void showCodeAndValue(){
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int) ch1);
    }
}
/*
1. Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода.
 Один из методов позволяет присвоить значение полю. Еще один метод при вызове возвращает результатом код символа.
 Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.*/