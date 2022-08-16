package home_work_2;

/**
 * рекурсивный метод вычисления факториала
 */

public class MultiplyRecursion {
    public static void main(String[] args) {


        System.out.println(beauty(-2));
        System.out.println(beauty(0));
        System.out.println(beauty(5));
        System.out.println(beauty(6));
        System.out.println(beauty(10));

    }

    static int facrecursion(int x){
        if (x < 0) {
            return 0;
        }
        if (x == 1){
            return 1;
        }
        int i = x * facrecursion(x - 1);
        return i;
    }

    private static <facrecursion> String beauty(int y) {
        int k = 1;
        String result = y + " * ";
        if (y == 0 || y == 1) {
            return "1 = 1";
        }
        if (y < 0) {
            return "Штаааа?";
        }
        for (int j = y ; j > 0; j--) {
            k = Math.multiplyExact(k, j);
            if (j < y && j > 1) {
                result += (j + " * ");
            }
            if (j == 1) {
                result += (j + " = ");
            }
        }
        return result + k;
    }

}