package ch07_thread.thread;

/**
 * 同时启动多个线程
 *
 * @author guod
 * @date 日期:2018/6/20 时间:14:03
 * @since 1.8
 */
public class StartThreads {
    public static void main(String[] args) {
        // 声明线程
        T4 t4 = new T4();
        Thread t01 = new Thread(t4, "线程01");
        Thread t02 = new Thread(t4, "线程02");
        // 开启两个线程
        t01.start();
        t02.start();
    }
}

class T4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + "：=No." + i);
        }
    }
}
