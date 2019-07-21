package ch06_io.io_bio;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/20 时间:22:33
 * @JDK 1.8
 * @Description 功能模块：
 */
public class RandomTest01 {
    public static void main(String[] args) {
        try {
            RandomAccessFile rf = new RandomAccessFile("","rwx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
