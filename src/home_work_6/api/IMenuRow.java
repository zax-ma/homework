package home_work_6.api;

public interface IMenuRow {
    /**
     * Информация о пицце
     * @return
     */
    IPizzaInfo getInfo();

    /**
     * Стоимость пиццы
     * @return
     */
    double getPrice();
}
