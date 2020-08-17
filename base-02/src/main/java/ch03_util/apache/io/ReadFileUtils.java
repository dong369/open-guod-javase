package ch03_util.apache.io;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class ReadFileUtils {
    Charset charset = StandardCharsets.UTF_8;
    File file = new File("d:/dev/test.txt");

    @Test
    public void readFile() throws Exception {
        List<String> strings = FileUtils.readLines(file, charset);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
