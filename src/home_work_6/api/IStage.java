package home_work_6.api;

import java.time.LocalTime;

public interface IStage {
    /**
     * Описание этапа
     * @return
     */
    String getDescription();

    /**
     * Когда этап был начат
     * @return
     */
    LocalTime getTime();
}
