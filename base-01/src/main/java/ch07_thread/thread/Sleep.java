package ch07_thread.thread;

/**
 * sleep(休眠)
 * 在哪个线程中调用sleep方法，就让那个线程睡眠！
 * 释放CPU的抢用权，但是不释放锁
 *
 * @author guod
 * @since 1.8
 */
public class Sleep {
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
                    // 休息多少毫秒，必须try-catch，不能throws
                    // 因为重新的方法，不能抛出比被重新方法不同的异常
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("NO." + i);
        }
    }
}
