package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    /**
     * поиск дубликатов в массиве строк
     * @param array     проверяемый массив
     * @return        возвращает массив без дубликатов
     */
    public String[] remove(String[] array) {
        int size = array.length;
        int counter = 0;    // кол-во найденных дубликатов
        // обход массива
        for (int i = 0; i < size - counter - 1; i++) {
            // ищем дубликат, начиная с позиции на 1 больше, чем индекс проверяемого элемента массива
            for (int j = i + 1; j < size - counter; j++) {
                if (array[i].equals(array[j])) {
                    counter++;
                    // меняем местами последний элемент массива с дубликатом
                    // если при этом значения равны, смотреть предпоследний элемент
                    // т.е. первый найденный дубликат встанет последним в массиве
                    // следующие будут вставляться перед ним
                    for (int k = size - counter; k > j; k--) {
                        if (array[j].equals(array[k])) {
                            counter++;
                        } else {
                            String tmp = array[k];
                            array[k] = array[j];
                            array[j] = tmp;
                            break;
                        }
                    }
                }

            }
        }

        return Arrays.copyOf(array, size - counter);
    }
}