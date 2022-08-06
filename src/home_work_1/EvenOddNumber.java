package home_work_1;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = console.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
