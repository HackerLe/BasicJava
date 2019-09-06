package com.nwpu.demo0906;

//一个标准的学生类
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("无参构造函数执行了!");
    }

    public Student(String name, int age) {
        System.out.println("有参构造方法执行了！");
        this.name = name;
        this.age = age;
    }

    public void test() {
        System.out.println("test!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
