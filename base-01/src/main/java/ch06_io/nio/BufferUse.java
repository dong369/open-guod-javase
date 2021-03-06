package ch06_io.nio;

import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/**
 * The class/interface NIO：Non IO同步非阻塞IO，是传统IO的升级，客户端和服务器端通过Channel（通道）通讯，实现了多路复用。
 * 一、数据类型
 * 根据数据类型不同（boolean 除外） ， 提供看了相应类型的缓冲区：
 * ByteBuffer
 * CharBuffer
 * ShortBuffer
 * IntBuffer
 * LongBuffer
 * FloatBuffer
 * DoubleBuffer
 * 上述缓冲区的管理方式几乎一致，通过allocate()获取缓冲区
 * <p>
 * 二、缓冲区存取数据的两个核心方法：
 * put()：存入数据到缓冲区
 * get()：获取缓冲区中的数据
 * <p>
 * 三、缓冲区中的四个核心属性：
 * capacity : 容量，表示缓冲区中最大存储数据容量。一旦声明不能改变。
 * limit: 界限，表示缓冲区中可以操作数据的大小。（limit 后的数据不能进行读写）
 * position: 位置，表示缓冲区中正在操作数据的位置。
 * <p>
 * mark : 标记，表示记录当前 position 的位置。可以通过 reset()回复到 mark()的位置
 * <p>
 * 0 <= mark <= position <= limit <= capacity
 * <p>
 * 四、直接缓冲区与非直接缓冲区：
 * 非直接缓冲区：通过 allocate() 方法分配缓冲区，将缓冲区建立在 JVM 的内存中
 * 直接缓冲区：通过allocateDirect() 方法分配直接缓冲区，将缓冲区建立在物理内存中。可以提高效率
 *
 * @author guodd
 * @version 1.0
 */
public class BufferUse {
    @Test
    public void buffer() {
        FloatBuffer allocate = FloatBuffer.allocate(12);
        FloatBuffer put = allocate.put(12);
        System.out.println(put.get());
        ByteBuffer allocBuffer = ByteBuffer.allocate(12);
        ByteBuffer allocateInfo = allocBuffer.put("str".getBytes());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(12);
        // ByteBuffer allocateDirectInfo = allocateDirect.put(new Byte("java"));
        byte b = allocateInfo.get();
        System.out.println(b);
    }

    @Test
    public void test1() {
        // 分配直接缓冲区
        ByteBuffer buf = ByteBuffer.allocateDirect(1024);
        buf.put("java".getBytes());
        System.out.println(buf.isDirect());
        System.out.println(buf.get());
    }

    @Test
    public void test2() {
        String str = "abcde";

        ByteBuffer buf = ByteBuffer.allocate(1024);

        buf.put(str.getBytes());

        buf.flip();

        byte[] dst = new byte[buf.limit()];
        buf.get(dst, 0, 2);

        System.out.println(new String(dst, 0, 2));
        System.out.println(buf.position());

        // mark() ：标记
        buf.mark();

        buf.get(dst, 2, 2);
        System.out.println(new String(dst, 2, 2));
        System.out.println(buf.position());

        // rest() : 恢复 mark 的位置
        buf.reset();
        System.out.println(buf.position());

        // 判断缓冲区中是否还有剩余的数据
        if (buf.hasRemaining()) {
            //获取缓冲区中可以操的数量
            System.out.println(buf.remaining());
        }
    }


    @Test
    public void test3() {

        String str = "abcde";

        //1. 配一个指定大小的缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);

        System.out.println("--------------------allocate()-----------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //2. 利用put() 存入数据到缓冲区
        buf.put(str.getBytes());
        System.out.println("--------------------put()----------------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //3. 切换读取数据模式
        buf.flip();

        System.out.println("--------------------flip()---------------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //4. 利用 get() 读取缓冲区中的数据
        byte[] dst = new byte[buf.limit()];
        buf.get(dst);
        System.out.println(new String(dst, 0, dst.length));

        System.out.println("--------------------get()----------------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //5. rewind() : 可重复读
        buf.rewind();

        System.out.println("--------------------rewind()-------------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //6. clear() : 清除缓冲区，但是缓冲区中的数据依然存在，但是出于“被遗忘” 状态
        buf.clear();

        System.out.println("--------------------clear()---------------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());
        System.out.println((char) buf.get(4));

    }
}
