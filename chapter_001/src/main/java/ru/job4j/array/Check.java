package ru.job4j.array;

public class Check {
    /**
     * Метод должен проверить, что все элементы в массиве являются true или false.
     * Например.
     * {true, true, true} - вернет true;
     * {true, false, true} - вернет false;
     * {false, false, false} - вернет true;
     * @param data  массив
     * @return      вернет true - если все элементы массива одинаковые, иначе вернет false
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean firstElem = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] != firstElem) {
                result = false;
                break;
            }
        }
        return result;
    }
}
