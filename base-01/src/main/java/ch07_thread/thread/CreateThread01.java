package ch07_thread.thread;

/**
 * 应用程序：QQ.exe、迅雷.exe
 * 进程：运行时（runtime）的应用程序，进程是系统分配资源的最小单位，内存不共享，使用socket通讯，一个在内存中运行的应用程序，是一个静态的概念。（切换目录以使用新的地址空间；切换内核栈；切换硬件上下文）
 * 线程：一个程序的不同执行路径，进程内[并发]执行的代码块，可以提高CPU的利用率，内存共享，每个线程对应一个stack，创建灵活响应的桌面程序，是CPU调度的最小单位（切换内核栈；切换硬件上下文）
 * 协程：协程是属于线程的，协程程序是在线程里面跑的，因此协程又称微线程和纤程等；协程的调度切换是用户(程序员)手动切换；用户调度无需考虑原子操作锁。
 * <p>
 * 1s = 1000ms
 * 1ms = 1000μs
 * 1μs = 1000ns
 * <p>
 * 并发：两队一个窗口；并行：两队两个窗口、串行：一队一个窗口（单核、多核）
 * 指定单核执行：start /affinity 0x1 java CreateThread01
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class CreateThread01 {
    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        // 设置守护线程
        // t01.setDaemon(true);
        // 该方法启动线程是方法的调用，需要使用start启动线程
        // t01.run();
        t1.start();
        t2.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程：" + i);
        }
    }

    static class T extends Thread {
        @Override
        public void run() {
            // 死循环会导致栈的内存溢出，递归会造成栈的内存溢出
            for (int i = 0; i < 1000; i++) {
                System.out.println("副线程：" + i);
            }
        }
    }
}

