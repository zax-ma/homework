package home_work_2;

/**
 * вводится число для вычисления факториала
 * процесс умножения проходит проверку на переполнение с помощью математической
 * функции Math.multiplyExact
 * для печати использован шаблон 1 * 2 * 3 *...* n = N!
 */
public class Multiply {
    public static void main(String[] args) {

        System.out.println(factorial(-1));
        System.out.println(factorial(0));
        System.out.println(factorial(5));
        System.out.println(factorial(100));
    }
        private static String factorial(int x) {
            int k = 1;
            String result = "1 * ";
            if (x == 0 || x == 1) {
                return "1 = 1";
            }
            if (x < 0) {
                return "Штаааа?";
            }
            for (int j = 2; j < x+1; j++) {
                k = Math.multiplyExact(k, j);
                if (j < x) {
                    result += (j + " * ");
                }
                if (j == x) {
                    result += (j + " = ");
                }
            }
            return result + k;
        }

}






