package home_work_1;

import java.util.Scanner;

public class KbConvert {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Выберите вариант конвертации (введите 1 или 2): \n"+"1 - Килобайты в Байты \n"+"2 - Байты в Килобайты");
        byte choise = console.nextByte();

        if (choise == 1) {
            System.out.println("Введите число Kb:");
            int Kb = console.nextInt();
            int resultByte = Kb*1024;
            System.out.println(Kb+"Kb = "+resultByte+"B");
        } else if (choise == 2) {
            System.out.println("Введите число B:");
            int B = console.nextInt();
            int resultKb = B/1024;
            System.out.println(B+"B = "+resultKb+"Kb");
        } else {
            System.out.println("Введены некорректные данные");
        }
        }
    }

