package home_work_1;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = console.nextDouble();

        System.out.println("Введите второе число:");
        double b = console.nextDouble();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Большее число делится на меньшее");
        } else {
            System.out.println("Числа не делятся =(");
        }
    }
}
