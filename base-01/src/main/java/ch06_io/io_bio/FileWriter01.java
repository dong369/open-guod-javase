package ch06_io.io_bio;

import java.io.*;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/4 时间:13:47
 * @since 1.8
 */
public class FileWriter01 {
    public static void main(String[] args) {
        int c;
        Reader reader;
        Writer writer;
        try {
            reader = new FileReader(new File(System.getProperty("user.dir")
                                             + "/base-01/src/main/java/ch06_io/io_bio/test01.txt"));
            writer = new FileWriter(new File(System.getProperty("user.dir")
                                             + "/base-01/src/main/java/ch06_ios/io_bio/test02.txt"));
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
