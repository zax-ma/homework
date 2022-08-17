package home_work_2.arrays;

import java.util.Scanner;

public class NumFromConsole {
    public static void main(String[] args) {
        int number;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
            while (!console.hasNextInt()) {

                if (console.hasNextDouble()){
                    System.out.println("Введено не целое число");
                } else if (console.hasNextLine()) {
                    System.out.println("Введено не число");
                }
                System.out.println("Введите число:");
                console.next();
            }



            char[] line = console.next().trim().toCharArray(); //получение массива символом из строки
            int[] arr = new int[line.length]; // инициализация и определение размера интового массива arr
            for (int i = 0; i < line.length; i++) {
                arr[i] = Integer.parseInt(String.valueOf(line[i])); // заполнение массива
                //   System.out.println(arr[i]);
//            }
                System.out.println(String.valueOf(check(arr)) + String.valueOf(calc(arr)) );

            }

    }
    private static int calc(int[] y){
            int k = 1;
        for (int j = 0; j < y.length; j++) {
            int a = y[j];
            if(y[j]!=0){
                k = Math.multiplyExact(k, a);
            }
        }
        return k;
    }
    private static String check(int[] x) {

        String result = "";
        for (int i = 0; i < x.length; i++) {
            if(i < x.length-1 && x[i] !=0 )
                result += x[i] + " * ";
            if (i == x.length-1 && x[i]!=0) {
                result += x[i] + " = ";
            }
        }
        return result;
    }
}

