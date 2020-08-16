package ch03_singleton2prototype.singleton.expansion;

import ch03_singleton2prototype.singleton.hungry.HungrySingleton;

import java.io.*;

/**
 * 序列号破坏
 *
 * @author guodd
 * @version 1.0
 */
public class SerializableMain {
    public static void main(String[] args) throws Exception {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(System.getProperty("user.dir"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("test")));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("test")));
        HungrySingleton serializableObj = (HungrySingleton) ois.readObject();
        System.out.println(serializableObj == instance);
    }
}
