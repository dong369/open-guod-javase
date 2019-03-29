package ch06_ios.io_bio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/10 时间:15:19
 * @JDK 1.8
 * @Description 功能模块：数据流
 */
public class MainDataOutputStreamTest {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(System.getProperty("user.dir")+"/base-01/src/main/java/ch06_ios/io_bio/data.txt"));
            dos.writeLong(455L);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
