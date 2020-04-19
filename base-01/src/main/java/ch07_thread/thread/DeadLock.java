package ch07_thread.thread;

/**
 * 线程死锁案例+内存图
 * 解决死锁的方法：加粗锁的粒度
 *
 * @author guod
 * @version 1.0
 */
public class DeadLock implements Runnable {

    private int flag = 1;

    public static void main(String[] args) {
        DeadLock dt01 = new DeadLock();
        dt01.flag = 1;

        DeadLock dt02 = new DeadLock();
        dt02.flag = 0;

        Thread t01 = new Thread(dt01);
        Thread t02 = new Thread(dt02);
        t01.start();
        t02.start();
    }

    private static final Object o1 = new Object();
    private static final Object o2 = new Object();

    @Override
    public void run() {
        System.out.println("flag=" + flag);
        if (flag == 1) {
            synchronized (o1) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println("1");
                }
            }
        }
        if (flag == 0) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println("0");
                }
            }
        }
    }
}
