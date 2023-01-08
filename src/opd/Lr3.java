package opd;

import java.util.Scanner;

public class Lr3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите бюджет проекта (у.е.): ");
        double budget = in.nextDouble();
        System.out.print("Введите срок сдачи проекта (мес): ");
        double term = in.nextDouble();

        System.out.print("Введите контрольную точку проекта (мес.): ");
        double checkPoint = in.nextDouble();
        System.out.print("Введите текущие затраты (у.е.): ");
        double expenses = in.nextDouble();
        System.out.print("Введите процент выполненой работы (%): ");
        double readiness = in.nextDouble();

        double endpoint = 100  / readiness;
        double currentBudget = (endpoint * expenses) / checkPoint;
        System.out.println("Задержка сроков: " + (endpoint - term) + " мес.");
        System.out.println("Перерасход бюджета: " + (currentBudget - budget) + " у.е.");
    }
}
