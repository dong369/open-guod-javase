package ch07_thread.thread;

/**
 * 多线程（一个程序的不同执行路径）,通过继承Thread类型实现线程
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/11 时间:11:14
 * @since 1.8
 */
public class CreateThread01 {
    public static void main(String[] args) {
        T01 t01 = new T01();
        // t01.run(); 该方法启动线程是方法的调用
        t01.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程：" + i);
        }
    }
}

class T01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程：" + i);
        }
    }

}