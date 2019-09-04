package ch07_thread.thread;

/**
 * project - volatile关键字
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/27 时间:13:12
 * @JDK 1.8
 * @Description 功能模块：读多写少的情况
 */
public class Volatile02 {

    private static int n = 0;

    public static void main(String[] args) {

        new Thread01().start();

        while (n < 100) {
            System.out.println("执行中...");
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
            for (int i = 0; i < 200; i++) {
                add();
            }
        }
    }

    private static synchronized void add() {
        n++;
    }
}

