package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Andrey Antonov
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {

    /**
     * тест метода paint
     * размер доски 2 на 3
     */
    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 2);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X%s X %s", ln, ln)
                )
        );
    }

    /**
     * тест метода paint
     * размер доски 3 на 3
     */
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("X X%s X %sX X%s", line, line, line);
        assertThat(result, is(expected));
    }

    /**
     * тест метода paint
     * размер доски 5 на 4
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("X X X%s X X %sX X X%s X X %s", line, line, line, line);
        assertThat(result, is(expected));
    }
}
