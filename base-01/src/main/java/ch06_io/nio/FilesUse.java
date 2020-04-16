package ch06_io.nio;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class FilesUse {
    @Test
    public void file() throws IOException {
        Files.delete(Paths.get("d:/test/java.txt"));
    }
}
