package ch06_io.io_bio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/10 时间:15:19
 * @JDK 1.8
 * @Description 功能模块：转换流
 */
public class MainTransFormTest01 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(System.getProperty("user.dir") + "/base-01/src/main/java/ch07/test01.txt"));
            osw.write("java");
            System.out.println(osw.getEncoding());
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
