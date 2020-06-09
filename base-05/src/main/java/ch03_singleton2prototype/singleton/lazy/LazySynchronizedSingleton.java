package ch03_singleton2prototype.singleton.lazy;

import java.io.Serializable;

/**
 * 懒汉式单例，synchronized实现线程安全。
 *
 * @author guod
 * @version 1.0
 */
class LazySynchronizedSingleton implements Serializable {

    // 01静态属性对象
    private static LazySynchronizedSingleton car = null;

    // 02构造器私有
    private LazySynchronizedSingleton() {
    }

    // 03通过方法返回02的对象（静态工厂方法）
    static synchronized LazySynchronizedSingleton getInstance() {
        if (car == null) {
            car = new LazySynchronizedSingleton();
            // 01分配内存给对象
            // 02初始化对象
            // 03设置instance指向分配好的内存空间
            // 04访问对象
        }
        return car;
    }
}