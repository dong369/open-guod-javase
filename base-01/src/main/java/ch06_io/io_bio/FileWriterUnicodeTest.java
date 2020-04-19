package ch06_io.io_bio;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author guodd
 * @version 3.0
 * @since 1.8
 */
public class FileWriterUnicodeTest {
    public static void main(String[] args) {
        FileWriter writer;
        try {
            writer = new FileWriter(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_io/io_bio/unicode.dat");
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
