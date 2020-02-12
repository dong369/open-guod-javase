package ch07_thread.threadpool;

import java.util.concurrent.Executors;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:14:50
 * @since JDK1.8
 */
public class ThreadPool03 {
    public static void main(String[] args) {
        Executors.newScheduledThreadPool(12);

    }
}
