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

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    public ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }
}
