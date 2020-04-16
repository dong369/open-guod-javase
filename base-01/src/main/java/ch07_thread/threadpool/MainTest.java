package ch07_thread.threadpool;

import java.util.concurrent.*;

/**
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class MainTest {
    public static void main(String[] args) {
        //核心线程数；最大线程数；线程空闲时间存活时间；存活时间的单位；任务队列；线程产生的工厂
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3,
                5,
                5,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                Executors.defaultThreadFactory());
        executor.submit(new Thread(() -> System.out.println("java")));
    }
}
