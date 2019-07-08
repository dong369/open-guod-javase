package ch07_thread.thread;

/**
 * project - 多线程（一个程序的不同执行路径）
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/11 时间:11:09
 * @JDK 1.8
 * @Description 功能模块：通过实现Runnable接口实现线程
 */
public class MainThreadTest02 {
    public static void main(String[] args) {
        T02 t02 = new T02();
        Thread t = new Thread(t02);
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程：" + i);
        }
    }
}

class T02 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程：" + i);
        }
    }
}
