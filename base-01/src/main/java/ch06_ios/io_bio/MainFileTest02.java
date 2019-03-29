package ch06_ios.io_bio;

import java.io.File;
import java.io.IOException;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/11 时间:11:00
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainFileTest02 {
    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir") + "/base-01/src/main/java/ch06/bio/testFile.txt");
        // 判断是否有文件夹，如果没有创建
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        // 判断是否有文件，如果没有创建
        if (file.exists()) {
            file.delete();
        } else {
            file.createNewFile();
        }
    }
}
