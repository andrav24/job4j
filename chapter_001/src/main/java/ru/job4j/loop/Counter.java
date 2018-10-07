package ru.job4j.loop;

/**
 * класс Counter
 *
 */
public class Counter {

    /**
     * вычисление суммы четных чисел в диапазоне от start до finish.
     *
     * @param start  нижняя граница диапазона
     * @param finish верхняя граница диапазона
     * @return возвращает сумму всех четных чисел из диапазона
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) { sum += i; }
        }
        return sum;
    }
}