package ch06_ios.nio;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
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
        URI uri = new URL("http://java.sun.com/j2se/1.3/docs/guide/index.html").toURI();
        Path pathUri = Paths.get(uri);
        Path pathFile = Paths.get("D:/2.txt");
        System.out.println(pathUri.getFileName());
        System.out.println(pathFile.getFileName());
    }
}
