package ch06_io.io_bio;

import java.io.RandomAccessFile;

/**
 * 随机访问文件类 随机访问流
 * seek();
 * skip();
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class RandomIo01 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf = new RandomAccessFile("d:/test/test.txt", "rw");
        rf.write("java".getBytes());
        // 绝对定位到第3个字节
        rf.seek(3);
        rf.close();
    }
}
