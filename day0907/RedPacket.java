package com.nwpu.demo0907;

import java.util.ArrayList;

public class RedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);
        Member four = new Member("成员D", 0);
        Member five = new Member("成员E", 0);
        Member six = new Member("成员F", 0);
        Member seven = new Member("成员G", 0);
        Member eight = new Member("成员H", 0);

        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
        five.show();
        six.show();
        seven.show();
        eight.show();
        System.out.println("========================");

        ArrayList<Integer> redList = manager.send(20,8);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        four.receive(redList);
        five.receive(redList);
        six.receive(redList);
        seven.receive(redList);
        eight.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
        five.show();
        six.show();
        seven.show();
        eight.show();
    }
}
