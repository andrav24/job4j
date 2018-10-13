package ru.job4j.array;

/**
 * класс для работы с матрицами
 */
public class MatrixCheck {
    /**
     * Метод должен проверить, что все элементы по диагоналям равны true или false.
     * Если диагонали не содержат общих ячеек тогда диагонали могут быть разными по значению
     *  например одна диагональ - true вторая-  false
     * @param data      ссылка на массив, который надо проверить.
     * @return      true или false
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int size = data.length;
        if (size % 2 != 0) {
            for (int i = 0; i < size; i++) {
                if (data[i][i] != data[i][size - i - 1]) {
                    result = false;
                    break;
                }
            }
        } else {
                boolean firstElemOne, firstElemTwo;
                firstElemOne = data[0][0];
                firstElemTwo = data[0][size - 1];
                for (int i = 0; i < size; i++) {
                    if ((data[i][i] != firstElemOne) || (data[i][size - i - 1] != firstElemTwo)) {
                        result = false;
                        break;
                    }
                }
            }

        return result;

    }
}
