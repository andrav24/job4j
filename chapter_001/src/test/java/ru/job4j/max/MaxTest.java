package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * тестирование класса Max
 */


public class MaxTest {

    /**
     * тестируем условие, когда Первый аргумент меньше Второго.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * тестируем условие, когда Первый аргумент больше Второго.
     */
    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(10, 2);
        assertThat(result, is(10));
    }

    /**
     * тестируем условие, когда Первый аргумент равен Второму.
     */
    @Test
    public void whenFirstEqualSecond() {
        Max maxim = new Max();
        int result = maxim.max(2, 2);
        assertThat(result, is(2));
    }

}


