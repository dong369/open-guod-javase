package ch07_thread.juc;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 2020/2/23
 * @since 1.8
 */
public class LockInterruptTest {
    static ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(LockInterruptTest::aa);
        Thread t2 = new Thread(LockInterruptTest::aa);
        t1.setName("t1");
        t1.start();
        Thread.sleep(2000);

        t2.setName("t2");
        t2.start();
        Thread.sleep(2000);

        System.out.println("main");
        t2.interrupt();
    }

    private static void aa() {
        String name = Thread.currentThread().getName();
        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e) {
            System.out.println("interrupt...");
            e.printStackTrace();
        }
        System.out.println(name);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }
}
