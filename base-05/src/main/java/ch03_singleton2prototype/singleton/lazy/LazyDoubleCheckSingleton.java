package ch03_singleton2prototype.singleton.lazy;

import java.io.Serializable;

/**
 * 懒汉式单例，双重检查，线程安全。
 *
 * @author guod
 * @version 1.0
 */
class LazyDoubleCheckSingleton implements Serializable {
    // 01、静态属性对象
    private volatile static LazyDoubleCheckSingleton car = null;

    // 02、构造器私有
    private LazyDoubleCheckSingleton() {
    }

    // 03、通过方法返回02的对象（静态工厂方法）
    static LazyDoubleCheckSingleton getInstance() {
        if (car == null) {
            // 重排序问题 intra-thread semantics
            // 解决方式：volatile，保证了有序性
            synchronized (LazyDoubleCheckSingleton.class) {
                if (car == null) {
                    car = new LazyDoubleCheckSingleton();
                    // 01、分配内存给对象
                    // 02、初始化对象
                    // 03、设置instance指向分配好的内存空间
                    // 04、初次访问对象
                }
            }
        }
        return car;
    }
}