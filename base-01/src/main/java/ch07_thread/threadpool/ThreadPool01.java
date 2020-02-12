package ch07_thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/28 时间:14:08
 * @since 1.8
 */
public class ThreadPool01 {
    public static void main(String[] args) {
        // 创建一个线程池
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(() -> System.out.println("java"));
        es.shutdown();
    }
}
