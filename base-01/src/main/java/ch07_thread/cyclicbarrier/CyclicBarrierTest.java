package ch07_thread.cyclicbarrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 并发控制循环栅栏 - CyclicBarrier
 *
 * @author guodd
 * @version 1.0
 * 功能模块：两个类都含有这一个意思：对应的线程都完成工作之后再进行下一步动作，也就是大家都准备好之后再进行下一步。
 * 然而两者最大的区别是，进行下一步动作的动作实施者是不一样的。这里的动作实施者有两种，一种是主线程（即执行main函数），另一种是执行任务的其他线程，后面叫这种线程为其他线程，区分于主线程。
 * 对于CountDownLatch，当计数为0的时候，下一步的动作实施者是main函数；
 * 对于CyclicBarrier，下一步动作实施者是“其他线程”。
 * 对于CountDownLatch，其他线程为游戏玩家，比如英雄联盟，主线程为控制游戏开始的线程。
 * 对于CyclicBarrier，假设有一家公司要全体员工进行团建活动，活动内容为翻越三个障碍物，每一个人翻越障碍物所用的时间是不一样的。
 * 但是公司要求所有人在翻越当前障碍物之后再开始翻越下一个障碍物，也就是所有人翻越第一个障碍物之后，才开始翻越第二个，以此类推。类比地，每一个员工都是一个其他线程。
 * 当所有人都翻越的所有的障碍物之后，程序才结束。而主线程可能早就结束了，这里我们不用管主线程。
 */
public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);
        for (int i = 0; i < barrier.getParties(); i++) {
            new Thread(new MyRunnable(barrier), "队友" + i).start();
        }
        System.out.println("主要功能完成");
    }

    private static class MyRunnable implements Runnable {
        CyclicBarrier barrier;

        MyRunnable(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
                    Random rand = new Random();
                    // 产生1000到3000之间的随机整数
                    int randomNum = rand.nextInt((3000 - 1000) + 1) + 1000;
                    Thread.sleep(randomNum);
                    System.out.println(Thread.currentThread().getName() + ", 通过了第" + i + "个障碍物, 使用了 " + ((double) randomNum / 1000) + "s");
                    barrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}