package com.nwpu.demo0922;

public class FindVal {

    /**
     * 从给定数组中查找给定值
     * @param array 被查找的数组
     * @param val 被查找的值
     * @return 查找成功返回true，查找失败返回false
     */
    public static boolean search(int array[], int val) {
        for (int i : array) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }
}
