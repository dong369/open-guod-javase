package ch07_thread.thread;

/**
 * yield高风亮节的让出一次CPU，当i/10取余让出CPU
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class Yield {
    public static void main(String[] args) {
        T8 t01 = new T8("线程01：");
        T8 t02 = new T8("线程02：");
        t01.start();
        t02.start();
    }
}

class T8 extends Thread {
    T8(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + i);
            if (i % 10 == 0) {
                Thread.yield();
            }
        }
    }
}
