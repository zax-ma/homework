package home_work_6.dto;

import home_work_6.api.IMenuRow;
import home_work_6.api.ISelectedItem;

public class SelectedItem implements ISelectedItem {

    IMenuRow row;
    int count;

    public SelectedItem(IMenuRow row, int count){
        this.row = row;
        this.count = count;
    }

    @Override
    public IMenuRow getRow() {
        return row;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "SelectedItem{" +
                "row=" + row +
                ", count=" + count +
                '}';
    }
}
