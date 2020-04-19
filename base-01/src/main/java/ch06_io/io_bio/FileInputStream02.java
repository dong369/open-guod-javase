package ch06_io.io_bio;

import java.io.*;

/**
 * InputStream输入流（流的输入、输出站在程序的角度），属于节点流
 * 同步并阻塞，一个连接一个线程，即客户端有请求服务端就会开启一个线程进行处理。缺点就是如果这个连接不做任何事情就会造成不必要的线程开销。
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class FileInputStream02 {
    public static void main(String[] args) {
        // 01创建文件
        InputStream in = null;
        try {
            in = new FileInputStream(
                    new File(System.getProperty("user.dir")
                             + "/base-01/src/main/java/ch06_io/io_bio/FileInputStream02.java"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        try {
            // 02读取文件
            byte[] buffer = new byte[2048];
            long num = 0;
            while ((in.read(buffer)) > 0) {
                System.out.print(new String(buffer));
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("共读取了 " + num + " 个字节");
        } catch (IOException e1) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }
}
