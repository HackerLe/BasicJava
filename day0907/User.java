package com.nwpu.demo0907;

public class User {

    private String name;
    private int money; //余额，也就是当前用户拥有的钱数

    public User() {

    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show() {
        System.out.println("我叫 " + name + " 我有 " + money + " 元！");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}
