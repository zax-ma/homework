package home_work_5;

import home_work_5.api.IGenerator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class RandomNameInterface implements IGenerator {
    static int length = RandomNumInterface.getRandomStringLength();

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

    public String getRandomEN(){
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(52);
            buffer.append(str.charAt(number));

        }

        return buffer.toString();
    }

    public String getRandomName(){
        List<String> str = new ArrayList<>(Arrays.asList("Даниил", "Максим", "Владислав", "Никита", "Артем", "Иван", "Кирилл", "Егор", "Илья", "Андрей"));
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
            int name = random.nextInt(str.size());
            buffer.append(str.get(name));

        return buffer.toString();
    }

    public String getRandomPetName(){
        List<String> str = new ArrayList<>(Arrays.asList("Шарик", "Мурка", "Барсик", "Дружок", "Пончик", "Кузя", "Белик", "Белка", "Стрелка", "Лайка", "Байкал", "Мухтар", "Тайга", "Пальма", "Лайма", "Лисичка", "Персик", "Альта", "Альба", "Артемон","Бегемот"));
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
        int name = random.nextInt(str.size());
        buffer.append(str.get(name));

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
