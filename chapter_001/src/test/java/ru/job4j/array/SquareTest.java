package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * test for class Square
 */
public class SquareTest {

    /**
     * тест метода calculate
     * возвращаем новый массив, в котором каждому элементу входящего массива
     * соответсвует его квадрат
     * тест для 1 до 3
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }

    /**
     * тест метода calculate
     * возвращаем новый массив, в котором каждому элементу входящего массива
     * соответсвует его квадрат
     * тест для 1 до 5
     */
    @Test
    public void whenBound5Then1491625() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25};
        assertThat(rst, is(expect));
    }

    /**
     * тест метода calculate
     * возвращаем новый массив, в котором каждому элементу входящего массива
     * соответсвует его квадрат
     * тест для 1 до 1
     */
    @Test
    public void whenBound1Then1() {
        int bound = 1;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1};
        assertThat(rst, is(expect));
    }
}

