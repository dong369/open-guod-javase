package ch04_singleton2prototype.singleton;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:11:01
 * @JDK 1.8
 * @Description 功能模块：静态内部类的单例模式
 */
public class LazyStaticInnerSingleton {
    private LazyStaticInnerSingleton() {
    }

    private static class InnerClass {
        private static LazyStaticInnerSingleton lazyStaticInnerSingleton = new LazyStaticInnerSingleton();
    }

    public static LazyStaticInnerSingleton getInstance() {
        return InnerClass.lazyStaticInnerSingleton;
    }
}
