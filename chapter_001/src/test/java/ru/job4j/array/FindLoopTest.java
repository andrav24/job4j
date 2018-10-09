package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * тестирование класса FindLoop
 */
public class FindLoopTest {

    /**
     *  Ищем число 5 в 0 индексе
     */
    @Test
    public void whenArrayHasNumber5InPosition0Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * ищем число 3 во 2 индексе
     */
    @Test
    public void whenArrayHasNumber3InPosition2Then2() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 3;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    /**
     * задаем число, которого нет в массиве
     * возврат -1
     */
    @Test
    public void whenArrayHasNoNumber() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 22;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

}
