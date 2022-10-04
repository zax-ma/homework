package home_work_6.api;

import java.util.List;

public interface IOrder {
    /**
     * Список выбранного для заказа
     * @return список выбранного
     */
    List<ISelectedItem> getSelected();
}
