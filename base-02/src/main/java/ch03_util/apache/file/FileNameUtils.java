package ch03_util.apache.file;

import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class FileNameUtils {
    File file = new File("f:a/b/c/d.txt");
    String fileName = "d:/dev/soft/test.txt";

    @Test
    public void fileName() {
        // 返回文件后缀名
        System.out.println(FilenameUtils.getExtension(file.toString()));
        // 返回文件名，不包含后缀名
        System.out.println(FilenameUtils.getBaseName(file.toString()));
        // 返回文件名，包含后缀名
        System.out.println(FilenameUtils.getName(file.toString()));
        // 获取文件的路径（不带文件名）
        System.out.println(FilenameUtils.getFullPath(file.toString()));
        // 路径分隔符改成unix系统格式的，即/
        System.out.println(FilenameUtils.separatorsToUnix(file.toString()));
        // 检查文件后缀名是不是传入参数(List<String>)中的一个
        System.out.println(FilenameUtils.isExtension("txt", new ArrayList<>()));
    }
}
