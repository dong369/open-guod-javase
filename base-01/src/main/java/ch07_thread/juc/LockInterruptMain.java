package ch07_thread.juc;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class LockInterruptMain {

    static ReentrantLock lock = new ReentrantLock(true);

    @Test
    public void main() throws InterruptedException {
        Thread t1 = new Thread(LockInterruptMain::aa);
        Thread t2 = new Thread(LockInterruptMain::aa);
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
