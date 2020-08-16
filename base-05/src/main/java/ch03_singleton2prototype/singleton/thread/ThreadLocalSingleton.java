package ch03_singleton2prototype.singleton.thread;

/**
 * The class/interface ThreadLocal单例模式
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {
    }

    private static ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }
}
