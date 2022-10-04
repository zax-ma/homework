package home_work_6.dto;

import home_work_6.api.IPizza;

public class Pizza implements IPizza {
    private String name;
    private int size;

    public Pizza(String name, int size){
        this.name = name;
        this.size = size;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
