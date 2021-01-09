package ch06_io.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 文件操作
 *
 * @author guodd
 * @version 3.0
 * @since 1.8
 */
public class File01 {
    // 文件->删除、创建
    // System.getProperty("user.dir")项目根文件夹
    @Test
    public void base() throws IOException {
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
        File file = new File(System.getProperty("user.dir")
                + "/src/main/java/ch06_io/file/aa/testFile.txt");
        // 判断是否有文件，如果没有创建
        if (file.exists()) {
            // 删除文件
            boolean delete = file.delete();
        } else {
            // 创建文件夹
            File parentFile = file.getParentFile();
            boolean mkdirs = parentFile.mkdirs();
            // 创建文件
            if (mkdirs) {
                boolean newFile = file.createNewFile();
            }
        }
        System.out.println(file.getAbsolutePath());
    }

    @Test
    public void fileExists() throws IOException {
        File file = new File(System.getProperty("user.dir")
                + "/src/main/java/ch06_io/file/aa/testFile02.txt");
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
