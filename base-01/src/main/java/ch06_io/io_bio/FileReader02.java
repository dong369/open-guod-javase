package ch06_io.io_bio;

import java.io.File;
import java.io.FileReader;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class FileReader02 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader(new File(System.getProperty("user.dir")
                                                + "\\java\\ch06_io\\io_bio\\FileReader02.java"));
    }
}
