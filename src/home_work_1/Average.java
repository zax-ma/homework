package home_work_1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double a = console.nextDouble();

        System.out.println("Введите второе число:");
        double b = console.nextDouble();

        System.out.println("Введите третье число:");
        double c = console.nextDouble();
        double result = averageCalc(a, b, c);
        System.out.println("Среднее из трех = "+result);
    }

    private static double averageCalc(double x, double y, double z) {
        double result = 0.0;
        if ((x < y || x < z) && (x > y || x > z)) {
            result = x;
        }else if ((y < z || y < x) && (y > z || y > x)) {
            result = y;
        } else result = z;
        return result;
    }

}

