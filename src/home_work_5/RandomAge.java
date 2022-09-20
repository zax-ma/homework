package home_work_5;

public class RandomAge {
    public static int getRandomAge(){
        int num = 100 - 10;
        return (int) (Math.random()* num)-10;
    }
}
