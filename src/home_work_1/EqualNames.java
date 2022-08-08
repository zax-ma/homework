package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class EqualNames {

    public static void main(String[] args) {
        String vasya = "Вася";
        String nastya = "Анастасия";

        Scanner console = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = console.nextLine();
        if (Objects.equals(name, vasya)) {

            System.out.println("Привет!\nЯ тебя так долго ждал!");
        } else if (Objects.equals(name, nastya)) {
            System.out.println("Привет!\nЯ тебя так долго ждал!");

        } else {
            System.out.println("Добрый день, а вы кто?");

        }
    }
}
