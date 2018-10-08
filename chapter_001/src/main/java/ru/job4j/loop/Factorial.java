package ru.job4j.loop;

/**
 * Вычисляет факториал
 */
public class Factorial {

    /**
     * Вычисление факториала числа
     * @param n  Число, для которого считается факториал
     * @return   возвращает факториал, если передаем 0 - возвращает 1.
     */
    public int calc(int n) {
        int kk = 1;
        for (int i = 1; i <= n; i++) {
           kk *= i;
        }
        return kk;
    }
}
