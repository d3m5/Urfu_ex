package lr6;

public class Example1 {
    private char ch;
    private String str;
    public void SetField(char c) {
        ch = c;
        System.out.println("Вызываем метод SetField c аргументом char -" + ch);
    }
    public void SetField(String s) {
        str = s;
        System.out.println("Вызываем метод SetField c аргументом string - " + str);
    }
    public void SetField(char[] CharArray) {
        if (CharArray.length == 1) {
            ch = CharArray[0];
            System.out.println("Вызываем метод SetField c массивом char - " + ch);
        } else {
            str = new String(CharArray);
            System.out.println("Вызываем метод SetField c массивом string - " + str);
        }
    }


}

class Lab6 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.SetField('A');
        example1.SetField("B");
        char[] CharArray1 = {'С', 'т', 'р', 'о', 'к', 'а'};
        char[] CharArray2 = {'C'};
        example1.SetField(CharArray1);
        example1.SetField(CharArray2);

    }
}
/*
1. Напишите программу с классом, в котором есть два поля: символьное и текстовое.
 В классе должен быть перегруженный метод для присваивания значений нолям.
 Если метод вызывается с символьным аргументом, то соответствующее значение присваивается символьному полю.
 Если метод вызывается с текстовым аргументом, то он определяет значение текстового ноля.
 Методу аргументом также может передаваться символьный массив.
 Если массив состоит из одного элемента, то он определяет значение символьного поля.
 В противном случае (если в массиве больше одного элемента) из символов массива формируется текстовая строка и присваивается значением текстовому полю
 */