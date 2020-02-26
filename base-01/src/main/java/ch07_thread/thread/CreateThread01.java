package ch07_thread.thread;

/**
 * 多线程（一个程序的不同执行路径）,通过继承Thread类型实现线程
 * 进程：进程是系统分配资源的最小单位（切换页目录以使用新的地址空间；切换内核栈；切换硬件上下文）
 * 线程：线程是CPU调度的最小单位（切换内核栈；切换硬件上下文）
 * 协程：协程是属于线程的。协程程序是在线程里面跑的，因此协程又称微线程和纤程等；协程的调度切换是用户(程序员)手动切换；用户调度无需考虑原子操作锁
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