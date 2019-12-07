package ch06_io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Project - Channel（通道）、Buffer（缓冲区）、Selector（选择器）
 *
 * @Create by guodd
 * @Version 1.0
 * @Date 日期:2019/1/3 时间:14:50
 * @JDK 1.8
 * @Description 使用ByteBuffer和FileChannel，将a.txt文件中的输出到控制台
 */
public class NioMain02 {
    public static void main(String[] args) throws Exception {
        // 创建输出流
        File f = new File("d:/a.txt");
        FileInputStream fin = new FileInputStream(f);
        // 获取FileChannel
        FileChannel fc = fin.getChannel();
        // 创建缓冲区
        ByteBuffer buffer = ByteBuffer.allocate((int) f.length());
        // 读入
        fc.read(buffer);
        System.out.println(new String(buffer.array()));
        fin.close();
    }
}
