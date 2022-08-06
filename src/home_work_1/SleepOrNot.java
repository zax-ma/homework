package home_work_1;

public class SleepOrNot {

        public static void main( String[] args ) {
            boolean weekday = true;
            boolean vacation = true;

             System.out.println(sleepIn(weekday, vacation));
        }
        public static boolean sleepIn(boolean weekday, boolean vacation) {
            System.out.println("Спать ли дельше (да/нет)?");
            if( weekday != true || vacation == true ) {
                System.out.println("Да, можем спать дальше");
                return true;
            } else {
                System.out.println("Не, пора идти на работу");
                return false;
            }
        }

}