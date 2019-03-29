package ch06_ios.io_bio;

import java.io.*;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/5 时间:14:15
 * @JDK 1.8
 * @Description 功能模块：缓冲输入流
 */
public class MainBufferedStreamTest {
    public static void main(String[] args) {
        try {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(System.getProperty("user.dir") + "/base-01/src/main/java/ch06/bio/MainBufferedStreamTest01.java"));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(System.getProperty("user.dir") + "/base-01/src/main/java/ch06/bio/MainBufferedStreamTest.java"));
            System.out.println(inputStream.read());
            int c = 0;
            inputStream.mark(100);
            for (int i = 0; i <= 10 && (c = inputStream.read()) != -1; i++) {
                System.out.print(c + " ");
            }
            System.out.println();
            inputStream.reset();
            for (int i = 0; i <= 10 && (c = inputStream.read()) != -1; i++) {
                System.out.println(c + " ");
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
