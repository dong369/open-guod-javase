package ch07_thread.threadpool;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/12/2 时间:12:12
 * @JDK 1.8
 * @Description 功能模块：
 */
public class ThreadPoolTestMain01 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(60);
        es.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        List<Runnable> runnable = es.shutdownNow();
        System.out.println(runnable.size());
    }
}
