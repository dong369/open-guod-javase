package ch07_thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Project -
 *
 * @Create by guodd
 * @Version 1.0
 * @Date 日期:2019/1/3 时间:14:50
 * @JDK 1.8
 * @Description
 */
public class ThreadPool01 {
    public static void main(String[] args) {
        // 创建一个线程池
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(() -> System.out.println("java"));
    }
}
