package ch04_singleton2prototype.singleton;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:15:50
 * @JDK 1.8
 * @Description 功能模块：懒汉式单例，synchronized实现线程安全。
 */
class LazySynchronizedSingleton {

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