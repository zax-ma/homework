package home_work_6.api;

import java.util.List;

public interface IDoneOrder {
    /**
     * Квиток, по которому заказ готовится
     * @return квиток выданный при оформлении заказа
     */
    ITicket getTicket();
    /**
     * Готовые пиццы, приготовленные по закаку
     * @return готовая пицца
     */
    List<IPizza> getItems();
}


