package ch07_threads.thread;

import java.util.concurrent.RecursiveTask;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/12/2 时间:11:54
 * @JDK 1.8
 * @Description 功能模块：Fork/Join框架实战
 * 下面实现一个Fork/Join小例子，从1+2+...10亿，每个任务只能处理1000个数相加，超过1000个的自动分解成小任务并行处理；
 * 并展示了通过不使用Fork/Join和使用时的时间损耗对比。
 */
public class UseForkJoinTask extends RecursiveTask<Long> {
    private static final long MAX = 1000000000L;

    @Override
    protected Long compute() {
        return null;
    }
}
