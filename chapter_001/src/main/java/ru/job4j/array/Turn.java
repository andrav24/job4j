package ru.job4j.array;

/**
 * работа с массивом
 */
public class Turn {
    /**
     * Переворот массива
     * @param array Массив, который надо перевернуть
     * @return  возвращает перевернутый массив
     */
    public int[] turn(int[] array) {
        int size = array.length;
        int tmp;
        for (int i = 0; i < size / 2; i++) {
            tmp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = tmp;
        }
        return array;
    }
}
