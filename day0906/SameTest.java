package com.nwpu.demo0906;

import java.util.Scanner;

public class SameTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(isSame(a, b));
    }

    public static boolean isSame(int a, int b) {
/*        boolean same;
        // 方法一
        if (a == b)
            same = true;
        else
            same = false;
        // 方法二
        same = a == b ? true : false;
        // 方法三
        same = a == b;
        return same;*/
        // 方法四
        return a == b;
    }
}
