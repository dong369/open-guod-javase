package ch03_singleton2prototype.singleton.thread;


import ch03_singleton2prototype.singleton.lazy.LazySingleton;

/**
 * @author guodd
 * @version 1.0
 */
public class ThreadRun implements Runnable {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "-->" + instance);
    }
}
