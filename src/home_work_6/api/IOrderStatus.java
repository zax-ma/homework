package home_work_6.api;

import java.util.List;

public interface IOrderStatus {

    /**
     * По какому квитку мы получили статус
     * @return
     */
    ITicket getTicket();

    /**
     * Получить список пройденнх этапов
     * @return пройденные этапы зказа
     */
    List<IStage> getHistory();

    /**
     * Признак готовности заказа
     * @return true - готов, false - не готов
     */
    boolean isDone();
}
