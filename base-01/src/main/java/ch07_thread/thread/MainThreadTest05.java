package ch07_thread.thread;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/21 时间:13:52
 * @JDK 1.8
 * @Description 功能模块：sleep(休眠)
 */
public class MainThreadTest05 {
    public static void main(String[] args) {
        T5 t5 = new T5();
        Thread t = new Thread(t5);
        t.start();
    }
}

class T5 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            if (i % 10 == 0 && i != 0) {
                try {
                    // 休息多少毫秒
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("NO." + i);
        }
    }
}
