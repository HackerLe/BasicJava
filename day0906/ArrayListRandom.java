package com.nwpu.demo0906;

// 产生6个1-33之间的随机数字，添加到集合，并遍历集合

import java.util.Random;
import java.util.ArrayList;

public class ArrayListRandom {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}