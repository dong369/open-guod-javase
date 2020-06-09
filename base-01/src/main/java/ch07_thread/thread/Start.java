package ch07_thread.thread;

/**
 * 同时启动多个线程
 *
 * @author guod
 * @since 1.8
 */
public class Start {
    public static void main(String[] args) {
        // 声明线程
        T t4 = new T();
        Thread t01 = new Thread(t4, "线程01");
        Thread t02 = new Thread(t4, "线程02");
        // 开启两个线程
        t01.start();
        t02.start();
    }

    static class T implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 30; i++) {
                System.out.println(Thread.currentThread().getName() + "：=No." + i);
            }
        }
    }
}