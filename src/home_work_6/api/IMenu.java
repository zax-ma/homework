package home_work_6.api;

import java.util.List;

public interface IMenu {
    /**
     * Доступные к заказу пиццы
     * @return описания пицц, которые можно заказать
     */
    List<IMenuRow> getItems();
}
