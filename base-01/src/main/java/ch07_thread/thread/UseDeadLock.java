package ch07_thread.thread;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/22 时间:8:23
 * @JDK 1.8
 * @Description 功能模块：线程死锁案例+内存图
 * 解决死锁的方法：加粗锁的粒度
 */
public class UseDeadLock implements Runnable {

    public static void main(String[] args) {
        UseDeadLock dt01 = new UseDeadLock();
        UseDeadLock dt02 = new UseDeadLock();
        dt01.flag = 1;
        dt02.flag = 0;
        Thread t01 = new Thread(dt01);
        Thread t02 = new Thread(dt02);
        t01.start();
        t02.start();
    }

    private int flag = 1;
    private static Object o1 = new Object();
    private static Object o2 = new Object();

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
