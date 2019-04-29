package jdk.jdk8.lambda;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/8 时间:20:36
 * @JDK 1.8
 * @Description 功能模块：
 */
public class LambdaTestMain06 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("java")).start();
    }
}
