package home_work_5.comparators;

import home_work_5.dto.Person;

import java.util.Comparator;

public class PersonPassLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {

        if(b.getPassword().length() < a.getPassword().length())
            return 1;
        else if(b.getPassword().length() > a.getPassword().length())
            return -1;
        else
            return 0;
    }
}
