package home_work_2.loop;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        double a = 0.0;
        int b = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число:");
        a = console.nextDouble();
        System.out.println("Введите второе число:");
        b = console.nextInt();
        System.out.println(a + " ^ " + b + " = " +alg(a, b));
    }
    private static double alg(double x, int y){
        double z = 1.0;
        for(int i = 0; i < y; i++){
            z = z * x;
        }
        return z;
    }
}
