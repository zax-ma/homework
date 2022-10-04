package home_work_6;

import home_work_6.dto.*;

public class Main {
    public static void main(String[] args) {
        Pizza piz = new Pizza("Пепперони", 26);
        System.out.println(piz);

        PizzaInfo pizzin = new PizzaInfo("Пепперони", 26, "Тесто, колбаса, сыр, маслины");
        System.out.println(pizzin);

        MenuRow row = new MenuRow(new PizzaInfo("Пепперони", 26, "Тесто, колбаса, сыр, маслины"), 25.0);
        System.out.println(row);

        Menu menu = new Menu();
        menu.add(new MenuRow(new PizzaInfo("Пепперони", 26, "Тесто, колбаса, сыр, маслины"), 25.0));
        menu.add(new MenuRow(new PizzaInfo("Пепперони", 28, "Тесто, колбаса, сыр, маслины"), 27.0));
        menu.add(new MenuRow(new PizzaInfo("Пепперони", 30, "Тесто, колбаса, сыр, маслины"), 29.0));
        menu.add(new MenuRow(new PizzaInfo("Диабло", 26, "Тесто, колбаса, сыр, маслины, перец чили"), 26.5));
        System.out.println(menu);


        SelectedItem item = new SelectedItem(new MenuRow(new PizzaInfo("Диабло", 26, "Тесто, колбаса, сыр, маслины, перец чили"), 26.5), 2);
        System.out.println(item);

        Order order = new Order(new SelectedItem(new MenuRow(new PizzaInfo("Диабло", 26, "Тесто, колбаса, сыр, маслины, перец чили"), 26.5), 2));
        System.out.println(order);
    }
}
