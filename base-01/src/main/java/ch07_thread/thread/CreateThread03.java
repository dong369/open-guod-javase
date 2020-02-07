package ch07_thread.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 通过Callable接口实现多线程
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/11 时间:11:14
 * @since 1.8
 */
public class CreateThread03 {
    public static void main(String[] args) throws Exception {
        Callable<String> callable = new T03();
        FutureTask<String> task = new FutureTask<>(callable);
        new Thread(task).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程：" + i);
        }
        System.out.println(task.get());
    }
}

class T03 implements Callable<String> {
    @Override
    public String call() {
        // Thread.sleep(5000);
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程：" + i);
        }
        return "有返回值的线程";
    }
}
