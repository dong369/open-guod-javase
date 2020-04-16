package ch07_thread.threadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class ThreadPool {
    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1,
                10, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(new Task("0"));
        Thread.sleep(1);
        executor.shutdown();
        System.out.println("executor has been shutdown");
    }

    static class Task implements Runnable {
        String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 100 && !Thread.interrupted(); i++) {
                Thread.yield();
                System.out.println("task " + name + " is running, round " + i);
            }
        }
    }
}
