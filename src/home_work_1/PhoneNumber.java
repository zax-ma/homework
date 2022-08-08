package home_work_1;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println("Введите 10 цифр номера телефона:");
        Scanner console = new Scanner(System.in);
        char[] line = console.next().trim().toCharArray();
        if (line.length != 10) {
            System.out.println("Проверьте корректность номера!");
        } else {
        String format = createPhoneNumber(line);
        System.out.println(format);
        }
    }
    public static String createPhoneNumber(char[] linex) {
        String result = "(";
        for (int i = 0; i < linex.length; i++) {
            result += linex[i];
            if (i == 2){
                result += ") ";
            } else if (i == 5) {
                result += "-";
            }
        }
        return result;
    }
}
