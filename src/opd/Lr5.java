package opd;

import java.util.Scanner;

public class Lr5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 3;

        //массивы со временем выполнения
        float[] mUiForm = new float[size];
        float[] mAction = new float[size];
        float[] mBObject = new float[size];
        float[] mBMethod = new float[size];
        //Ввод
        //заполнеяем массивы
        System.out.print("Введите статистику для одного экрана: ");
        for (int i = 0; i < mUiForm.length; i++){
            mUiForm[i] = in.nextFloat();
        }
        System.out.print("Введите статистику для одного обработчика событий: ");
        for (int i = 0; i < mAction.length; i++){
            mAction[i] = in.nextFloat();
        }
        System.out.print("Введите статистику для нового бизнес-объекта: ");
        for (int i = 0; i < mBObject.length; i++){
            mBObject[i] = in.nextFloat();
        }
        System.out.print("Введите статистику для добавления нового бизнес-метода: ");
        for (int i = 0; i < mBMethod.length; i++){
            mBMethod[i] = in.nextFloat();
        }

        // заполняем "попугаев" в которых измерялся проект
        System.out.print("Введите количество пользовательских экранов: ");
        float kUi = in.nextFloat();
        System.out.print("количество обработчиков событий: ");
        float kAct = in.nextFloat();
        System.out.print("количество новых бизнес объектов: ");
        float kBo = in.nextFloat();
        System.out.print("Введите количество бизнес методов: ");
        float kBm = in.nextFloat();
        // Расчет
        //cчитаем оценку средней трудоемкости кодирования (Еi = (Pi + 4Mi + Oi)/6)
        float eUi = (mUiForm[1] + (4 * mUiForm[2]) + mUiForm[0]) / 6f;
        float eAct = (mAction[1] + (4 * mAction[2]) + mAction[0]) / 6f;
        float eBo = (mBObject[1] + (4 * mBObject[2]) + mBObject[0]) / 6f;
        float eBm = (mBMethod[1] + (4 * mBMethod[2]) + mBMethod[0]) / 6f;

        //cчитаем среднеквадратичное отклонение (СКОi = (Pi – Oi)/6)
        float ckoUi = (mUiForm[1] - mUiForm[0]) / 6;
        float ckoAct = (mAction[1] - mAction[0]) / 6;
        float ckoBo = (mBObject[1] - mBObject[0]) / 6;
        float ckoBm = (mBMethod[1] - mBMethod[0]) / 6;

        //cчитаем суммарную трудоемкость проекта (Е = Sum Ei)
        float e = kUi*eUi + kAct*eAct + kBo*eBo + kBm*eBm;

        //cчитаем среднеквадратичное отклонение для оценки суммарной трудоемкости кодирования
        float cko = (float) Math.sqrt((ckoUi*ckoUi*kUi + ckoAct*ckoAct*kAct + ckoBo*ckoBo*kBo + ckoBm*ckoBm*kBm));

        //cчитаем суммарную трудоемкости кодирования проекта (E95% = E + 2 * СКО)
        float e95 = e + 2 * cko;

        //cчитаем относительную погрешность в оценке суммарной трудоемкости (delta= (СКО / Е)*100)
        float delta = (cko / e) * 100;

        //Считаем общую трудоемкость проекта (EΣ= 4* E95%)
        float eSum = 4 * e95;

        //перевод человеко-часов в человеко-месяцы (N ч.*м. = EΣ/132)
        float nM = eSum / 132;

        //считаем время для первой поставки (T = 2,5 (N ч.*м.)^1/3,)
        float step = 1f / 3f;
        double nMstep = Math.pow(nM,step );
        float t = (float) (2.5f * nMstep);

        //Считаем среднюю численность команды: (К = N ч.*м. / Т)
        float command = nM / t;
        //  Вывод
        //выводим оценку средней трудоемкости кодирования (Еi = (Pi + 4Mi + Oi)/6)
        System.out.println();
        System.out.println("Оценка средней трудоемкости кодирования:");
        System.out.println("Eui = " + eUi);
        System.out.println("Eact = " + eAct);
        System.out.println("Ebo = " + eBo);
        System.out.println("Ebm = " + eBm);
        System.out.println();

        //выводим среднеквадратичное отклонение (СКОi = (Pi – Oi)/6)
        System.out.println("Cреднеквадратичное отклонение:");
        System.out.println("CKOui = " + ckoUi);
        System.out.println("CKOAct = " + ckoAct);
        System.out.println("CKObo = " + ckoBo);
        System.out.println("CKObm = " + ckoBm);
        System.out.println();

        //выводим суммарную трудоемкость проекта (Е = Sum Ei)
        System.out.print("Суммарная трудоемкость проекта: ");
        System.out.println("E = " + e);
        System.out.println();

        //выводим среднеквадратичное отклонение для оценки суммарной трудоемкости кодирования
        System.out.println("Cреднеквадратичное отклонение для оценки суммарной трудоемкости кодирования:");
        System.out.println("CKO = " + cko);
        System.out.println();

        //выводим суммарную трудоемкости кодирования проекта (E95% = E + 2 * СКО)
        System.out.println("Суммарная трудоемкость кодирования проекта:");
        System.out.println("E95 = " + e95);
        System.out.println();

        //выводим относительную погрешность в оценке суммарной трудоемкости (delta= (СКО / Е)*100)
        System.out.println("Относительная погрешность в оценке суммарной трудоемкости:");
        System.out.println("delta = " + delta);
        System.out.println();

        //Считаем общую трудоемкость проекта (EΣ= 4* E95%)
        System.out.println("Общая трудоемкость проекта:");
        System.out.println("EΣ = " + eSum);
        System.out.println();

        //перевод человеко-часов в человеко-месяцы (N ч.*м. = EΣ/132)
        System.out.println("перевод человеко-часов в человеко-месяцы:");
        System.out.println("N ч.*м. = " + nM);
        System.out.println();

        //выводим время для первой поставки (T = 2,5 (N ч.*м.)^1/3,)
        System.out.println("Время выполнения графика для первой поставки:");
        System.out.println("T = " + t);
        System.out.println();

        //Считаем среднюю численность команды: (К = N ч.*м. / Т)
        System.out.println("средняя численность команды:");
        System.out.println("K = "+ command);
        System.out.println();
    }
}
