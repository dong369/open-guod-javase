package ch06_io.io_bio;

import java.io.*;

/**
 * OutputStream输出流（流的输入、输出站在程序的角度）
 * project - 同步并阻塞，一个连接一个线程，即客户端有请求服务端就会开启一个线程进行处理。
 * 缺点就是如果这个连接不做任何事情就会造成不必要的线程开销。
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/4 时间:13:20
 * @since 1.8
 */
public class FileOutputStream01 {
    public static void main(String[] args) {
        int b;
        InputStream in;
        OutputStream out;
        try {
            in = new FileInputStream(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_ios/io_bio/test01.txt");
            out = new FileOutputStream(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_ios/io_bio/test02.txt");
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件已复制");
    }
}
