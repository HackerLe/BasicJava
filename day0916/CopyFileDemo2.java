package com.nwpu.demo0916;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        // java.io.FileNotFoundException: c:\a.txt (系统找不到指定文件)
        FileInputStream fis = new FileInputStream("c:\\a.txt");
        // 封装目的地
        FileOutputStream fos = new FileOutputStream("d:\\b.txt");

        // 读写数据
        int by = 0;
        while((by = fis.read()) != -1) {
            fos.write(by);
        }

        // 释放资源
        fos.close();
        fos.close();
    }
}
