package com.nwpu.demo0910;

public class DemoMain {
    public static void main(String[] args) {
        // 首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用
        USB usbMouse = new Mouse(); // 多态写法
        computer.usbDevice(usbMouse);

        // 创建一个USB键盘
        Keyboard keyboard = new Keyboard(); //没有使用多态写法
        computer.usbDevice(keyboard);

        computer.powerOff();
        System.out.println("=====================");
    }
}
