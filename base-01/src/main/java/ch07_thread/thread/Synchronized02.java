package ch07_thread.thread;

/**
 * synchronized锁定当前对象（this）当执行方法的过程中，当前对象被锁定+内存图分析
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class Synchronized02 implements Runnable {
    T t10 = new T();

    public static void main(String[] args) {
        Synchronized02 mainThread = new Synchronized02();
        Thread t01 = new Thread(mainThread);
        Thread t02 = new Thread(mainThread);
        t01.setName("线程01：");
        t02.setName("线程02：");
        t01.start();
        t02.start();
    }

    @Override
    public void run() {
        t10.add(Thread.currentThread().getName());
    }

    static class T {
        private static int num = 0;
        // 锁标识，这个里面的锁会产生不是一把锁的现象，需要static或者传入同一把锁
        // 对象中涉及到new的一定要考虑是不是一个对象
        static final Object lock = new Object();

        // 执行当前方法的时候锁定当前的对象this
        // static方法也可以加synchronize关键字，锁定当前类
        synchronized void add(String name) {
            synchronized (lock) {
            }
            // 同步代码块
            // 票池
            // synchronized (this) {  // 锁定当前对象（）
            num++;
            try {
                // 原子性，中间不能被打断
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + ", 你是第" + num + "个使用timer的线程");
            //}
        }
    }
}

