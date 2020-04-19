package ch07_thread.thread;

/**
 * synchronized锁定当前对象（this）当执行方法的过程中，当前对象被锁定+内存图分析
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class Synchronized02 implements Runnable {
    T10 t10 = new T10();

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
}

class T10 {

    private static int num = 0;

    // 执行当前方法的时候锁定当前的对象this
    synchronized void add(String name) {
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
