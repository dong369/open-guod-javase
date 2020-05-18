package ch07_thread.thread;

/**
 * Fork/Join是什么？join线程合并，类似方法调用，线程执行完毕后，再执行主线程。
 * 当前线程等待指定线程结束后才继续执行
 *
 * @author guod
 * @version 1.0
 */
public class Join {
    public static void main(String[] args) {
        T7 t7 = new T7();
        Thread t = new Thread(t7);
        t.start();
        try {
            // 类似方法调用，子线程执行完毕后才会往后执行
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("主线程:" + i);
        }
    }
}

class T7 implements Runnable {
    @Override
    public void run() {
        // 拿到当前线程
        System.out.println(Thread.currentThread().isAlive());
        for (int i = 0; i < 100; i++) {
            System.out.println("SubThread: " + i);
        }
    }
}