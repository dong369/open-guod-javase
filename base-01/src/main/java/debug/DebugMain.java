package debug;

/**
 * project -
 *
 * @author yanfa07
 * @version 1.0
 * @date 日期:2019/3/28 时间:9:47
 * @JDK 1.8
 * @Description 功能模块：01断点条件设置、02多线程调试、03回退断点
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
