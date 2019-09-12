package com.nwpu.demo0912;

import red.OpenMode;

/*
* 场景说明：
*       红包发出去之后，所有人都有红包，大家抢完了之后，最后一个红包给群主自己
* 红包分发的策略：
*       1.普通红包（平均）：totalMoney / totalCount，余数放在最后一个红包当中
*       2.手气红包（随机）：最少1分钱，最多不超过平均数的两倍。应该越发越少
* */
public class BootStrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("微信红包");
        // 设置群主名称
        red.setOwnerName("王思聪");

        // 普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);

        // 手气红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);

    }
}
