package ch07_threads.threadgroup;

/**
 * project - 线程组
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/9 时间:9:37
 * @JDK 1.8
 * @Description 功能模块：Dubbo的服务分组一样，Java 可以对相同性质的线程进行分组。
 */
public class ThreadGroupTestMain01 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Java技术栈线程线程组名称：" + Thread.currentThread().getThreadGroup());
            System.out.println("Java技术栈线程线程名称：" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ThreadGroup userGroup = new ThreadGroup("user");
        userGroup.setMaxPriority(Thread.MIN_PRIORITY);
        Thread userTask1 = new Thread(userGroup, runnable, "user-task1");
        Thread userTask2 = new Thread(userGroup, runnable, "user-task2");
        userTask1.start();
        userTask2.start();
        System.out.println("Java技术栈线程线程组活跃线程数：" + userGroup.activeCount());
        userGroup.list();
    }
}