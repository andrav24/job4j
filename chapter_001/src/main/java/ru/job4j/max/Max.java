package ru.job4j.max;

/**
 * Поиск максимального значения
 * @author Andrey Antonov
 * @version $Id$
 * @since 0.1
 */
public class Max {

    /**
     * Ищет максимальное значение из двух аргументов.
     * @param first   первый целочисленный аргумент
     * @param second  второй целочисленный аргумент
     * @return  число, большее из двух переданных
     */
    public int max(int first, int second){
        return first > second ? first : second;
    }
}
