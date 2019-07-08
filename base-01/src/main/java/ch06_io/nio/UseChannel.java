package ch06_io.nio;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 一、通道 (Channel): 同于源节点与目标节点的连接。在java NIO  中负责缓冲区中数据的传输。Channel 本身不存储数据，因此需要配合缓冲区进行传输
 * <p>
 * 二、通道的主要实现类
 * java.nio.channels.Channel 接口：
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
 * 编码：字符串 -->字节数组
 * 解码：字节数组 -->字符串
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/4/9 时间:11:57
 * @JDK 1.8
 * @Description 功能模块：
 */
public class UseChannel {
    //获取字符集
    @Test
    public void test5() {
        Map<String, Charset> map = Charset.availableCharsets();
        Set<Entry<String, Charset>> set = map.entrySet();
        for (Entry<String, Charset> entry : set) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
