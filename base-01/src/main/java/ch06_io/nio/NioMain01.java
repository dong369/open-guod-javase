package ch06_io.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Project - Channel（通道）、Buffer（缓冲区）、Selector（选择器）
 *
 * @Create by guodd
 * @Version 1.0
 * @Date 日期:2019/1/3 时间:14:50
 * @JDK 1.8
 * @Description 使用ByteBuffer和FileChannel将"hello word nio，入门"写入到a.txt文件中
 */
public class NioMain01 {
    public static void main(String[] args) throws Exception {
        // 创建输出流
        String s = "hello word nio，入门";
        FileOutputStream fot = new FileOutputStream("d:/a.txt");
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
