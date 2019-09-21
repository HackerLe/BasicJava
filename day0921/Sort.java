package com.nwpu.demo0921;

public class Sort {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 8, 1, 9, 4, 6, 7};
        bubbleSort(array);
        printArray(array);
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * 简单选择排序，把数组按从小到大排列
     * @param array  待排序的数组
     * @return
     */
    public static void selectSort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    min  = j;
                }
            }

            if (min != i) {
                swap(array, i, min);
            }
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]){
                    swap(array, j, j + 1);
                }
            }
        }
    }
}
