package ch06_io.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 使用ByteBuffer和FileChannel将"hello word nio，入门"写入到a.txt文件中
 * 同步非阻塞，一个线程处理多个请求，客户端请求会注册到多路复用器上，多路复用器轮询到连接有I/O请求就进行处理。
 * Channel（通道）、Buffer（缓冲区）、Selector（选择器）
 * <p>
 * 使用场景：NIO适合于连接数目较多且连接比较短的架构，比如聊天服务器、服务期间通信等，编程较复杂。JDK1.4新增。
 *
 * @author by guodd
 * @since 1.8
 */
public class NioMain01 {
    public static void main(String[] args) throws Exception {
        // 创建输出流
        String s = "hello word nio，入门";
        FileOutputStream fot = new FileOutputStream("d:/test/a.txt");
        // 获取FileChannel
        FileChannel fc = fot.getChannel();
        // 创建缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put(s.getBytes());
        buffer.flip();
        // 将缓存区内容写入文件
        fc.write(buffer);
        fot.close();
    }
}
