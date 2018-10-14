package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * тест класса ArrayDuplicate
 */
public class ArrayDuplicateTest {

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] arr = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        ArrayDuplicate varTest = new ArrayDuplicate();
        String[] result =  varTest.remove(arr);
        String[] expect = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateVerTwo() {
        String[] arr = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир", "Привет", "Привет"};
        ArrayDuplicate varTest = new ArrayDuplicate();
        String[] result =  varTest.remove(arr);
        String[] expect = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateVerThree() {
        String[] arr = new String[] {"Привет", "Привет", "Привет", "Привет", "Привет"};
        ArrayDuplicate varTest = new ArrayDuplicate();
        String[] result =  varTest.remove(arr);
        String[] expect = new String[] {"Привет"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateVerFour() {
        String[] arr = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир", "Привет", "Привет", "Флаг"};
        ArrayDuplicate varTest = new ArrayDuplicate();
        String[] result =  varTest.remove(arr);
        String[] expect = new String[] {"Привет", "Мир", "Флаг", "Супер"};
        assertThat(result, is(expect));
    }

    @Test
    public void test1() {
        String[] arr = new String[] {"Привет", "Мир", "Привет", "Супер"};
        ArrayDuplicate varTest = new ArrayDuplicate();
        String[] result =  varTest.remove(arr);
        String[] expect = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }
}

