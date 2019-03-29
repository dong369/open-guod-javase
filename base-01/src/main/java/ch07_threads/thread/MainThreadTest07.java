package ch07_threads.thread;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/21 时间:14:06
 * @JDK 1.8
 * @Description 功能模块：Fork/Join是什么？join线程合并，类似方法调用，线程执行完毕后，再执行主线程。
 */
public class MainThreadTest07 {
    public static void main(String[] args) {
        T7 t7 = new T7();
        Thread t = new Thread(t7);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("主线程:" + i);
        }
    }
}

class T7 implements Runnable {
    @Override
    public void run() {
        // 拿到当前线程
        System.out.println(Thread.currentThread().isAlive());
        for (int i = 0; i < 999999; i++) {
            System.out.println("SubThread: " + i);
        }
    }
}