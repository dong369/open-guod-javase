package ch07_thread.thread;

/**
 * 线程的停止的方法
 *
 * @author guod
 * @date 日期:2018/6/21 时间:13:57
 * @since 1.8
 */
public class StopThread {
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
        // t.interrupt();
        // t.stop();  已经废弃
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
