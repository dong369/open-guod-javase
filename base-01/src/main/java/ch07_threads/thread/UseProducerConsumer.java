package ch07_threads.thread;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/22 时间:8:30
 * @JDK 1.8
 * @Description 功能模块：生产者--消费者问题
 * 1. 共享数据的不一致性/临界资源的保护
 * 2. Java对象锁的概念
 * 3. synchronized关键字/wait()及notify()/notifyAll()方法
 */
public class UseProducerConsumer {
    public static void main(String[] args) {
        SyncStack syncStack = new SyncStack();
        Producer producer = new Producer(syncStack);
        Consumer consumer = new Consumer(syncStack);
        // notifyAll()
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();

        new Thread(consumer).start();
    }
}

/**
 * 馒头
 */
class Wotou {
    private int id;

    public Wotou(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Wotou{" +
                "id=" + id +
                '}';
    }
}

/**
 * 馒头的筐子
 */
class SyncStack {
    int index;
    Wotou[] wotou = new Wotou[6];

    public synchronized void push(Wotou wt) {
        // 不使用if
        while (index == wotou.length) {
            try {
                // wait和sleep的区别
                // 当前线程锁定在当前对象的这个线程停止住，只有锁定住的才能wait
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // notify()叫醒一个现在正在wait再我对象上的线程，notifyAll()叫醒多个启动的线程
        this.notify();
        wotou[index] = wt;
        index++;
    }

    public synchronized Wotou pop() {
        // 不使用if
        while (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index--;
        return wotou[index];
    }
}

/**
 * 生产者
 */
class Producer implements Runnable {
    SyncStack ss;

    public Producer(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            Wotou wt = new Wotou(i);
            ss.push(wt);
            System.out.println("生产了：" + wt);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 消费者
 */
class Consumer implements Runnable {
    SyncStack ss;

    public Consumer(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            Wotou wt = ss.pop();
            System.out.println(wt);
            System.out.println("消费了：" + wt);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}