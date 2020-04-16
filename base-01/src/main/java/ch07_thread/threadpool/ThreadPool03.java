package ch07_thread.threadpool;

import java.util.concurrent.Executors;

/**
 * @author guodd
 * @version 1.0
 * @since JDK1.8
 */
public class ThreadPool03 {
    public static void main(String[] args) {
        Executors.newScheduledThreadPool(12);

    }
}
