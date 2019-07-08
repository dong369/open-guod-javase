package ch06_io.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/5/8 时间:13:17
 * @JDK 1.8
 * @Description 功能模块：
 */
public class UsePath {
    public static void main(String[] args) throws Exception {
        Path pathFile = Paths.get("D:/2.txt");
        System.out.println(pathFile.getFileName());
    }
}
