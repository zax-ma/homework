package home_work1_test;

import home_work_test.hw1.AverageNew;
import home_work_test.hw1.BitOperatorNew;
import home_work_test.hw1.DivisibilityNew;
import home_work_test.hw1.EqualNamesNew;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class HomeWork_1_NewTest {

    @Test
    public void AverageTest() {
        AverageNew avr = new AverageNew();
        Assertions.assertEquals(2, avr.averageCalcSafe(1,2,4));
    }

    @Test
    void BitOperatorAndTest() {
        BitOperatorNew bit = new BitOperatorNew();
        Assertions.assertEquals(1000000000, bit.bitOperAnd(548, 777));
    }

    @Test
    void BitOperatorOrTest() {
        BitOperatorNew bit = new BitOperatorNew();
        Assertions.assertEquals(1100101101, bit.bitOperOr(548, 777));
    }

    @Test
    void DivisibilityNewTest() {
        DivisibilityNew div = new DivisibilityNew();
        Assertions.assertEquals("Число 10 делится на 5. Результат: 2", div.divisib(10,5));
        Assertions.assertEquals("Числа не делятся", div.divisib(5,10));
    }

    @Test
    void EqualNamesNewTest() {
        EqualNamesNew name = new EqualNamesNew();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал!", name.nameeq("Вася"));
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал!", name.nameeq("Анастасия"));
        Assertions.assertEquals("Добрый день, а вы кто?", name.nameeq("Маша"));
    }
}