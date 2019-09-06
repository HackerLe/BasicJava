package com.nwpu.demo0906;

// 筛选集合中的随机数

import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }

        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("偶数总共有多少个: " + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }

    // 这个方法，接受大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}
