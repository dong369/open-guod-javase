package ch06_io.file;

import java.io.File;
import java.io.IOException;

/**
 * @author guod
 * @version 1.0
 */
public class File02 {
    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_io/file/testFile.txt");
        // 判断是否有文件夹，如果没有创建
        if (!file.getParentFile().exists()) {
            boolean mkdirs = file.getParentFile().mkdirs();
        }
        // 判断是否有文件，如果没有创建
        if (file.exists()) {
            boolean delete = file.delete();
        } else {
            boolean newFile = file.createNewFile();
        }
    }
}
