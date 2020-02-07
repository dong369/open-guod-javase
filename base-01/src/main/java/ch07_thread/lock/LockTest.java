package ch07_thread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * description - {@link ReentrantLock}
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:14:50
 * @since JDK1.8
 */
public class LockTest {
    // 公平锁（true）& 非公平锁
    static ReentrantLock reentrantLock = new ReentrantLock(true);

    public static void main(String[] args) {
        Thread thread01 = new Thread(LockTest::aa);
        Thread thread02 = new Thread(LockTest::aa);

        thread01.start();
        thread02.start();
    }

    public static void aa() {
        // synchronized (){}
        reentrantLock.lock();
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }
}
