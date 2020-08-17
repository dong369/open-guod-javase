package ch06_io.io_bio;

import java.io.*;

/**
 * 缓冲输入流
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class BufferedStream01 {
    public static void main(String[] args) {
        try {
            // 输入缓冲流
            BufferedInputStream inputStream = new BufferedInputStream(
                    new FileInputStream(
                            System.getProperty("user.dir")
                            + "/base-01/src/main/java/ch06/bio/BufferedStreamTest01.java")
            );
            // 输出缓冲流
            BufferedOutputStream outputStream = new BufferedOutputStream(
                    new FileOutputStream(
                            System.getProperty("user.dir")
                            + "/base-01/src/main/java/ch06/bio/BufferedStreamTest.java")
            );
            System.out.println(inputStream.read());
            int c;
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
