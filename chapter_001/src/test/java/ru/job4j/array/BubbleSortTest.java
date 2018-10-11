package ru.job4j.array;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * тест класса BubbleSort
 */
public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort arr = new BubbleSort();
        int[] test = new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = arr.sort(test);
        int[] expect = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayWithFiveElementsThenSortedArray() {
        BubbleSort arr = new BubbleSort();
        int[] test = new int[]{5, 1, 2, 7, 3};
        int[] result = arr.sort(test);
        int[] expect = new int[]{1, 2, 3, 5, 7};
        assertThat(result, is(expect));
    }
}
