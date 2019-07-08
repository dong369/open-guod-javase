package ch06_io.io_bio;

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
public class MainBufferedReaderTest {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_ios/io_bio/test03.txt"));
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_ios/io_bio/test03.txt"));
            String s;
            for (int i = 0; i < 100; i++) {
                s = String.valueOf(Math.random());
                writer.write(s);
                writer.newLine();
            }
            writer.flush();
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
            writer.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
