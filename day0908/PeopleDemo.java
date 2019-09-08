package com.nwpu.demo0908;

// 说英语的接口
interface SpeakEnglish {
    public abstract void speak();
}

// 抽象的人类
abstract class People {
    private String name;
    private int age;

    public People() {

    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public abstract void eat();
}

// 抽象的教练类
abstract class Coach extends People {
    public Coach() {

    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}

// 抽象的运动员类
abstract class Player extends People {
    public Player() {

    }

    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}

// 乒乓球教练类
class PingpangCoach extends Coach implements SpeakEnglish {
    public PingpangCoach() {

    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    public void speak() {
        System.out.println("我会说英语");
    }

    public void eat() {
        System.out.println("乒乓球教练吃白菜豆腐");
    }

    public void teach() {
        System.out.println("乒乓球教练教如何发球和接球");
    }
}

// 篮球教练类
class BasketBallCoach extends Coach {
    public BasketBallCoach() {

    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("篮球教练吃红烧肉");
    }

    public void teach() {
        System.out.println("篮球教练教如何带球和投篮");
    }
}

// 乒乓球运动员类
class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer() {

    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    public void speak() {
        System.out.println("乒乓球运动员学习说英语");
    }
    public void eat() {
        System.out.println("乒乓球运动员吃西红柿鸡蛋");
    }

    public void study() {
        System.out.println("乒乓球运动员学习如何发球和接球");
    }
}

// 篮球运动员类
class BasketBallPlayer extends Player {
    public BasketBallPlayer() {

    }

    public BasketBallPlayer(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("篮球运动员吃牛肉");
    }

    public void study() {
        System.out.println("篮球运动员学习如何带球和投篮");
    }
}

public class PeopleDemo {
    public static void main(String[] args) {
        // 测试
        PingpangCoach ppc = new PingpangCoach("刘国梁", 50);
        ppc.eat();
        ppc.teach();
        ppc.speak();
        System.out.println("-----------------------------------------");

        PingPangPlayer ppp = new PingPangPlayer("王皓", 30);
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("-----------------------------------------");

        BasketBallCoach bbc = new BasketBallCoach("乔丹", 60);
        bbc.eat();
        bbc.teach();
        System.out.println("-----------------------------------------");

        BasketBallPlayer bbp = new BasketBallPlayer("张伯伦", 30);
        bbp.eat();
        bbp.study();
    }
}
