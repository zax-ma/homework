package home_work_5.comparators;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class AnimalNickComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a, Animal b) {
        return a.getNick().compareTo(b.getNick());
    }

}
