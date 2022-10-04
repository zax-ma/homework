package home_work_6.dto;

import home_work_6.api.IPizzaInfo;

public class PizzaInfo extends Pizza implements IPizzaInfo {
    private String description;

    public PizzaInfo(String name, int size, String description) {
        super(name, size);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return super.toString() + " PizzaInfo{"  +
                "description='" + description + '\'' +
                '}';
    }
}
