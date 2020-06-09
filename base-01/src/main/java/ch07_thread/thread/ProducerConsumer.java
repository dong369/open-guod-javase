package ch07_thread.thread;

/**
 * 生产者--消费者问题
 * 1. 共享数据的不一致性/临界资源的保护
 * 2. Java对象锁的概念
 * 3. synchronized关键字/wait()及notify()/notifyAll()方法
 *
 * @author guod
 * @since 1.8
 * 应用场景：Java实现生产者消费者的方式。
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        // 筐子
        SyncStack syncStack = new SyncStack();

        // 生产者
        Producer producer = new Producer(syncStack);

        // 消费者
        Consumer consumer = new Consumer(syncStack);

        // notifyAll()
        new Thread(producer).start();
        new Thread(producer).start();

        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}

/**
 * 馒头
 */
class WoTou {
    int id;

    public WoTou(int id) {
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
    WoTou[] woTou = new WoTou[2];

    public synchronized void push(WoTou wt) {
        // 不使用if
        while (index == woTou.length) {
            try {
                // wait和sleep的区别
                // 当前线程锁定在当前对象的这个线程停止住，只有锁定住的才能wait，后面的代码 不会再运行
                // wait/notify/notifyAll都是只能在synchronize代码块中使用
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // notify()叫醒一个现在正在wait在我对象上的线程，notifyAll()叫醒多个启动的线程
        this.notify();
        woTou[index] = wt;
        index++;
    }

    public synchronized WoTou pop() {
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
        return woTou[index];
    }
}

/**
 * 生产者
 */
class Producer implements Runnable {
    /**
     * 属性描述：名称
     */
    private String name;

    SyncStack ss;

    public Producer(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            WoTou wt = new WoTou(i);
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
    /**
     * 属性描述：名称
     */
    private String name;

    SyncStack ss;

    public Consumer(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            WoTou wt = ss.pop();
            // System.out.println(wt);
            System.out.println("消费了：" + wt);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}