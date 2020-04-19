package ch06_io.nio;

import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/**
 * The class/interface NIO
 * NIO：Non IO同步非阻塞IO，是传统IO的升级，客户端和服务器端通过Channel（通道）通讯，实现了多路复用。
 * 一、缓冲区（Buffer）: 在Java NIO中负责数据的存取，缓冲区就是数组，用于存储不同数据类型的数据
 * {@link ByteBuffer}、{@link java.nio.FloatBuffer}等等
 * allocate()、allocateDirect()获取缓冲区
 * put、get两个方法
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
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
}
