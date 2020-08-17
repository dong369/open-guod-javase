package ch03_util.apache.io;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class WriteFileUtils {
    Charset charset = StandardCharsets.UTF_8;
    File file = new File("d:/dev/test.txt");

    @Test
    public void writeFile() throws Exception {
        FileUtils.write(file, "java", charset, true);
    }
}
