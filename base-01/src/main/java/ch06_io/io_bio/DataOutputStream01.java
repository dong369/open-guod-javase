package ch06_io.io_bio;

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
 * @Description 功能模块：数据流（把long类型的数写入到文件）
 */
public class DataOutputStream01 {
    public static void main(String[] args) {
        Long a = 1219498749764198499L;
        String s = String.valueOf(a);
        char[] chars = s.toCharArray();
        System.out.println(chars.length);
        try {
            DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_io/io_bio/useData.txt")
            );
            dos.writeLong(455);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
