package jdk.jdk8.lambda;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:17
 * @JDK 1.8
 * @Description 功能模块：
 */
public class LambdaTestMain03 {
    public static void main(String[] args) {
        LambdaTestMain03.fun03((e) -> {
            // 截取最后一位
            System.out.println(e.substring(0, e.length() - 1));
        });
    }

    private static void fun03(Movable03 movable03) {
        movable03.move("hello world!");
    }
}

interface Movable03 {
    void move(String str);
}