package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Andrey Antonov
 * @version $Id$
 * @since 0.1
 */

public class CalculatorTest {

    /**
     * test add
     */

    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * test subtract
     */

    @Test
    public void whenSubtractFiveMinusTwoThenThree() {
        Calculator calc = new Calculator();
        calc.subtract(5D, 2D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }

    /**
     *  test div
     */

    @Test
    public void whenDivFourDivTwoThenTwo() {
        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     *  test multiple
     */
    @Test
    public void whenMultipleOneMultipleThreeThenThree() {
        Calculator calc = new Calculator();
        calc.multiple(1D, 3D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }
}
