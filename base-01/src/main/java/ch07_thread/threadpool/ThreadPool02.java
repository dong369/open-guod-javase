package ch07_thread.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 通过ThreadPoolExecutor的方式，这样的处理方式让写的同学更加明确线程池的运行规则，规避资源耗尽的风险。
 * <p>
 * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class ThreadPool02 {
    public static void main(String[] args) {
        // 核心线程数；最大线程数；线程空闲时间存活时间；存活时间；任务队列；线程产生的工厂
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3,
                5,
                5,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                Executors.defaultThreadFactory());
        executor.submit(new Thread(() -> System.out.println("java")));
    }
}
