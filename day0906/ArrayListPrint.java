package com.nwpu.demo0906;

// 按照指定格式遍历集合

import java.util.ArrayList;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("欧阳锋");
        list.add("洪七公");
        list.add("郭靖");
        list.add("黄蓉");

        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size() - 1) {
                System.out.print(name + "}");
            }
            else {
                System.out.print(name + "@");
            }
        }
    }
}
