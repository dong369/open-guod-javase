package ch07_thread.thread;

/**
 * 一个方法同步了，另一个方法没有同步，别的线程可以自由访问不同步的方法，可能对同步方法造成影响
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class TT01 implements Runnable {

    public static void main(String[] args) throws Exception {
        TT01 tt = new TT01();
        Thread t = new Thread(tt);
        t.start();
        Thread.sleep(1000);
        // 可以访问没有锁定的方法
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

    private int b = 100;

    private synchronized void m01() throws Exception {
        b = 1000;
        Thread.sleep(5000);
        System.out.println("b的值：" + b);
    }

    // 只是读取b的值而不是修改，不加synchronized
    private void m02() {
        System.out.println(b);
    }
}
