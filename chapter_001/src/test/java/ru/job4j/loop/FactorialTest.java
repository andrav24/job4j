package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 *
 *  тест класса Factorial (вычисление факториала числа, переданного в аргументе)
 */

public class FactorialTest {

    /**
     * Факториал 5
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        int res = factorial.calc(5);
        assertThat(res, is(120));
    }

    /**
     * Факторил 0
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int res = factorial.calc(0);
        assertThat(res, is(1));
    }
}


