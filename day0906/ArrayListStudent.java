package com.nwpu.demo0906;

import java.util.ArrayList;

// 向ArrayList集合中添加自定义类的对象，并遍历

public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("欧阳锋", 20);
        Student two = new Student("黄药师", 21);
        Student three = new Student("洪七公", 22);
        Student four = new Student("段智兴", 23);
        
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名: " + stu.getName() + " 年龄: " + stu.getAge());
        }
    }
}
