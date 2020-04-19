package ch07_thread.thread;

/**
 * The class/interface 程序有几条执行路径
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class AMain {
    // main方法是主线程
    public static void main(String[] args) {
        t1();
    }

    public static void t1() {
        t2();
        t3();
    }

    public static void t2() {
    }

    public static void t3() {
    }
}
