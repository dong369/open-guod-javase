package ch06_io.file;

import java.io.File;
import java.io.IOException;

/**
 * 文件操作
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/10 时间:17:18
 * @since 1.8
 */
public class File01 {
    public static void main(String[] args) throws IOException {
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
        File file = new File(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_ios/io_bio/testFile.txt");
        // 判断是否有文件，如果没有创建
        if (file.exists()) {
            // 删除文件
            boolean delete = file.delete();
        } else {
            // 创建文件
            boolean newFile = file.createNewFile();
        }
    }
}
