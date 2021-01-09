package ch06_io.filecopy;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * The class/interface 多线程拷贝
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class ThreadCopy {
    // 计算每一个线程复制文件块的大小
    static int block = 0;
    static int i = 0;

    public static void main(String[] args) throws Exception {
        File srcFile = new File("D:\\01-系统配置\\02_系统安装\\03_镜像系统\\cn_windows_10_business_editions_version_1909_updated_jan_2020_x64_dvd_b3e1f3a6.iso");
        // 文件长度大小
        int srcLength = (int) srcFile.length();
        System.out.println(srcLength - 1);

        File destFile = new File("D:/test");

        // 随机流
        final RandomAccessFile rw = new RandomAccessFile(destFile, "rw");
        final RandomAccessFile r = new RandomAccessFile(srcFile, "r");
        rw.setLength(srcLength);

        // 线程个数
        int count = 5;
        block = srcLength / count;
        // 开启线程
        for (i = 0; i < count; i++) {
            Thread t = new Thread(() -> {
                int temp = i;
                int start = temp * block;
                int end;
                // 最后一块特殊处理
                if (temp != (count - 1)) {
                    end = (temp + 1) * block - 1;
                } else {
                    end = srcLength - 1;
                }
                System.out.println(start + "--" + end);
                try {
                    // 定位文件
                    rw.seek(start);
                    byte[] bytes = new byte[end - start + 1];
                    System.out.println(temp + "over");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            t.start();
            t.join();
        }
    }
}
