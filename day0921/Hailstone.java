package com.nwpu.demo0921;

import java.util.Scanner;

public class Hailstone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true) {
            System.out.print("Input n:");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("请输入自然数,重新输入:");
                continue;
            }
            int max = n;
            int temp = n;
            while(temp > 1) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else if (temp % 2 != 0) {
                    temp = 3 * temp + 1;
                }

                if(max < temp) {
                    max = temp;
                }
            }
            System.out.println("H(" + n + ") = " + max);
            break;
        }
    }
}
