package datastructure.ch05_queues.ch01_queue_base;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/2 时间:15:50
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainMyQueueTest {
    public static void main(String[] args) {

        MyCycleQueue cycleQueue = new MyCycleQueue(4);
        cycleQueue.insert(1);
        cycleQueue.insert(2);
        cycleQueue.insert(3);
        cycleQueue.insert(4);

        System.out.println(cycleQueue.isEmpty());
        System.out.println(cycleQueue.isFull());

        while (!cycleQueue.isEmpty()) {
            System.out.println(cycleQueue.remove() + " ");
        }

    }
}
