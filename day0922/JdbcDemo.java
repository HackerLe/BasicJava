package com.nwpu.demo0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门
 */
public class JdbcDemo {
    public static void main(String[] args) throws Exception{
        // 1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "1027");
        // 3.定义sql语句
        String sql = "update stu set age = 23 where name = 'lijiale'";
        // 4.获取执行sql的对象
        Statement stmt = conn.createStatement();
        // 5.执行sql
        int count = stmt.executeUpdate(sql);
        // 6.处理结果
        System.out.println(count);
        // 7.释放资源
        stmt.close();
        conn.close();
    }
}
