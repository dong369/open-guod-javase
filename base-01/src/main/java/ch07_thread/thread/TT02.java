package ch07_thread.thread;

/**
 * 线程的面试题
 *
 * @author guod
 * @version 1.0
 * 一个方法同步了，另一个方法没有同步，别的线程可以自由访问不同步的方法，可能对同步方法造成影响
 */
public class TT02 implements Runnable {

    public static void main(String[] args) throws Exception {
        TT02 tt = new TT02();
        Thread t = new Thread(tt);
        t.start();
        tt.m02();
        System.out.println(tt.b);
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

    public void m02() throws Exception {
        Thread.sleep(2500);
        b = 2000;
    }
}
