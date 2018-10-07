package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * тестирование класса Max
 */


public class MaxTest {

    /**
     * тест метода max (с двумя агрументами)
     * тестируем условие, когда Первый аргумент меньше Второго.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * тест метода max (с двумя агрументами)
     * тестируем условие, когда Первый аргумент больше Второго.
     */
    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(10, 2);
        assertThat(result, is(10));
    }

    /**
     * тест метода max (с двумя агрументами)
     * тестируем условие, когда Первый аргумент равен Второму.
     */
    @Test
    public void whenFirstEqualSecond() {
        Max maxim = new Max();
        int result = maxim.max(2, 2);
        assertThat(result, is(2));
    }

    /**
     * тест метода max (с тремя агрументами)
     * тестируем условие, когда Первый аргумент самый большой.
     */
    @Test
    public void whenFirstGreater() {
        Max maxim = new Max();
        int result = maxim.max(12, 11, 9);
        assertThat(result, is(12));
    }

    /**
     * тест метода max (с тремя агрументами)
     * тестируем условие, когда Второй аргумент самый большой.
     */
    @Test
    public void whenSecondGreater() {
        Max maxim = new Max();
        int result = maxim.max(12, 121, 9);
        assertThat(result, is(121));
    }

    /**
     * тест метода max (с тремя агрументами)
     * тестируем условие, когда Третий аргумент самый большой.
     */
    @Test
    public void whenThirdGreater() {
        Max maxim = new Max();
        int result = maxim.max(12, 11, 99);
        assertThat(result, is(99));
    }

    /**
     * тест метода max (с тремя агрументами)
     * тестируем условие, когда Первый аргумент самый большой.
     */
    @Test
    public void whenFirstGreaterAndSecondEqualThird() {
        Max maxim = new Max();
        int result = maxim.max(1299, 99, 99);
        assertThat(result, is(1299));
    }

    /**
     * тест метода max (с тремя агрументами)
     * тестируем условие, когда все три аргумента одинаковые.
     */
    @Test
    public void whenAllEquals() {
        Max maxim = new Max();
        int result = maxim.max(1299, 1299, 1299);
        assertThat(result, is(1299));
    }
}


