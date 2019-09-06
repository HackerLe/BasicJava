package com.nwpu.demo0906;

import java.util.Random;
import java.util.Scanner;

// 使用random类模拟猜数字的小游戏

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;

        System.out.println("请输入你要猜测的数字: ");
        Scanner sc = new Scanner(System.in);
        int guessNum = sc.nextInt();

        while(true) {
            if(guessNum < randomNum) {
                System.out.println("猜小了!");
            }
            else if(guessNum > randomNum) {
                System.out.println("猜大了!");
            }
            else {
                System.out.println("恭喜你，猜中了！");
                break;
            }
            guessNum = sc.nextInt();
        }

        System.out.println("游戏结束!");
    }
}
