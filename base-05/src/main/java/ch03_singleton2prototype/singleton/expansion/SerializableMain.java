package ch03_singleton2prototype.singleton.expansion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 序列号破坏
 *
 * @author guodd
 * @version 1.0
 */
public class SerializableMain {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("")));
    }
}
