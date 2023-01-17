package opd;

import java.util.Scanner;

public class Lr5 {

    public static void main(String[] args) {

        // Создаём 4 массива для статистики часов
        Scanner in = new Scanner(System.in);
        int size = 3;
        float[] mass1 = new float[size];
        float[] mass2 = new float[size];
        float[] mass3 = new float[size];
        float[] mass4 = new float[size];

        // Заполняем все 4 массива данными тестового расчёта
        // 2 - 20 час.
        System.out.print("Введите статистику для одного экрана:");
        for(int i=0;i<mass1.length;i++){
            mass1[i] = in.nextInt();
        }
        // 4 - 32 час.
        System.out.print("Введите статистику для одного обработчика событий: ");
        for(int i=0;i<mass2.length;i++){
            mass2[i] = in.nextInt();
        }
        // 2 - 8 час.
        System.out.print("Введите статистику для нового бизнес объекта: ");
        for(int i=0;i<mass3.length;i++){
            mass3[i] = in.nextInt();
        }
        // 2 - 26 час.
        System.out.print("Введите статистику для добавления нового бизнес метода:");
        for(int i=0;i<mass4.length;i++){
            mass4[i] = in.nextInt();
        }
        // Вводим значения количества работ из тестового расчёта
        System.out.print("Введите количество экранов:");
        float Kui = in.nextInt();
        System.out.print("Введите количество обработчиков событий: ");
        float KAct = in.nextInt();
        System.out.print("Введите количество новых бизнес-объектов: ");
        float Kbo = in.nextInt();
        System.out.print("Введите количество бизнес-методов: ");
        float Kbm = in.nextInt();
        // Считаем оценку средней трудоемкости кодирования
        float Eui = (mass1[1] + (4*mass1[2]) + mass1[0])/6; // экраны
        float EAct = (mass2[1] + (4*mass2[2]) + mass2[0])/6; // обработчики
        float Ebo = (mass3[1] + (4*mass3[2]) + mass3[0])/6; // бизнес-обьекты
        float Ebm = (mass4[1] + (4*mass4[2]) + mass4[0])/6; // бизнес-методы
        //Выводим среднюю трудоемкость на экран
        System.out.println("Средняя трудоемкость для:");
        System.out.println("Для пользовательских экранов (Eui) = " + Eui);
        System.out.println("Для обработчиков событий (EAct) = " + EAct);
        System.out.println("Для бизнес-объектов (Ebo) = " + Ebo);
        System.out.println("Для бизнес-методов (Ebm) = " + Ebm);
        // Считаем среднеквадратичное отклонение
        float CKOui = (mass1[1] - mass1[0])/6;
        float CKOAct = (mass2[1] - mass2[0])/6;
        float CKObo = (mass3[1] - mass3[0])/6;
        float CKObm = (mass4[1] - mass4[0])/6;
        //Выводим среднеквадратичное отклонение на экран
        System.out.println("Среднеквадратичное отклонение для: ");
        System.out.println("Для пользовательских экрано (CKOui) = " + CKOui);
        System.out.println("Для обработчиков событий (CKOAct) = " + CKOAct);
        System.out.println("Для бизнес-объектов (CKObo) = " + CKObo);
        System.out.println("Для бизнес-методов (CKObm) = " + CKObm);
        // Считаем суммарную трудоемкость кодирования проекта
        float E = (Kui * Eui) + (KAct * EAct) + (Kbo * Ebo) + (Kbm * Ebm);
        System.out.println("Сумарная трудоемкость кодирования (E) = " + E + " чел.*час");
        // Считаем среднеквадратичное отклонение для оценки суммарной трудоемкости кодирования
        float CK = (Kui * (CKOui * CKOui)) + (KAct * (CKOAct * CKOAct)) + (Kbo * (CKObo * CKObo)) + (Kbm * (CKObm * CKObm));
        double CKO = Math.sqrt(CK);
        System.out.println("Среднеквадратичное отклонение для оченки суммарной трудоемкости (CKO)= " + CKO + " чел.*час");
        // Считаем суммарную трудоемкость кодирования проекта
        float E95 = E + 2 * (float)CKO;
        System.out.println("Суммарная трудоемкость кодирования проекта (E95) = " + E95 + " чел.*час");
        // Считаем относительную погрешность в оценке суммарной трудоемкости
        float d = ((float)CKO / E) * 100;
        System.out.println("Погрешность в оценке трудоемкости (d) = " + d + "%");
        // Считаем общую трудоемкость проекта
        float Esym = 4 * E95;
        System.out.println("Esym = " + Esym + " чел.*час");
        // Считаем пересчёт человеко-часов в человеко-месяцы
        float Nm = Esym / 132;
        System.out.println("Пересчет чел.*час в ч.*м. Nm = " + Nm + " ч.*м.");
        //Оптимальная продолжительность проекта
        float a = 1;
        float b = 3;
        float c = a / b;
        double x = Math.pow(Nm, c);
        double T = 2.5 * x;
        System.out.println("Оптимальная продолжительность проекта (T) = " + (float)T + " месяцев");
        float K = Nm / (float)T;
        System.out.println("Средняя численность команды (K) = " + K + " человек");
    }
}
