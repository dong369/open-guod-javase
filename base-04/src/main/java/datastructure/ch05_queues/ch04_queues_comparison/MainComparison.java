package datastructure.ch05_queues.ch04_queues_comparison;


import datastructure.ch05_queues.ch02_array_queue.ArrayQueue;
import datastructure.ch05_queues.ch02_array_queue.Queue;
import datastructure.ch05_queues.ch03_loop_queue.LoopQueue;

import java.util.Random;

/**
 * 数组队列和循环队列比较
 *
 * @author guodd
 * @version 1.0
 */
public class MainComparison {
    public static void main(String[] args) {
        int opCount = 100000;
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        double time1 = comparison(queue, opCount);
        System.out.println("ArrayQueue, time: " + time1 + " s");

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = comparison(loopQueue, opCount);
        System.out.println("LoopQueue, time: " + time2 + " s");
    }

    public static double comparison(Queue<Integer> queue, int opCount) {
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < opCount; i++)
            queue.enqueue(random.nextInt(Integer.MAX_VALUE));
        for (int i = 0; i < opCount; i++)
            queue.dequeue();
        long end = System.currentTimeMillis();

        return (end - start) / 1000.0;
    }
}
