package ru.job4j.array;

/**
 * класс для сортировки массивов методом "слияния"
 */
public class MergeSort {

    /**
     * сортировка методом слияния
     * @param array1  отсортированный по возрастанию массив
     * @param array2  отсортированный по возрастанию массив
     * @return      возвращает отсортированный массив состоящий из элементов массивов, заданных в аргументах
     */
    public int[] sort(int[] array1, int[] array2) {
        int indexArray1 = 0, indexArray2 = 0;
        int[] arrayResult = new int[array1.length + array2.length];
        for (int i = 0; i < arrayResult.length; i++) {
            if (indexArray1 >= array1.length) {
                arrayResult[i] = array2[indexArray2++];
            } else if (indexArray2 >= array2.length) {
                arrayResult[i] = array1[indexArray1++];
            } else if (array1[indexArray1] < array2[indexArray2]) {
                arrayResult[i] = array1[indexArray1++];
            } else {
                arrayResult[i] = array2[indexArray2++];
            }
        }
        return arrayResult;
    }
}
