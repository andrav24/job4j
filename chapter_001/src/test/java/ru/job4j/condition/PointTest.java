package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Тестирование класса Point
 */
public class PointTest {

    /**
     * тест метода distanceTo
     */
    @Test
    public void distanceToTest1() {
        Point a = new Point(5, 2);
        Point b = new Point(3, 1);
        double distance = a.distanceTo(b);
        assertThat(distance, closeTo(2.23, 0.01));
    }

    @Test
    public void distanceToTest2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double distance = a.distanceTo(b);
        assertThat(distance, closeTo(0.0, 0.00));
    }

    @Test
    public void distanceToTest3() {
        Point a = new Point(-5, 2);
        Point b = new Point(4, -5);
        double distance = a.distanceTo(b);
        assertThat(distance, closeTo(11.40, 0.01));
    }
}
