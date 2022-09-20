package home_work_5.comparators;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a, Animal b) {
        if(b.getAge() < a.getAge())
            return 1;
        else if(b.getAge() > a.getAge())
            return -1;
        else
            return 0;
    }
}
