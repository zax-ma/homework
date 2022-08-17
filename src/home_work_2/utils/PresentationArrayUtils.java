package home_work_2.utils;

import java.util.Arrays;
import java.util.Scanner;

/*
* 2.4 Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах. Для получения массивов вызывать ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100))
	evenSumm	2.4.1. Сумма четных положительных элементов массива
	evenMax	2.4.2. Максимальный из элементов массива с четными индексами
	loAverage	2.4.3. Элементы массива, которые меньше среднего арифметического
	twoLow  2.4.4. Найти два наименьших (минимальных) элемента массива
	arrayCompress	2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
	sumNum	2.4.6. Сумма цифр массива
* */
public class PresentationArrayUtils {
    public static void main(String[] args) {
      //  System.out.println("Сумма четных положительных элементов массива: "+evenSumm());
      //  System.out.println("Максимальный из элементов массива с четными индексами: "+evenMax());
       // System.out.println("Элементы массива, которые меньше среднего арифметического: "+loAverage());
       // System.out.println("Два наименьших (минимальных) элемента массива: "+twoLow());
       // System.out.println("Сжать массив, удалив элементы, принадлежащие интервалу: "+ Arrays.toString(arrayCompress()));
        System.out.println("Сумма цифр массива: "+ sumNum());

    }
    private static int evenSumm(){
        int[] array = ArrayUtils.arrayRandom(50,100);
        int sumEven = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0 && array[i] > 0) {
                sumEven += array[i];
            }
        }
        return sumEven;
    }

    private static int evenMax() {
        int[] array = ArrayUtils.arrayRandom(50,100);
        int max = 0;
        for (int i = 0; i < array.length; i = i+2){
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static String loAverage(){
        int[] array = ArrayUtils.arrayRandom(50,100);
        int sum = 0;
        float avrg = 0.0F;
        String low = "";
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avrg = sum / array.length;
        for(int j = 0; j < array.length; j++){
            if(array[j] < avrg) {
                low += " " + array[j];
            }
        }
        return low;
    }

    private static String twoLow(){
        int[] array = ArrayUtils.arrayRandom(50,100);
        System.out.println(Arrays.toString(array));
        int min1;
        int min2;
        int buf = 0;
        if (array[0] < array[1]) {
          min1 = 0;
          min2 = 1;
        } else {
            min1 = 1;
            min2 = 0;
        }
        for (int i = 2; i < array.length; i++){
            if (array[i] < array[min1]) {
                buf = min1;
                min1 = i;
            } else if (array[buf] < array[min2]) {
                min2 = buf;
            } else if (array[i] < array[min2]){
                    min2 = i;
                }
            }
            System.out.println(array[min1] +" "+ array[min2]);

        String s = array[min1] + " " + array[min2];
        return s;
    }

    private static int[] arrayCompress(){
        Scanner console = new Scanner(System.in);
        int[] array = ArrayUtils.arrayRandom(50,100);
        int h = 0;
        int l = 0;
        int i = 0;
        int m = array.length;
        System.out.println("Удаляемый диапазон: ");
        i = 0;
        l = console.nextInt();
        h = console.nextInt();
        while (i < m) {
            if(array[i] <= h && array[i] >= l){
                m -= 1;
                for (int j = i; j < m; j++){
                    array[j] = array[j+1];
                }
            } else {
                i += 1;
            }
            for (int k=m; k < array.length; k++) {
                array[k] = 0;
            }
        }
        return  array;
    }

    private static int sumNum(){
        int[] array = ArrayUtils.arrayRandom(50,100);
        System.out.println(Arrays.toString(array));
        int sum = 0;
        int num = 0;
        for(int i = 0; i < array.length; i++){
            num = array[i];
            while (num > 0){
                sum += num % 10;
                num = num / 10;
            }
        }
        return sum;
    }
}
