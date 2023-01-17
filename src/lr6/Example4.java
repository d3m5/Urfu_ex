package lr6;

public class Example4 {
    public static void main(String[] args) {
        DoubleFactorial f = new DoubleFactorial();
        int number = 6;
        System.out.println("Рекурсивный метод");
        int fact = f.factRecurse(number);
        System.out.println("Вычисление двойного факториала числа "+number+"!! = "+fact);
        System.out.println("Метод без рекурсии");
        int fact2 = f.factorial(number);
        System.out.println("Вычисление двойного факториала числа "+number+"!! = "+fact2);
    }
    private static class DoubleFactorial {
        private int factRecurse(int n) {
            int result;
            System.out.println("*" + n);
            if (n == 1) return 1;
            if (n == 2) return 2;
            result = factRecurse(n - 2) * n;
            return result;
        }
        private int factorial(int n) {
            int result = n;
            int j = n;
            for(int i=n; i>2;i=i-2){
                System.out.println("*" + j);
                j=j-2;
                result *= j;
            }
            return result;
        }
    }
}
/*
4. Напишите программу, в которой описан статический метод для вычисления
        двойного факториала числа, переданного аргументом методу. По определению, двойной
        факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
        больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
        нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15. */