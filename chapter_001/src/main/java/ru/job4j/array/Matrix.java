package ru.job4j.array;

/**
 * класс для работы с матрицами
 */
public class Matrix {
    /**
     * таблица умножения
     * @param size  размерность таблицы
     * @return возвращает заполненную таблицу
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

}
