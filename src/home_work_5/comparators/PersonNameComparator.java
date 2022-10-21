package home_work_5.comparators;

import home_work_5.dto.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

}
