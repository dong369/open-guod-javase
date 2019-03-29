package datastructure.ch03_queues.ch02_array_queue;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/25 时间:9:01
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}