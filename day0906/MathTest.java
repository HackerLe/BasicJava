package com.nwpu.demo0906;

public class MathTest {
    public static void main(String[] args) {
        // 绝对值
        System.out.println(Math.abs(2.5)); // 2.5
        System.out.println(Math.abs(-2.5)); // 2.5
        System.out.println(Math.abs(2.5)); // 2.5

        // 向上取整
        System.out.println(Math.ceil(3.9)); //4.0
        System.out.println(Math.ceil(3.0)); //3.0
        System.out.println(Math.ceil(3.1)); //4.0

        // 向下取整
        System.out.println(Math.floor(3.9)); //3.0
        System.out.println(Math.floor(3.0)); //3.0
        System.out.println(Math.floor(3.1)); //3.0

        // 四舍五入
        System.out.println(Math.round(3.9)); //4
        System.out.println(Math.round(3.0)); //3
        System.out.println(Math.round(3.1)); //3
    }
}
