package ch07_thread.thread;

/**
 * synchronized关键字是多个线程之间访问资源的同步性，保证了代码块任意时刻只能有一个线程执行
 * JDK 1.6之前synchronized是重量级锁，效率低下，因为监视器锁（monitor lock）依赖底层操作系统
 * JDK 1.6对锁的实现引入了大量的优化，如自旋锁、适应性自旋锁、锁消除、锁粗化、偏向锁、轻量级锁等技术来减少锁操作的开销。
 * synchronized锁定当前对象（this）当执行方法的过程中，当前对象被锁定+内存图分析
 *
 * @author guod
 * @since 1.8
 */
public class Synchronized01 implements Runnable {

    private final T100 t10 = new T100();

    public static void main(String[] args) {
        Synchronized01 mainThread = new Synchronized01();
        // 两个线程都访问同一个对象mainThread
        Thread t01 = new Thread(mainThread);
        Thread t02 = new Thread(mainThread);
        t01.setName("线程01：");
        t02.setName("线程02：");
        t01.start();
        t02.start();
    }

    @Override
    public void run() {
        t10.add(Thread.currentThread().getName());
    }
}

class T100 {
    private static int num = 0;

    void add(String name) {
        // ++num、num++此处实际是三步操作：栈中取出num、num自增1、将i存到栈，并不是原子性操作
        ++num;
        try {
            // 原子性，中间不能被打断
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + ", 你是第" + num + "个使用timer的线程");
    }
}
