package home_work_1;

import java.util.Scanner;

public class LetterOrOther {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите число, символ или букву:");

        char[] line = console.next().trim().toCharArray();
       for(int i=0; i < line.length; i++) {
           char ch = (char) line[i];
           //System.out.println((int) ch);
           // 0 - 47, 58 - 64, 91-96, 123 - 127: иной символ, 48 - 57: цифра, 65-90, 97 - 122 - заглавные и маленькие буквы
           if ((ch >= 0 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 123 && ch <= 127)) {
               System.out.println("Вы ввели символ");
           } else if (ch >= 48 && ch <= 57) {
               System.out.println("Вы ввели цифру");
           } else {
               System.out.println("Вы ввели букву");
           }
           System.out.println("Dec = "+(int) ch);
       }
    }
}
