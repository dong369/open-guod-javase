package ch06_ios.io_bio;

import java.io.*;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/4 时间:13:20
 * @JDK 1.8
 * @Description 功能模块：OutputStream输出流（流的输入、输出站在程序的角度）
 */
public class MainFileOutputStreamTest {
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
