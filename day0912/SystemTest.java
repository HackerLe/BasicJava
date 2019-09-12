package com.nwpu.demo0912;

// 通过调用System类的currentTimeMillis方法来测试程序效率

public class SystemTest {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时:" + (e - s) + "毫秒");
    }
}
