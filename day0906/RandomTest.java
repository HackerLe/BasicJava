package com.nwpu.demo0906;

import java.util.Random;

//  使用random类产生100个1-10范围内的随机数

public class RandomTest {
    public static void main(String[] args) {
        int num = 10;
        Random r = new Random(num);
        System.out.println("产生100个1-10范围内的随机数: ");

        // 100.fori直接生成循环体
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(num) + 1;
            System.out.println(result);
        }
    }
}
