package ch07_thread.thread;

/**
 * The class/interface 程序有几条执行路径
 * 并发压力测试工具：jMeter（界面方式推荐使用）、apache ap（命令方式）
 * 同步（synchronous）：一旦调用需要等待方法执行完成
 * 异步（asynchronous）：
 * <p>
 * 并发：
 * 并行：
 * 串行：
 * <p>
 * 阻塞：
 * 非阻塞：
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class AMain {
    // main方法是主线程
    public static void main(String[] args) {
        System.out.println("main");
        t1();
    }

    public static void t1() {
        System.out.println("t1");
        t2();
        t3();
    }

    public static void t2() {
        System.out.println("t2");
    }

    public static void t3() {
        System.out.println("t3");
    }
}
