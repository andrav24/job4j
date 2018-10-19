package ru.job4j.array;

/**
 * класс для сортировки массивов методом "слияния"
 */
public class MergeSort {

    /**
     * сортировка методом слияния
     * @param arr1  отсортированный по возрастанию массив
     * @param arr2  отсортированный по возрастанию массив
     * @return      возвращает отсортированный массив состоящий из элементов массивов, заданных в аргументах
     */
    public int[] sort(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int[] arr = new int[arr1.length + arr2.length];

        for (int k = 0; k < arr.length; k++) {
            if (i > arr1.length - 1) {
                arr[k] = arr2[j];
                j++;
            } else if (j > arr2.length - 1) {
                arr[k] = arr1[i];
                i++;
            } else if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
        }
        return arr;
    }
}
