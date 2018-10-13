package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * тест класса MatrixCheck
 */
public class MatrixCheckTest {
    /**
     * нечетное кол-во строк
     * обе диагонали имеют элементы с одинаковыми значениями
     * должен вернуть true
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * нечетное кол-во строк
     * обе диагонали имеют элементы с разными значениями
     * должен вернуть false
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * четное кол-во строк
     * обе диагонали имеют элементы с оданоковыми значениями
     * должен вернуть true
     */
    @Test
    public void whenDataMonoEvenByFalseThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {false, true, false, false},
                {false, false, false, false},
                {true, false, false, false},
                {false, false, false, false},
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * нечетное кол-во строк
     * в одной из диагоналей значения не одинаковые
     * должен вернуть false
     */
    @Test
    public void whenDataNotMonoEvenByFalseThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {false, true, false, false},
                {false, false, false, false},
                {true, false, false, false},
                {false, false, false, true},
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * нечетное кол-во строк
     * в одной диагонали все значения true
     * в другой диагонал все значения false
     * должен вернуть true
     */
    @Test
    public void whenDataNotMonoEvenByFalseAndTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {false, true, false, true},
                {false, false, true, false},
                {true, true, false, false},
                {true, false, false, false},
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
}