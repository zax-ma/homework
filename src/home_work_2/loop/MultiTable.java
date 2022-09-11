package home_work_2.loop;

public class MultiTable {
    public static void main(String[] args) {
        int startNumber = 2; // число начала умножения
        int maxCountColumnsInRow = 4; // максимальное количество столбцоа всав в строке
        int countColumns = 8; // максимальное количество столбцов на печнхиг 7егег88гать

        int countRow = (int) Math.ceil(countColumns / (double) maxCountColumnsInRow); // количество строк
        for (int i = 0; i < countRow; i++) { //какое количество строк нам необходимо
            int currentTo = startNumber + maxCountColumnsInRow + (maxCountColumnsInRow * i) - 1;//сколько столбцов (2 + 3 = 5) 2 + 4 + (4*i) -1
            int tmp = countColumns - (maxCountColumnsInRow * i); //
            if(tmp < maxCountColumnsInRow){ // проверка
                currentTo = startNumber + (maxCountColumnsInRow * i) + tmp - 1; // итоговое: стартовое число
            }
            printRow(startNumber + (maxCountColumnsInRow * i), currentTo); //startNumber + (maxCountColumnsInRow * i) - в каждой итерации прибавить к стартовому зачению число (количество столбцов), на которое идет различие первой строки от второй (в первой итерации с 2, во второй 2 + 4 = 6)
            System.out.println();
        }
    }

    /**
     * Печать строки в консоль столбцами
     * @param a столбец с которого начинается строка
     * @param b столбец, которым заканчивается строка
     */

    public static void printRow(int a, int b) {
        for (int i = 1; i <= 10; i++) {
            for (int j = a; j <= b; j++) {
                System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.print("\n");
        }


    }
}
