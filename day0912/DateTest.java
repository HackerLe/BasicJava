package com.nwpu.demo0912;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 计算一个人已经出生了多少天

public class DateTest {
    public static void main(String[] args) throws ParseException {
        // 1.使用Scanner类中的next方法，获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期:");
        String birthdayDateString = sc.next();
        // 2.使用DaTeFormat类中的parse方法，把字符串的出生日期，解析为Date格式的出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        // 3.把Date格式的出生日期转换为毫秒数
        long birthdayDateTime = birthdayDate.getTime();
        // 4.获取当前的日期，转换为毫秒值
        long todayTime = new Date().getTime();
        // 5.使用当前日期的毫秒值-出生日期的毫秒值
        long time = todayTime - birthdayDateTime;
        // 6.把毫秒差值转换为天(s/1000/60/60/24)
        long day = time / 1000 / 60 / 60 / 24;
        System.out.println("您已出生" + day + "天");
    }
}
