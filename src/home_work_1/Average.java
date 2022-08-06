package home_work_1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double frstNum = console.nextDouble();

        System.out.println("Введите второе число:");
        double scndNum = console.nextDouble();

        System.out.println("Введите третье число:");
        double thrdNum = console.nextDouble();

        double average = (frstNum + scndNum + thrdNum)/3.0;
        if (average == (int) average) {
            System.out.println("Среднее арифметическое: "+(int) average);
        } else {
            System.out.println("Среднее арифметическое: " + average);
        }
    }
}
