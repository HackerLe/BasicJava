package com.nwpu.demo0906;

import java.util.Arrays;

// 使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序输出
public class ArraysPractice {
    public static void main(String[] args) {
        String str = "adlsfduoiw23894";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        // 倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
