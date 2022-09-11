package home_work_4;

import home_work_4.comparators.ComparatorInteger;
import home_work_4.comparators.ComparatorString;

import javax.xml.crypto.Data;
import java.awt.dnd.DropTarget;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
       DataContainer<String> container = new DataContainer<>(new String[3]);
     Comparator<String> cmpStr = new ComparatorString();
     Comparator<Integer> cmpInt = new ComparatorInteger();


        System.out.println(container.add("hello"));
        System.out.println(container.add(null));
        System.out.println(container.add("hello"));
        System.out.println(container.add("hello"));
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container.delete(1));
        System.out.println(container.delete("hello"));
        System.out.println(container.add("bye"));
        System.out.println(container.add("good bye"));
        System.out.println(Arrays.toString(container.getItems()));
        container.sort(cmpStr);
        System.out.println(container);

        DataContainer<Integer> containerInt = new DataContainer<>(new Integer[]{3,7,8});
        System.out.println(containerInt);
        System.out.println(containerInt.add(777));
        System.out.println(containerInt.delete(0));
        System.out.println(containerInt.delete((Integer) 7));
        System.out.println(containerInt);
        System.out.println(containerInt.add(5));
        System.out.println(containerInt);
        containerInt.sort(cmpInt);
     //   containerInt.sort(DataContainer);
        System.out.println(containerInt);
    }
}
