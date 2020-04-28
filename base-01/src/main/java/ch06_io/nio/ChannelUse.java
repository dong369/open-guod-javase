package ch06_io.nio;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

/**
 * 一、通道 (Channel): 同于源节点与目标节点的连接。在java NIO  中负责缓冲区中数据的传输。Channel 本身不存储数据，因此需要配合缓冲区进行传输
 * <p>
 * 二、通道的主要实现类
 * java.nio.channels.Channel接口：
 * |--FileChannel
 * |--SocketChannel
 * |--ServerSocketChannel
 * |--DatagramChannel
 * <p>
 * 三、获取通道
 * 1. Java 针对支持通道的类提供了 getChannel() 方法
 * 本地 IO：
 * FileInputStream/FileOutputStream
 * RandomAccessFile
 * <p>
 * 网络IO:
 * Socket
 * ServerSocket
 * DatagramSocket
 * <p>
 * 2. 在 JDK 1.7 中的 NIO.2 针对各个通道了提供了静态方法 open()
 * 3. 在 JDK 1.7 中的 NIO.2 的Files 工具类的 newByteChannel()
 * <p>
 * 四、通道之间的数据传输
 * transferFrom
 * transferTo()
 * <p>
 * 五、分散(Scatter)与聚集(Gather)
 * 分散读取 (Scattering Reads) : 将通道中的数据分散到多个缓冲区中
 * 聚集写入 (Gathering Writes) : 将多个缓冲区的数据聚集到通道中
 * <p>
 * 六、字符集：Charset
 * 编码：字符串-->字节数组
 * 解码：字节数组-->字符串
 *
 * @author guodd
 * @version 1.0
 */

public class ChannelUse {
    /**
     * 使用ByteBuffer和FileChannel将"hello word nio，入门"写入到a.txt文件中
     * 同步非阻塞，一个线程处理多个请求，客户端请求会注册到多路复用器上，多路复用器轮询到连接有I/O请求就进行处理。
     * Channel（通道）、Buffer（缓冲区）、Selector（选择器）
     * <p>
     * 使用场景：NIO适合于连接数目较多且连接比较短的架构，比如聊天服务器、服务期间通信等，编程较复杂。JDK1.4新增。
     */
    @Test
    public void output() throws Exception {
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

    /**
     * 使用ByteBuffer和FileChannel，将a.txt文件中的输出到控制台
     * Project - 同步非阻塞，一个线程处理多个请求，客户端请求会注册到多路复用器上，多路复用器轮询到连接有I/O请求就进行处理。
     * Channel（通道）、Buffer（缓冲区）、Selector（选择器）
     */
    @Test
    public void input() throws Exception {
        // 创建输出流
        File f = new File("d:/test/a.txt");
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

    //获取字符集
    @Test
    public void test5() {
        Map<String, Charset> map = Charset.availableCharsets();
        Set<Map.Entry<String, Charset>> set = map.entrySet();
        for (Map.Entry<String, Charset> entry : set) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
