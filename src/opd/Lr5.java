package opd;

import java.util.Scanner;

public class Lr5 {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int sizeArr = 3;

                //Создаем массивы со временем выполнения работ

                float[] arr1 = new float[sizeArr];
                float[] arr2 = new float[sizeArr];
                float[] arr3 = new float[sizeArr];
                float[] arr4 = new float[sizeArr];

                //Заполняем массивы значениями

                System.out.print("Введите статистику для одного экрана: ");
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = in.nextFloat();
                }
                System.out.print("Введите статистику для одного обрабртчика событий: ");
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = in.nextFloat();
                }
                System.out.print("Введите статистику для нового бизнес-объекта: ");
                for (int i = 0; i < arr3.length; i++) {
                    arr3[i] = in.nextFloat();
                }
                System.out.print("Введите статистику для добавления нового бизнес-метода: ");
                for (int i = 0; i < arr4.length; i++) {
                    arr4[i] = in.nextFloat();
                }

                //Заполняем прикладную разработку данными

                System.out.print("Введите количество пользовательских экранов: ");
                float kUi = in.nextFloat();
                System.out.print("количество обработчиков событий: ");
                float kAct = in.nextFloat();
                System.out.print("количество новых бизнес-объектов: ");
                float kBo = in.nextFloat();
                System.out.print("Введите количество новых или модифицируемых бизнес-методов: ");
                float kBm = in.nextFloat();

                //Считаем оценку средней трудоемкости кодирования (Еi = (Pi + 4Mi + Oi)/6)

                System.out.println("\nОценка средней трудоемкости кодирования:");
                float eUi = (arr1[1] + (4 * arr1[2]) + arr1[0]) / 6f;
                System.out.printf("Eui = %.2f \n", eUi);
                float eAct = (arr2[1] + (4 * arr2[2]) + arr2[0]) / 6f;
                System.out.printf("Eact = %.2f \n", eAct);
                float eBo = (arr3[1] + (4 * arr3[2]) + arr3[0]) / 6f;
                System.out.printf("Ebo = %.2f \n", eBo);
                float eBm = (arr4[1] + (4 * arr4[2]) + arr4[0]) / 6f;
                System.out.printf("Ebm = %.2f \n \n", eBm);

                //Считаем среднеквадратичное отклонение (СКОi = (Pi – Oi)/6)

                System.out.println("\nCреднеквадратичное отклонение:");
                float ckoUi = (arr1[1] - arr1[0]) / 6;
                System.out.printf("CKOui = %.2f \n", ckoUi);
                float ckoAct = (arr2[1] - arr2[0]) / 6;
                System.out.printf("CKOAct = %.2f \n", ckoAct);
                float ckoBo = (arr3[1] - arr3[0]) / 6;
                System.out.printf("CKObo = %.2f \n", ckoBo);
                float ckoBm = (arr4[1] - arr4[0]) / 6;
                System.out.printf("CKObm = %.2f \n", ckoBm);

                //Считаем суммарную трудоемкость проекта (Е = Σ Ei)

                System.out.println("\nСуммарная трудоемкость проекта:");
                float e = (kUi * eUi) + (kAct * eAct) + (kBo * eBo) + (kBm * eBm);
                System.out.printf("E = %.2f \n", e);

                //Считаем среднеквадратичное отклонение для оценки суммарной трудоемкости кодирования

                double lvlCkoUi = Math.pow(ckoUi, 2);
                double lvlCkoAct = Math.pow(ckoAct, 2);
                double lvlCkoBo = Math.pow(ckoBo, 2);
                double lvlCkoBm = Math.pow(ckoBm, 2);
                System.out.println("\nCреднеквадратичное отклонение для оценки суммарной трудоемкости кодирования:");
                float cko1 = (float) (lvlCkoUi * 20 + lvlCkoAct * 60 + lvlCkoBo * 16 + lvlCkoBm * 40);
                float cko = (float) Math.sqrt(cko1);
                System.out.printf("CKO = %.2f \n", cko);

                //Считаем суммарную трудоемкости кодирования проекта (E95% = E + 2 * СКО)

                System.out.println("\nСуммарная трудоемкость кодирования проекта:");
                float e95 = (float) (e + 2 * cko);
                System.out.printf("E95 = %.2f \n", e95);

                //Считаем относительную погрешность в оценке суммарной трудоемкости (Δ= (СКО / Е)*100)

                System.out.println("\nОтносительная погрешность в оценке суммарной трудоемкости:");
                float d = (float) ((cko / e) * 100);
                System.out.printf("Δ = %.2f \n", d);

                //Считаем общую трудоемкость проекта (EΣ= 4* E95%)

                System.out.println("\nОбщая трудоемкость проекта:");
                float eSum = 4 * e95;
                System.out.printf("EΣ = %.2f \n", eSum);


                //Пересчёт человеко-часов в человеко-месяцы (N ч.*м. = EΣ/132)

                System.out.println("\nПересчёт человеко-часов в человеко-месяцы:");
                float nM = eSum / 132;
                System.out.printf("N ч.*м. = %.2f \n", nM);

                //Считаем время выполнения графика для первой поставки (T = 2,5 (N ч.*м.)^1/3,)

                double num1 = 1;
                double num2 = 3;
                double division = num1 / num2;
                double result = Math.pow(nM, division);
                System.out.println("\nВремя выполнения графика для первой поставки:");
                float t = (float) (2.5 * (result));
                System.out.printf("T = %.2f \n", t);

                //Считаем среднюю численность команды: (К = N ч.*м. / Т)

                System.out.println("\nсредняя численность команды:");
                float k = nM / t;
                System.out.printf("K = %.2f \n", k);
            }
}
