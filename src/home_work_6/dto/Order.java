package home_work_6.dto;

import home_work_6.api.IOrder;
import home_work_6.api.ISelectedItem;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder {

    SelectedItem selected;

    List<ISelectedItem> orderlist = new ArrayList<>();




    @Override
    public List<ISelectedItem> getSelected() {
        return orderlist;
    }

    public Order(SelectedItem selected) {
        this.selected = selected;
    }

    public void add(ISelectedItem selectedItem){
        this.orderlist.add(selectedItem);
    }

    @Override
    public String toString() {
        return "Order{" +
                "selected=" + selected +
                ", orderlist=" + orderlist +
                '}';
    }

}
