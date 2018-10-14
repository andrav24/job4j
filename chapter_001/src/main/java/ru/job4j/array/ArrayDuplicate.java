package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    /**
     * поиск дубликатов в массиве строк
     *
     * @param array проверяемый массив
     * @return возвращает массив без дубликатов
     */

    public String[] remove(String[] array) {
        int size = array.length;
        int counter = 0;    // кол-во найденных дубликатов
        for (int i = 0; i < size - counter - 1; i++) {
            for (int j = size - counter - 1; j > i; j--) {
                if (array[i].equals(array[j])) {
                    String tmp = array[size - counter - 1];
                    array[size - counter - 1] = array[j];
                    array[j] = tmp;
                    counter++;
                }
            }
        }
        return Arrays.copyOf(array, size - counter);
    }
}
