package ch07_thread.thread;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/22 时间:8:08
 * @JDK 1.8
 * @Description 功能模块：线程的优先级的设置和查看：Priority
 */
public class PriorityThread {
    public static void main(String[] args) {
        // 主线程默认是5（范围1-10）
        System.out.println(Thread.currentThread().getPriority());
        // 设置线程级别
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());

        T901 t901 = new T901();
        Thread t01 = new Thread(t901);
        t01.setPriority(Thread.NORM_PRIORITY + 4);

        T902 t902 = new T902();
        Thread t02 = new Thread(t902);
        t01.start();
        t02.start();
    }
}

class T901 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("T1：" + i);
        }
    }
}

class T902 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("--------------T2：" + i);
        }
    }
}