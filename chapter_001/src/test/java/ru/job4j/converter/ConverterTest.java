package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *  тест для класса Converter.
 */

public class ConverterTest {

    /**
     *  тест метода rubleToDollar.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     *  тест метода rubleToEuro.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * тест метода euroToRuble.
     */
    @Test
    public void when2EuroToRubleThen140() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(2);
        assertThat(result, is(140));
    }

    /**
     * тест метода dollarToRuble.
     */
    @Test
    public void when5DollarToRubleThen300() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(5);
        assertThat(result, is(300));
    }
}
