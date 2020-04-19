package ch06_io.io_bio;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * 随机流
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class RandomIo01 {
    public static void main(String[] args) {
        try {
            RandomAccessFile rf = new RandomAccessFile("", "rwx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
