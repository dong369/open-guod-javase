package ch06_io.nio;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The class/interface
 * Java文件IO操作应该抛弃File拥抱Paths和Files
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class PathUse {
    // Path用于来表示文件路径和文件
    // NIO.2中则引入接口Path代表与平台无关的路径，文件和目录都用Path对象表示
    @Test
    public void path() throws IOException {
        Path path = Paths.get(System.getProperty("user.dir")
                              + "/src/main/java/ch06_io/nio/nmb.doc");
        if (!Files.isExecutable(path)) {
            Files.createFile(path);
        }
        Files.delete(path);
        System.out.println(path.toAbsolutePath());
    }
}
