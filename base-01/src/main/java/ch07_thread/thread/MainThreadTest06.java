package ch07_thread.thread;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/21 时间:13:57
 * @JDK 1.8
 * @Description 功能模块：线程的停止的方法
 */
public class MainThreadTest06 {
    public static void main(String[] args) {
        T6 t6 = new T6();
        Thread t = new Thread(t6);
        t.start();
        for (int i = 0; i < 100000; i++) {
            if (i % 10000 == 0 & i > 0) {
                System.out.println("in thread main i=" + i);
            }
        }
        System.out.println("Thread main is over");
        // t.stop();
        t6.shutDown();
    }
}

class T6 implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.print(" " + i++);
        }
    }

    public void shutDown() {
        flag = false;
    }
}
