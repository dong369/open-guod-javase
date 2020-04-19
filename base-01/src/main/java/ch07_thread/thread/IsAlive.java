package ch07_thread.thread;

/**
 * The class/interface 线程是否存活
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class IsAlive {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isAlive());
    }
}
