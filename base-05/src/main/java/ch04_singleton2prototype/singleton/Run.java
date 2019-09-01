package ch04_singleton2prototype.singleton;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:10:15
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Run implements Runnable {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "-->" + instance);
    }
}
