package ch07_thread.thread;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * 使用Executors工具类创建线程池，使用线程池的好处？
 * 1、降低资源消耗
 * 2、提高响应速度
 * 3、提高线程的可管理性
 * <p>
 * 《阿里巴巴Java开发手册》中强制线程池不允许使用Executors去创建，而是通过ThreadPoolExecutor的方式
 * {@link Executors}
 * {@link ThreadPoolExecutor}
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class CreateThread04 {
    /**
     * FixedThreadPool 和 SingleThreadExecutor：允许请求的队列长度为 Integer.MAX_VALUE,可能堆积大量的请求，从而导致OOM。
     * CachedThreadPool 和 ScheduledThreadPool：允许创建的线程数量为 Integer.MAX_VALUE ，可能会创建大量线程，从而导致OOM。
     */
    @Test
    public void createThreadPool() throws ExecutionException, InterruptedException {
        Callable<Object> callable = Executors.callable(() -> System.out.println("java"), String.class);

        System.out.println(callable);

        ExecutorService executorService = Executors.newCachedThreadPool();
        // execute() 方法用于提交不需要返回值的任务，所以无法判断任务是否被线程池执行成功与否
        executorService.execute(() -> System.out.println("java"));
        // submit()方法用于提交需要返回值的任务。线程池会返回一个future类型的对象，通过这个future对象可以判断任务是否执行成功
        Future<?> java1 = executorService.submit(() -> System.out.println("java"));
        System.out.println(java1.get());
    }
}
