package jdk.jdk8.lambda;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/22 时间:16:49
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(1000);
                    System.out.println(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
