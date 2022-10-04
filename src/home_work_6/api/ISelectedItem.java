package home_work_6.api;

public interface ISelectedItem {
    /**
     * Выбранное из меню
     * @return
     */
    IMenuRow getRow();

    /**
     * КОличество выбранного
     * @return
     */
    int getCount();
}
