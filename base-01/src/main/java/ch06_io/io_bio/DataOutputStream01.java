package ch06_io.io_bio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * 数据流（把long类型的数写入到文件）
 *
 * @author guodd
 * @version 3.0
 * @since 1.8
 */
public class DataOutputStream01 {
    public static void main(String[] args) throws Exception {
        Long a = 1219498749764198499L;
        String s = String.valueOf(a);
        char[] chars = s.toCharArray();
        System.out.println(chars.length);
        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_io/io_bio/useData.txt")
        );
        dos.writeLong(455);
        dos.close();
    }
}
