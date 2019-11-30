package ch07_thread.cyclicbarrier;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * N个线程向队列添加数据
 * 一个线程消费队列数据
 * 注意：多线程编程对实际环境和需求有很大的依赖，需要根据实际的需求情况对各个参数做调整。
 * 实际在使用中，需要尽量模拟生产环境的数据情况来进行测试，对服务器执行期间的并发数，CPU、内存、网络 IO、磁盘 IO 做好观察。并适当地调低并发数，以给服务器留有处理其他请求的余量。
 */
public class QueueTest {
    private static List<String> data = Arrays.asList("a", "b", "c", "d", "e");

    private static final int OFFER_COUNT = 40; // 开启的线程数量

    private static Semaphore semaphore = new Semaphore(20); // 同一时间执行的线程数量（大多用于控制API调用次数或数据库查询连接数）

    public static void main(String[] args) throws InterruptedException {
        Queue<String> queue = new ConcurrentLinkedQueue<>(); // 处理队列，需要处理的数据，放置到此队列中

        CountDownLatch offerLatch = new CountDownLatch(OFFER_COUNT); // offer线程latch，每完成一个，latch减一，lacth的count为0时表示offer处理完毕
        CountDownLatch pollLatch = new CountDownLatch(1); // poll线程latch，latch的count为0时，表示poll处理完毕

        Runnable offerRunnable = () -> {
            try {
                semaphore.acquire(); // 信号量控制
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                for (String datum : data) {
                    queue.offer(datum);
                    TimeUnit.SECONDS.sleep(2); // 模拟取数据很慢的情况
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 在finally中执行latch.countDown()以及信号量释放，避免因异常导致没有正常释放
                offerLatch.countDown();
                semaphore.release();
            }
        };

        Runnable pollRunnable = () -> {
            int count = 0;
            try {
                while (offerLatch.getCount() > 0 || queue.size() > 0) { // 只要offer的latch未执行完，或queue仍旧有数据，则继续循环
                    String poll = queue.poll();
                    if (poll != null) {
                        System.out.println(poll);
                        count++;
                    }
                    // 无论是否poll到数据，均暂停一小段时间，可降低CPU消耗
                    TimeUnit.MILLISECONDS.sleep(100);
                }
                System.out.println("total count:" + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 在finally中执行latch.countDown()，避免因异常导致没有正常释放
                pollLatch.countDown();
            }
        };

        // 启动线程（生产环境中建议使用线程池）
        new Thread(pollRunnable).start(); // 启动一个poll线程
        for (int i = 0; i < OFFER_COUNT; i++) {
            new Thread(offerRunnable).start();
        } // 模拟取数据很慢，需要开启40个线程处理

        // latch等待，会block主线程直到latch的count为0
        offerLatch.await();
        pollLatch.await();

        System.out.println("===the end===");
    }
}
