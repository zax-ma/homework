package home_work_2;

import java.util.Scanner;
/*
* метод largestNum возвращает наибольшую цифру в заданном числе, использует цикл while;
* метод randomEven возвращает вероятность генерации случайного четного числа в заданном диапазоне, цикл for
* метод evenOddNum возвращает количество четных и нечетных цифр в заданном числе, цикл while
* метод fibonachi возвращает ряд Фибоначи по заданному количеству элементов, цикл for
* метод numbersInStep возвращает ряд числе в заданном диапазоне с заданным шагом, цикл for
* метод numberFlip возвращает перевернутое значение числа, цикл while
* */

public class Presentation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //    System.out.println("Наибольшая цифра натурального числа: "+largestNum(761582));
        //    System.out.println("Вероятность четных случайных чисел: "+randomEven(1000));
        //    System.out.println(evenOddNum(34560));
        //    System.out.println("Ряд Фибоначи: "+fibonachi(9));
        //     System.out.println("Для вывода ряда чисел с шагом \nВведите минимум: ");
        //    int a = console.nextInt();
        //    System.out.println("Введите максимум: ");
        //     int b = console.nextInt();
        //    System.out.println("Введите шаг: ");
        //    int c = console.nextInt();
        //    System.out.println("Ряд чисел в диапазоне от "+a+" до "+b+ " с шагом "+ c + numbersInStep(a, b, c));
        //    System.out.println("Переворот числа: " + numberFlip(358));

    }

    private static int largestNum(int x) {
        float y = x % 10;
        x = x / 10;
        while (x > 0) {
            if (x % 10 > y) {
                y = x % 10;
            } x = x / 10;
        }
        return (int)y;
    }

    private static float randomEven(int x) {
        int q = 0;
        for (int i = 0; i < x; i++) {
            double j = Math.random() * x;
            if ((int)j % 2 == 0) {
                q += 1;
            }
        }
        return (float)q / x * 100;
    }

    private static String evenOddNum(int x) {
        int e = 0;
        int od = 0;
        String result = "В числе: "+ x;
        while (x > 0) {
            if (x % 2 == 0) {
                e++;
            } else od++;
            x = x / 10;
        }
        result += "\n четных цифр: "+ e + "\n нечетных цифр: " + od;
        return result;
    }

    private static String fibonachi(int x){
        int f1 = 1;
        int f2 = 2;
        int buf = 0;
        String result = "1 2";
        for (int i = 3; i <= x; i++){
            buf = f1;
            f1 = f2;
            f2 = buf + f1;
            result += " "+ f2;
        }
        return result;
    }

    private static String numbersInStep(int x, int y, int z){
        int b = 0;
        String result = ": ";
        for(int i = x; i < y; i = i + z) {
            b = i;
            result += " "+ b;
        }
    return result;
    }

    private static int numberFlip(int x){
        int a = 0;
        while (x > 0){
            a = a*10 + x%10;
            x = x/10;
        }
        return a;
    }
}
