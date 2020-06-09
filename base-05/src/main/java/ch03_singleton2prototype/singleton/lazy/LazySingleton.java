package ch03_singleton2prototype.singleton.lazy;

import java.io.Serializable;

/**
 * 懒汉式单例，线程不安全
 *
 * @author guod
 * @version 1.0
 */
public class LazySingleton implements Serializable {
    // 01构造器私有
    private LazySingleton() {
    }

    // 02静态属性对象
    private static LazySingleton car = null;

    // 03通过方法返回02的对象（静态工厂方法）
    public static LazySingleton getInstance() {
        if (car == null) {
            car = new LazySingleton();
        }
        return car;
    }
}