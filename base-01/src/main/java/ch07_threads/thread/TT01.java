package ch07_threads.thread;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/22 时间:13:17
 * @JDK 1.8
 * @Description 功能模块：线程的面试题
 * 一个方法同步了，另一个方法没有同步，别的线程可以自由访问不同步的方法，可能对同步方法造成影响
 */
public class TT01 implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        TT01 tt = new TT01();
        // 问题01：可以访问没有锁定的方法
        Thread t = new Thread(tt);
        t.start();
        Thread.sleep(1000);
        tt.m02();
    }

    @Override
    public void run() {
        try {
            m01();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    int b = 100;

    public synchronized void m01() throws Exception {
        b = 1000;
        Thread.sleep(5000);
        System.out.println("b的值：" + b);
    }

    // 只是读取b的值而不是修改，不加synchronized
    public void m02() {
        System.out.println(b);
    }
}
