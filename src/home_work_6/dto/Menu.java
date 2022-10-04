package home_work_6.dto;

import home_work_6.api.IMenu;
import home_work_6.api.IMenuRow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Menu implements IMenu {

    MenuRow items;

    public static List<IMenuRow> pizzaOnMenu = new ArrayList<>();

    private int number;

    public Menu() {

    }

    public Menu(MenuRow items, double price) {
        this.items = items;

    }

    @Override
    public List<IMenuRow> getItems() {
        return pizzaOnMenu;
    }


    public void add(IMenuRow item) {
        this.pizzaOnMenu.add(item);
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (IMenuRow item : pizzaOnMenu) {
            builder.append(i++)
                    .append(". ")
                    .append(item)
                    .append("\n");
        }
        return builder.toString();
    }

    Map<String, Integer> storageMap = new LinkedHashMap<String, Integer>();

    private static void getStorageData(Map<String, Integer> storageMap){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File("/Users/apple/IdeaProjects/Mk-JC-115-22/src/Class17/pizza/dto/pizzaMenu.txt")));
            String line = reader.readLine();
            while (line != null) {
                String[] splittedLine = line.split(";");
                if (splittedLine.length == 4) {
                    storageMap.put(splittedLine[0],
                            Integer.parseInt(splittedLine[1]));
                }
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
