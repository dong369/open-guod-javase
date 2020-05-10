package ch06_io.file;

import org.springframework.util.Assert;

import java.io.File;

/**
 * 文件的目录遍历
 *
 * @author guodd
 * @version 3.0
 * @since 1.8
 */
public class File03 {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir") + "/base-01/");
        System.out.println(file.getName());
        tree(file, 1);
    }

    private static void tree(File file, int level) {
        StringBuilder preStr = new StringBuilder();
        for (int i = 0; i < level; i++) {
            preStr.append("---");
        }
        File[] files = file.listFiles();
        Assert.notNull(files, "文件是空！");
        for (File file1 : files) {
            System.out.println(preStr + file1.getName());
            if (file1.isDirectory()) {
                tree(file1, level + 1);
            }
        }
    }
}
