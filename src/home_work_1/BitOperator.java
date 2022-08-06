package home_work_1;

import java.util.Scanner;

public class BitOperator {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Введите первое число:");
    int a = console.nextInt();
    System.out.println("Введите второе число:");
    int b = console.nextInt();
    System.out.println("1: "+Integer.toBinaryString(a));
    System.out.println("2: "+Integer.toBinaryString(b));
    System.out.println("Побитовый И с двумя числами: "+Integer.toBinaryString(a&b));
    /* пример: 548(1000100100) и 777(1100001001)
    1000100100
    &
    1100001001
    ----------
    1000000000
     */
    System.out.println("Побитовый ИЛИ с двумя числами: "+Integer.toBinaryString(a|b));
        /* пример: 548(1000100100) и 777(1100001001)
    1000100100
    |
    1100001001
    ----------
    1100101101
         */
}
}
