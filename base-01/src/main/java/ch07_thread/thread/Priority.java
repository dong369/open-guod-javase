package ch07_thread.thread;

/**
 * 线程的优先级的设置和查看：Priority
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class Priority {
    public static void main(String[] args) {
        // 主线程默认是5（范围1-10）
        System.out.println(Thread.currentThread().getPriority());
        // 设置线程级别
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());

        T901 t901 = new T901();
        Thread t01 = new Thread(t901);
        t01.setPriority(Thread.NORM_PRIORITY + 5);

        T902 t902 = new T902();
        Thread t02 = new Thread(t902);
        t01.start();
        t02.start();
    }

    static class T901 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T1：" + i);
            }
        }
    }

    static class T902 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("--------------T2：" + i);
            }
        }
    }
}

