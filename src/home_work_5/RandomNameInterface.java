package home_work_5;

import home_work_5.api.IGenerator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomNameInterface implements IGenerator {
    static int length = RandomNumInterface.getRandomString();

    public String getRandomString(){
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            buffer.append(str.charAt(number));

        }

        return buffer.toString();
    }


    public String getRandomRU(){
        String str = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(66);
            buffer.append(str.charAt(number));
        }
        return buffer.toString();
    }


    public String getRandomNameFile(String file){
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();

        Scanner scan;

        try {
            scan = new Scanner(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        while (scan.hasNextLine()) {
            list.add(scan.nextLine());

        }
        int number = random.nextInt(list.size());
        buffer.append(list.get(number));

        return buffer.toString();
    }
}
