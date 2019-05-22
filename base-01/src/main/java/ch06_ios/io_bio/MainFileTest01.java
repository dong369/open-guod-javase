package ch06_ios.io_bio;

import java.io.File;
import java.io.IOException;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/10 时间:17:18
 * @JDK 1.8
 * @Description 功能模块：文件操作
 */
public class MainFileTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_ios/io_bio/testFile.txt");
        // 判断是否有文件，如果没有创建
        if (file.exists()) {
            // 删除文件
            file.delete();
        } else {
            // 创建文件
            file.createNewFile();
        }
    }
}
