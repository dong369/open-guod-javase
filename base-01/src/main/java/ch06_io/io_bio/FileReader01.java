package ch06_io.io_bio;

import java.io.*;

/**
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class FileReader01 {
    public static void main(String[] args) {
        int c;
        Reader reader;
        try {
            reader = new FileReader(
                    new File(System.getProperty("user.dir")
                             + "/base-01/src/main/java/ch06_io/io_bio/FileReaderTest.java"));
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
