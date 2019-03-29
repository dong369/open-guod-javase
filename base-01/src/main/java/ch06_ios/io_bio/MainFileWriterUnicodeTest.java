package ch06_ios.io_bio;

import java.io.FileWriter;
import java.io.IOException;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/10 时间:14:45
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainFileWriterUnicodeTest {
    public static void main(String[] args) {
        FileWriter writer = null;

        try {
            writer = new FileWriter(System.getProperty("user.dir") + "/base-01/src/main/java/ch07/unicode.dat");
            for (int i = 0; i <= 50000; i++) {
                writer.write(i);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件写入错误");
            System.exit(-1);

        }

    }
}
