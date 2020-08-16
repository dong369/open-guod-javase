package ch03_singleton2prototype.singleton.lazy;

import org.junit.Test;

/**
 * The class/interface 单例模式-创建模式
 * 保证一个类仅有一个实例，并提供一个全局访问点
 * 在内存里只有一个实例，減少了内存开销
 * 可以避免对资源的多重占用
 * 设置全局访问点，严格控制访问
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class TestMain {
    @Test
    public void lazySingle() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance);
    }

    public static void main(String[] args) {
        new Thread(new ThreadSingleton()).start();
        new Thread(new ThreadSingleton()).start();
    }

    @Test
    public void lazySingleThread() {

    }

    @Test
    public void test() {
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
    }
}
