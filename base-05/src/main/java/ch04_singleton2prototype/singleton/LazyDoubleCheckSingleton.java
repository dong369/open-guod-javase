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
class LazyDoubleCheckSingleton {

    // 01静态属性对象
    private static LazyDoubleCheckSingleton car = null;

    // 02构造器私有
    private LazyDoubleCheckSingleton() {
    }

    // 03通过方法返回02的对象（静态工厂方法）
    static LazyDoubleCheckSingleton getInstance() {
        if (car == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (car == null) {
                    car = new LazyDoubleCheckSingleton();
                    // 01分配内存给对象
                    // 02初始化对象
                    // 03设置instance指向分配好的内存空间
                    // 04访问对象
                }
            }
        }
        return car;
    }
}