package home_work_6.api;

public interface IPizzaInfo {

    /**
     * Название пиццы
     * @return
     */
    String getName();

    /**
     * Описание/состав пиццы
     * @return
     */
    String getDescription();
    /**
     * Итоговый размер пиццы
     * @return
     */
    int getSize();
}
