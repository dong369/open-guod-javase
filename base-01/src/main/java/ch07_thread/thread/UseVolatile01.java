package ch07_thread.thread;

/**
 * project - volatile关键字
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/27 时间:13:12
 * @JDK 1.8
 * @Description 功能模块：volatile可以看成是synchronized的一种轻量级的实现
 * 01volatile有synchronized可见性的特性，但没有synchronized原子性的特性。
 * 02volatile还能确保变量不能被重排序，保证了有序性。
 * 03如果是读操作远多于写操作的情况可以建议使用volatile，它会有更好的性能。
 */
public class UseVolatile01 {

    // 变量不存在工作线程的副本，线程每次直接都从主内存中读取，每次读取的都是最新的值，这也就保证了变量对其他线程的可见性。
    // 还能确保变量不能被重排序，保证了有序性。
    // 如果是读操作远多于写操作的情况可以建议使用volatile，它会有更好的性能。
    // 条件：
    // 1、对变量的写操作不依赖当前变量的值；
    // 2、该变量没有包含在其他变量的不变式中。
    private static boolean isStop = false;

    public static void main(String[] args) {

        new Thread01().start();

        while (!isStop) {
            System.out.println("执行中....");
        }
        System.out.println("stop");
    }

    static class Thread01 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stopIt();
        }
    }

    private static void stopIt() {
        isStop = true;
    }
}