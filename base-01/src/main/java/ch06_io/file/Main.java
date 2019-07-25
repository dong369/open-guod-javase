package ch06_io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/21 时间:18:02
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args) {
        byte[] b = new byte[11];
        File f = new File(System.getProperty("user.dir") + "\\base-01\\src\\main\\java\\ch06_io\\file\\test.txt");
        try {
            InputStream os = new FileInputStream(f);
            while ((os.read(b)) != -1) {
                System.out.println(new String(b));
            }
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
