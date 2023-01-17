package lr6;

public class Example2 {
    private static int val1;

    public static void view() {
        System.out.println(val1);
        val1++;
    }

    public static void main(String[] args) {
        view();
        view();
        view();
        view();
    }
}
/*
2. Напишите программу с классом, в котором есть закрытое статическое целочисленное ноле с начальным нулевым значением.
В классе должен быть описан статический метод, при вызове которого отображается текущее значение статического поля,
 после чего значение поля увеличивается на единицу.
 */
