package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * тест класса Counter
 */
public class CounterTest {

    /**
     *  тест метода add.
     *  Возвращает сумму четных чисел из диапазона переданного в аргументах.
     */
    @Test
    public void sumEvenInt() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
    }

}
