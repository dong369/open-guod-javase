package debug;

/**
 * 01、断点条件设置；02、多线程调试；03、回退断点；04、
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class DebugMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前下标" + i);
        }
        MyThread myRunnable = new MyThread();
        Thread thread1 = new Thread(myRunnable, "线程1");
        Thread thread2 = new Thread(myRunnable, "线程2");
        Thread thread3 = new Thread(myRunnable, "线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
