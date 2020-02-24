package ch07_thread.thread;

/**
 * synchronized锁定当前对象（this）当执行方法的过程中，当前对象被锁定+内存图分析
 *
 * @author guod
 * @date 日期:2018/6/22 时间:8:11
 * @since 1.8
 */
public class SynchronizedThread01 implements Runnable {

    private T100 t10 = new T100();

    public static void main(String[] args) {
        SynchronizedThread01 mainThread = new SynchronizedThread01();
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

    static int num = 0;

    void add(String name) {
        // 此处实际是三步操作：获取、加一、赋值
        num++;
        try {
            // 原子性，中间不能被打断
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + ", 你是第" + num + "个使用timer的线程");
    }
}
