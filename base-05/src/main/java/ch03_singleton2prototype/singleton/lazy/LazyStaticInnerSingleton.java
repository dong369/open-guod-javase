package ch03_singleton2prototype.singleton.lazy;

import java.io.Serializable;

/**
 * 静态内部类的单例模式
 *
 * @author guodd
 * @version 1.0
 */
public class LazyStaticInnerSingleton implements Serializable {
    private LazyStaticInnerSingleton() {
    }

    static class InnerClass {
        static LazyStaticInnerSingleton lazyStaticInnerSingleton = new LazyStaticInnerSingleton();
    }

    public static LazyStaticInnerSingleton getInstance() {
        return InnerClass.lazyStaticInnerSingleton;
    }
}
