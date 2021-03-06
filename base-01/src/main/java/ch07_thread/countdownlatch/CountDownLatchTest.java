package ch07_thread.countdownlatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * 并发控制倒计时器 - CountDownLatch
 * 机制是只要提供的多个(具体数量等于初始化CountDownLatch时count的值)线程都达到了预期状态或者完成了预期工作时触发事件，其他线程可以等待这个事件来触发自己后续的工作。
 *
 * @author guodd
 * @version 1.0
 * 两个类都含有这一个意思：对应的线程都完成工作之后再进行下一步动作，也就是大家都准备好之后再进行下一步。
 * 然而两者最大的区别是，进行下一步动作的动作实施者是不一样的。这里的“动作实施者”有两种，一种是主线程（即执行main函数），另一种是执行任务的其他线程，后面叫这种线程为“其他线程”，区分于主线程。
 * 对于{@link CountDownLatch}，当计数为0的时候，下一步的动作实施者是main函数；
 * 对于{@link java.util.concurrent.CyclicBarrier}，下一步动作实施者是“其他线程”。
 * 对于CountDownLatch，其他线程为游戏玩家，比如英雄联盟，主线程为控制游戏开始的线程。
 * 在所有的玩家都准备好之前，主线程是处于等待状态的，也就是游戏不能开始。当所有的玩家准备好之后，下一步的动作实施者为主线程，即开始游戏。
 */
public class CountDownLatchTest {
    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(4);
        System.out.println("等待所有玩家准备...");
        for (int i = 0; i < latch.getCount(); i++) {
            new Thread(new MyThread(latch), "player" + i).start();
        }
        latch.await();
        System.out.println("开始游戏");
    }

    private static class MyThread implements Runnable {
        CountDownLatch latch;

        MyThread(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                Random rand = new Random();
                // 产生1000到3000之间的随机整数
                int randomNum = rand.nextInt((3000 - 1000) + 1) + 1000;
                Thread.sleep(randomNum);
                System.out.println(Thread.currentThread().getName() + " 已经准备好了, 所使用的时间为 " + ((double) randomNum / 1000) + "s");
                latch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
