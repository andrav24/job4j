package ru.job4j.array;

/**
 * Класс для работы с массивами
 */
public class Square {
    /**
     * заполняет массив через цикл элементами от 1 до bound возведенными в квадрат
     * @param bound верхняя граница
     * @return  массив квадратов чисел от 1 до bound
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}
