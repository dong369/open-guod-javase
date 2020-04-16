package ch07_thread.threadpool;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class ThreadPool02 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(60);
        // es.execute(() -> System.out.println("java"));
        es.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        List<Runnable> runnable = es.shutdownNow();
        System.out.println(runnable.size());
    }
}
