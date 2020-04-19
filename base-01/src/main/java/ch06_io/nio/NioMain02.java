package ch06_io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 使用ByteBuffer和FileChannel，将a.txt文件中的输出到控制台
 * Project - 同步非阻塞，一个线程处理多个请求，客户端请求会注册到多路复用器上，多路复用器轮询到连接有I/O请求就进行处理。
 * Channel（通道）、Buffer（缓冲区）、Selector（选择器）
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
