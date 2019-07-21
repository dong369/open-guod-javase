package ch07_thread.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/11 时间:11:14
 * @JDK 1.8
 * @Description 功能模块：通过Callable接口实现多线程
 */
public class CreateThreadTest03 {
    public static void main(String[] args) throws Exception {
        Callable<String> callable = new T03();
        FutureTask<String> task = new FutureTask<>(callable);
        new Thread(task).start();
        String result = task.get();
        System.out.println(result);
    }
}

class T03 implements Callable<String> {

    @Override
    public String call() {
        try {
            Thread.sleep(5000);
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "创建";
    }
}
