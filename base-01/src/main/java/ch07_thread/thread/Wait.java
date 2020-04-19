package ch07_thread.thread;

/**
 * wait主要的作用是线程通信。
 * 让持有该对象锁的线程等待；wait方法则必须放在synchronized块里面；
 * wait还需要额外的方法 notify/notifyAll 进行唤醒，它们同样需要
 * 放在synchronized块里面，且获取对象的锁。
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class Wait {
    public static void main(String[] args) {
        Object lock = new Object();
        // 线程01
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i);
                    if (i == 10) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        // 线程02
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.notifyAll();
                System.out.println("notify/notifyAll进行唤醒");
            }
        });
        t1.start();
        t2.start();
    }
}