package com.nwpu.demo0924;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    多线程安全：实现卖票案例
 */
public class RunnableImpl implements Runnable {
    // 定义一个多个线程共享的票源
    private int ticket = 100;

//    // 创建一个锁对象
//    Object obj = new Object();
//
//    //设置线程任务，卖票，使用同步代码块解决访问共享数据的问题
//    @Override
//    public void run() {
//        // 死循环，让卖票操作重复进行
//        while(true) {
//            // 同步代码块
//            synchronized (obj) {
//                // 先判断票是否存在
//                if(ticket > 0) {
//                    try {
//                        // 提高安全问题出现的频率，让程序睡眠
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    // 票存在，卖票
//                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
//                    ticket--;
//                }
//            }
//        }
//    }
//
//    // 设置线程任务，卖票，使用同步方法解决访问共享数据的问题
//    @Override
//    public void run() {
//        // 使用死循环，让卖票操作重复进行
//        while(true) {
//            payTicket();
//        }
//    }
//
//    public synchronized void payTicket() {
//        // 先判断票是否存在
//        if(ticket > 0) {
//            try {
//                // 提高安全问题出现的频率，让程序睡眠
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            // 票存在，卖票
//            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
//            ticket--;
//        }
//    }

    //设置线程任务，卖票，使用Lock锁解决访问共享数据的问题
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        // 死循环，让卖票操作重复进行
        while(true) {
            // 在可能会出现安全问题的代码前调用lock接口中的方法lock获取锁
            l.lock();
            // 先判断票是否存在
            if(ticket > 0) {
                try {
                    // 提高安全问题出现的频率，让程序睡眠
                    Thread.sleep(10);
                    // 票存在，卖票
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
                    l.unlock(); //无论程序是否异常，都会把锁释放
                }
            }
        }
    }
}
