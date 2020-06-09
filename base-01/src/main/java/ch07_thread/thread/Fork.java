package ch07_thread.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Fork / Join框架实战
 *
 * @author guodd
 * @version 1.0
 * 下面实现一个Fork/Join小例子，从1+2+...10亿，每个任务只能处理1000个数相加，超过1000个的自动分解成小任务并行处理；
 * 并展示了通过不使用Fork/Join和使用时的时间损耗对比。
 */
public class Fork extends RecursiveTask<Long> {
    private static final long MAX = 1000000000L;
    private static final long THRESHOLD = 1000L;
    long start;
    long end;

    public Fork(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {
        System.out.println(doTest());
        System.out.println("===");
        System.out.println(doFork());
    }

    private static long doTest() {
        long startTime = System.nanoTime();
        long sum = 0;
        for (long i = 1; i <= MAX; i++) {
            sum += i;
        }
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1000000000.0);
        return sum;
    }

    public static long doFork() {
        long startTime = System.nanoTime();
        ForkJoinPool fork = new ForkJoinPool();
        Long invoke = fork.invoke(new Fork(0, MAX));
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1000000000.0);
        return invoke;
    }

    @Override
    protected Long compute() {
        long sum = 0;
        if (end - start <= THRESHOLD) {
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            long mid = (start + end) / 2;
            Fork fork1 = new Fork(start, mid);
            fork1.fork();
            Fork fork2 = new Fork(mid + 1, end);
            fork2.fork();
            return fork1.join() + fork2.join();
        }
    }
}
