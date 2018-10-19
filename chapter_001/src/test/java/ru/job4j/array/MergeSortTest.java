package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * тест класса BubbleSort
 */
public class MergeSortTest {
    /**
     * слияние двух массивов одинаковой длины
     */
    @Test
    public void test1() {
        MergeSort arr = new MergeSort();
        int[] testArray1 = new int[]{21, 23, 24, 40, 75};
        int[] testArray2 = new int[]{10, 11, 41, 50, 65};
        int[] result = arr.sort(testArray1, testArray2);
        int[] expect = new int[]{10, 11, 21, 23, 24, 40, 41, 50, 65, 75};
        assertThat(result, is(expect));
    }

    /**
     * слияние двух массивов разной длины
     */
    @Test
    public void test2() {
        MergeSort arr = new MergeSort();
        int[] testArray1 = new int[]{11, 23, 24};
        int[] testArray2 = new int[]{10, 11, 41, 50, 65};
        int[] result = arr.sort(testArray1, testArray2);
        int[] expect = new int[]{10, 11, 11, 23, 24, 41, 50, 65};
        assertThat(result, is(expect));
    }

    /**
     * слияние двух массивов с одинаковыми элементами
     */
    @Test
    public void test3() {
        MergeSort arr = new MergeSort();
        int[] testArray1 = new int[]{11, 11, 11};
        int[] testArray2 = new int[]{10, 10, 10, 10, 10};
        int[] result = arr.sort(testArray1, testArray2);
        int[] expect = new int[]{10, 10, 10, 10, 10, 11, 11, 11};
        assertThat(result, is(expect));
    }
}
