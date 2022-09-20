package home_work_5;

import home_work_5.api.IGeneratorNum;

import java.util.Random;

public class RandomNumInterface implements IGeneratorNum {

        public int getRandomAge(int min, int max){
            max -= min;
            return (int) (Math.random()* ++max) + min;
        }

        public String getRandomPassword(int min, int max){
            max -= min;
            String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            Random random = new Random();
            StringBuffer buffer = new StringBuffer();
            int length = (int) (Math.random() * ++max) + min;
            for (int i = 0; i < length; i++) {
                int number = random.nextInt(62);
                buffer.append(str.charAt(number));

            }

            return buffer.toString();
        }
}
