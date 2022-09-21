package home_work_5;


import home_work_5.dto.Person;

import java.util.*;

public class PersonList extends Person {
    RandomNameInterface being = new RandomNameInterface();
    RandomNumInterface num = new RandomNumInterface();
    List<Person> listarr = new ArrayList<>();
    List<Person> lnklist = new LinkedList<>();
    Set<Person> hslist = new HashSet<>();
    Set<Person> tslist = new TreeSet<>();



    public PersonList(String name, String password, String nick) {
        super(name, password, nick);

    }

    public String ArrListPerson(int count) {

        for (int i = 0; i < count; i++) {
            listarr.add(new Person(being.getRandomRU(),
                    num.getRandomPassword(5, 10),
                    being.getRandomString()));

        }
        String s = listarr.toString();
        return s;

    }

    public String LinkedListPerson(int count) {

        for (int i = 0; i < count; i++) {
            lnklist.add(new Person(being.getRandomRU(),
                    num.getRandomPassword(5, 10),
                    being.getRandomString()));

        }
        String s = lnklist.toString();
        return s;

    }

    public String HashSetPerson(int count) {

        for (int i = 0; i < count; i++) {
            hslist.add(new Person(being.getRandomRU(),
                    num.getRandomPassword(5, 10),
                    being.getRandomString()));

        }
        String s = hslist.toString();
        return s;

    }

    public String TreeSetPerson(int count) {

        for (int i = 0; i < count; i++) {
            tslist.add(new Person(being.getRandomRU(),
                    num.getRandomPassword(5, 10),
                    being.getRandomString()));

        }
        String s = tslist.toString();
        return s;
    }

    public TreeSet getSort(ArrayList listarr){
            TreeSet set = new TreeSet(listarr);
            return set;
        }


}




