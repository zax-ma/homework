package home_work_2;

import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {
    public static void main(String[] args) {

       // int[] container = arrayFromConsole();
       // int[] container = arrayRandom(5, 100);
       // System.out.print("Ваш массив: "+Arrays.toString(container));
     //   System.out.println("Все элементы массива: "+Arrays.toString(ArraysIteration.allElements()));
        //System.out.println("Каждый второй элемент массива: "+Arrays.toString(ArraysIteration.eachSecondElement()));// все элементы массива в консоль
        System.out.println("Массив в обратном порядке: "+Arrays.toString(ArraysIteration.reverseArray()));
    }

    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = console.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            int count = i+1;
            Scanner in = new Scanner(System.in);
            System.out.println("Введите " + count + " элемент");
            array[i] = in.nextInt();
        }
        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++) {
            double j = Math.random()*maxValueExclusion;
            array[i] = (int) j;
        }
        return array;
    }

    public static class ArraysIteration extends ArrayUtils{

        public static int[] allElements(){
           int[] result = ArrayUtils.arrayFromConsole();
            return result;
        }

        public static int[] eachSecondElement(){
            int[] a = ArrayUtils.arrayFromConsole();
            int[] num = new int[a.length];
            int b = 0;
            for (int i = 0; i < a.length; i = i + 2){
                b++;
                num[i] = a[i];
            }
            int[] newArr = new int[b];
            int index = 0;
            for (int i = 0; i < num.length; i = i+2){
                if(num[i] != 0) {
                    newArr[index] = num[i];
                    index++;
                }
            }
            return newArr;
        }
        public static int[] reverseArray(){
            int[] a = ArrayUtils.arrayFromConsole();
            int[] reva = new int [a.length];
            int index = 0;
            for(int i =a.length-1; i>=0; i--) {
                reva[index] = a[i];
                index++;
            }
            return reva;
        }



    }

}
