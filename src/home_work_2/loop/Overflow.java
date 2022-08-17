package home_work_2.loop;

/*
* класс переполнения буфера
* вызывается метод calc, в котором переменная типа long умножается до усрачки на целое число
* (положительное или отрицательное), пока в результате не получит переполнение буфера
* класс calc возвращает значение переменной в формате String до момента переполнения и первое значение после переполнения
*/

public class Overflow {
    public static void main(String[] args) {
        long a = 1L;

        System.out.println(calc(a, 3));
        System.out.println(calc(a, 188));
        System.out.println(calc(a, -19));
        System.out.println(calc(a, -3));
    }
    public static String calc(long x, int y) {
        String resultA = "Значение после переполнения: ";
        String resultB = "Значение до переполнения: ";
        String result = "";
        x = 1L;
        if (y < 0) {
            for (long i = 1L; i < 100; i++) {
                x = x * y;
                if (x < 0 && (x * y) < 0) {
                    result = resultB + x + "\n" + resultA + (x * y);
                    break;
                } else if (x > 0 && (x * y) > 0) {
                    result = resultB + x + "\n" + resultA + (x * y);
                    break;
                }
            }
        } else {
            do {
                x = x * y;
                if (x < 9223372036854775807L && x * y < -1 && x > -1) {
                    result = resultB + x + "\n" + resultA + (x * y);
                }
            } while (x > -1);
        }
        return result;
    }
}




