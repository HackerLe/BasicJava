package com.nwpu.demo0921;

public class FindVal {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 1, 7, 4, 9, 10, 6};
        int index = findVal(array, 4);
        if(index != -1) {
            System.out.println("数字4在该数组中第一次出现的下标是: " + index);
        } else {
            System.out.println("数字4在该数组中不存在!");
        }
    }

    /**
     * 从给定数组中查找给定值第一次出现的下标位置
     * @param array 被查找的数组
     * @param val 被查找的值
     * @return 若查找成功，则被查找的值在该数组中第一次出现的下标位置；
     *         若查找失败，则返回-1
     */
    public static int findVal(int array[], int val) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
