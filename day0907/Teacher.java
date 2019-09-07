package com.nwpu.demo0907;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Teacher extends Employee {

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void method() {
        System.out.println(this.getName());
        System.out.println(this.getAge());
    }
}
