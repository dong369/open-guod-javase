package ch07_thread.threadpool;

import org.junit.Test;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 * 了解即可，线程池不允许使用Executors去创建，允许的请求队列长度为Integer.MAX_VALUE，可能会堆积大量的请求，从而导致OOM。
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class ThreadPool01 {
    @Test
    public void cacheThreadPool() {
        // 创建一个线程池
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(() -> System.out.println("java"));
        es.shutdown();
    }

    @Test
    public void fixedThreadPool() {
        ExecutorService es = Executors.newFixedThreadPool(60);
        es.execute(() -> System.out.println("java"));
        es.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        List<Runnable> runnable = es.shutdownNow();
        System.out.println(runnable.size());
    }

    public static void main(String[] args) {
        Executors.newScheduledThreadPool(12);
    }
}
