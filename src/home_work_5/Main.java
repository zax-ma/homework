package home_work_5;

import home_work_5.api.IGenerator;
import home_work_5.comparators.*;
import home_work_5.dto.Animal;
import home_work_5.dto.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("________Random person data_________");
        RandomNameInterface being = new RandomNameInterface();
        RandomNumInterface numeric = new RandomNumInterface();


        PersonList p = new PersonList(
                being.getRandomName(),
                numeric.getRandomPassword(5, 10),
                being.getRandomEN());
        System.out.println("\n________ArrayList__________\n");
        long start1 = System.currentTimeMillis();
        System.out.println(p.ArrListPerson(10));
        long stop1 = System.currentTimeMillis();
        System.out.println("\n________LinkedList__________\n");
        long start2 = System.currentTimeMillis();
        System.out.println(p.LinkedListPerson(10));
        long stop2 = System.currentTimeMillis();
        System.out.println("\n________HashSet__________\n");
        long start3 = System.currentTimeMillis();
        System.out.println(p.HashSetPerson(10));
        long stop3 = System.currentTimeMillis();
        System.out.println("\n________TreeSet__________\n");
        long start4 = System.currentTimeMillis();
        System.out.println(p.TreeSetPerson(10));
        long stop4 = System.currentTimeMillis();
        System.out.println("\n_________SORT____________\n");
        long start5 = System.currentTimeMillis();
        Collections.sort(p.listarr, new PersonNameComparator());
        long stop5 = System.currentTimeMillis();

        System.out.println(p.listarr);

        long start6 = System.currentTimeMillis();
        Collections.sort(p.lnklist, new PersonNameComparator());
        long stop6 = System.currentTimeMillis();

        System.out.println(p.lnklist);

        List sortedHash = new ArrayList<>(p.hslist);
        long start7 = System.currentTimeMillis();
        Collections.sort(sortedHash, new PersonNameComparator());
        long stop7 = System.currentTimeMillis();
        System.out.println(sortedHash);
        long start8 = System.currentTimeMillis();
        System.out.println(p.getSort((ArrayList) p.listarr));
        long stop8 = System.currentTimeMillis();

        System.out.println("_________TOTAL TIME_______");
        System.out.println("Операция: ArrayList(print). Заняла " + (stop1 - start1) +  " мс");
        System.out.println("Операция: LinkedList(print). Заняла " + (stop2 - start2) +  " мс");
        System.out.println("Операция: HashSet(print). Заняла " + (stop3 - start3)+  " мс");
        System.out.println("Операция: TreeSet(print). Заняла " + (stop4 - start4)+  " мс");

        System.out.println("Операция: ArrayList(sort). Заняла " + (stop5 - start5) +  " мс");
        System.out.println("Операция: LinkedList(sort). Заняла " + (stop6 - start6) +  " мс");
        System.out.println("Операция: HashSet(sort). Заняла " + (stop7 - start7) +  " мс");
        System.out.println("Операция: TreeSet(sort). Заняла " + (stop8 - start8)+  " мс");

        System.out.println("___________FOR NAMES AND NICKNAMES____________");
        System.out.println("________Name and Nick String Any_________");
        Person humanAny = new Person(being.getRandomString(),
                numeric.getRandomPassword(5, 10),
                being.getRandomString());
        System.out.println(humanAny);

        System.out.println("________String Name RU Nick EN_________");
        Person humanRu = new Person(being.getRandomRU(),
                numeric.getRandomPassword(5, 10),
                being.getRandomEN());
        System.out.println(humanRu);

        System.out.println("_____________String Name______________");
        Person humanName = new Person(being.getRandomName(),
                numeric.getRandomPassword(5, 10),
                being.getRandomRU());
        System.out.println(humanName);

        System.out.println("________String Name and Nick from File_________");
        Person humanFile = new Person(being.getRandomNameFile("src/home_work_5/files/name.txt"),
                numeric.getRandomPassword(5, 10),
                being.getRandomNameFile("src/home_work_5/files/nick.txt"));
        System.out.println(humanFile);


        System.out.println("____________PassLengthSort___________"); // сортировка по длине пароля

        TreeSet<Person> people = new TreeSet<>();
        for (int j = 0; j < 4; j++) {
            people.add(new Person(being.getRandomNameFile("src/home_work_5/files/name.txt"),
                    numeric.getRandomPassword(5, 10),
                    being.getRandomNameFile("src/home_work_5/files/nick.txt")));
        }

        System.out.println(people);

        System.out.println("______________Sorted by PassLength and Nickname_________");


        PersonList man = new PersonList(being.getRandomPetName(), numeric.getRandomPassword(5,10), being.getRandomEN());
        man.ArrListPerson(6);
        System.out.println(man.listarr);

        System.out.println("Before sorting:_____ ");
        for (Person person : man.listarr) {
            System.out.println(person.getName() + " " + person.getPassword() + " " + person.getNick());
        }
        System.out.println(man.listarr);

        System.out.println("After:______ ");
        Collections.sort(man.listarr, new PersonPassLengthComparator().thenComparing(new PersonNickComparator()));
        for (Person person : man.listarr) {
            System.out.println(person.getName() + " " + person.getPassword() + " " + person.getNick());
        }
        System.out.println(man.listarr);



        System.out.println("______________Animal sorted by Age and Petname_________");

        ArrayList<Animal> anlist = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
            anlist.add(new Animal(numeric.getRandomAge(1, 15), being.getRandomNameFile("src/home_work_5/files/petname.txt")));
        }
        for (Animal animal : anlist) {
            System.out.println(animal.getAge() + " " + animal.getNick());
        }
        Collections.sort(anlist, new AnimalAgeComparator().thenComparing(new AnimalNickComparator()));

        System.out.println(anlist);






    }

}
