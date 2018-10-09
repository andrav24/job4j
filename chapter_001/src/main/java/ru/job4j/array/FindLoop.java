package ru.job4j.array;

/**
 * Класс для поиска в массиве
 *
 */
public class FindLoop {
    /**
     * Ищет элемент в массиве
     * @param data  имя массива
     * @param el    элемент массива, который ищем
     * @return      если элемент найден возврвщает индекс элемента в массиве, иначе -1
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            // ищем заданный аргументом el элемент массива data
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
