package ch06_io.file;

import java.io.File;
import java.io.IOException;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/10 时间:17:18
 * @JDK 1.8
 * @Description 功能模块：文件的目录遍历
 */
public class FileTest03 {
    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir") + "/base-01/");
        System.out.println(file.getName());
        tree(file, 1);
    }

    private static void tree(File file, int level) {
        String preStr = "";
        for (int i = 0; i < level; i++) {
            preStr += "   ";
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(preStr + file1.getName());
            if (file1.isDirectory()) {
                tree(file1, level + 1);
            }
        }
    }
}
