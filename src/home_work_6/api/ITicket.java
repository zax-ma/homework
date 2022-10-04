package home_work_6.api;

import java.time.LocalDateTime;

public interface ITicket {
    /**
     * Уникальный номер заказа
     * @return
     */
    String getNumber();

    /**
     * Когда заказ получен
     * @return
     */
    LocalDateTime getCreateAt();

    /**
     * Готовый заказ
     * @return
     */
    IOrder getOrder();
}
