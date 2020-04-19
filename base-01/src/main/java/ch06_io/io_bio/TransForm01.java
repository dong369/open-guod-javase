package ch06_io.io_bio;

import java.io.*;

/**
 * 转换流
 *
 * @author guodd
 * @version 3.0
 * @since 1.8
 */
public class TransForm01 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(
                    new FileOutputStream(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_io/io_bio/test.txt", true)
            );
            InputStreamReader isr = new InputStreamReader(
                    new FileInputStream(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_io/io_bio/test.txt")
            );
            osw.write("java");
            System.out.println(osw.getEncoding());
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
