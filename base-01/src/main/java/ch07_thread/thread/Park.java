package ch07_thread.thread;

import sun.misc.Unsafe;

import java.util.concurrent.locks.LockSupport;

/**
 * park使线程阻塞
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:14:50
 * @since JDK1.8
 */
public class Park {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(Park::testPark);
        t1.start();
        Thread.sleep(10000);
        System.out.println("main...");
        LockSupport.unpark(t1);
    }

    public static void testPark() {
        System.out.println("执行...");
        // LockSupport只是封装了park，并不是提供park的类
        // Unsafe才是真正park的提供者
        LockSupport.park();
        System.out.println("结束...");
    }
}
