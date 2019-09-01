package ch04_singleton2prototype.singleton.expansion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:14:53
 * @JDK 1.8
 * @Description 功能模块：序列号破坏
 */
public class SerializableMain {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("")));
    }
}
