package ch06_io.io_bio;

import java.io.*;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/10 时间:16:01
 * @JDK 1.8
 * @Description 功能模块：对象流，直接把对象写入或读出。成为序列化，需要时效性Serializable接口。
 * Serializable属于[标记性接口]，标记类可以被序列化；Externalizable接口，序列化规则。
 */
public class ObjectIoTest {
    public static void main(String[] args) {
        T t = new T();
        try {
            ObjectOutputStream dataOutputStream = new ObjectOutputStream(
                    new FileOutputStream(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_io/io_bio/useObject.dat")
            );
            dataOutputStream.writeObject(t);
            dataOutputStream.flush();
            dataOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_io/io_bio/useObject.dat")
            );
            T ts = (T) objectInputStream.readObject();
            System.out.println(ts.k);
            System.out.println(ts.d);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// Serializable标记型接口
class T implements Serializable {
    int i = 10;
    int j = 9;
    double d = 2.3;
    /**
     * 属性不会被序列化：transient
     */
    transient int k = 25;
}
