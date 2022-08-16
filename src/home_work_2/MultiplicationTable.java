package home_work_2;

import java.util.Arrays;
import java.util.Random;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 2; i < 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i +" * " +j +" = "+ i*j+" \n");
            }
            System.out.println();
            //   System.out.println();
        }

    }
}



