package ch04_singleton2prototype.singleton;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:15:50
 * @JDK 1.8
 * @Description 功能模块：懒汉式单例，线程不安全
 */
class LazySingleton {
    // 01构造器私有
    private LazySingleton() {
    }

    // 02静态属性对象
    private static LazySingleton car = null;

    // 03通过方法返回02的对象（静态工厂方法）
    static LazySingleton getInstance() {
        if (car == null) {
            car = new LazySingleton();
        }
        return car;
    }
}