package com.nwpu.demo0906;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("name: " + stu1.getName() + " age: " + stu1.getAge());
        Student stu2 = new Student("赵丽颖", 20);
        System.out.println("name: " + stu2.getName() + " age: " + stu2.getAge());

        Student stu3 = new Student();
        System.out.println(stu3);

        Student stu4 = null;
        System.out.println(stu4);

        Student[] stu = new Student[3];
        System.out.println(stu[0]);

        new Student().test(); // 匿名对象的使用
    }
}
