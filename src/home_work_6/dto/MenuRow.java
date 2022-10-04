package home_work_6.dto;

import home_work_6.api.IMenuRow;
import home_work_6.api.IPizzaInfo;

public class MenuRow implements IMenuRow {

    PizzaInfo pizza;
    public double price;

    public MenuRow(PizzaInfo pizza, double price){
        this.pizza = pizza;
        this.price = price;

    }


    @Override
    public IPizzaInfo getInfo() {
        return pizza;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MenuRow{" + pizza +
                ", price=" + price +
                '}';
    }
}
