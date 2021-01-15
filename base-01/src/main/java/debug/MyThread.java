package debug;

import java.util.concurrent.TimeUnit;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + "-------------进入");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(currentThread.getName() + "-------------离开");
        }
    }
}
