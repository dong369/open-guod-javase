package ch06_io.io_bio;

import java.io.*;

/**
 * Project - 同步并阻塞，一个连接一个线程，即客户端有请求服务端就会开启一个线程进行处理。缺点就是如果这个连接不做任何事情就会造成不必要的线程开销。
 *
 * @Create by guodd
 * @Version 1.0
 * @Date 日期:2019/1/3 时间:14:50
 * @JDK 1.8
 * @Description
 */
public class FileOutputStream02 {
    public static void main(String[] args) {
        try {
            int b;
            FileInputStream fin = new FileInputStream(new File(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_io/io_bio/FileOutputStream02.java"));
            InputStreamReader inputStreamReader = new InputStreamReader(fin);
            BufferedInputStream reader = new BufferedInputStream(fin);
            while ((b = reader.read()) != -1) {
                System.out.print((char) b);
            }
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
