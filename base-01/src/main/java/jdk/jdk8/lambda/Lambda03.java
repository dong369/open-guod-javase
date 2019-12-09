package jdk.jdk8.lambda;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * project - lambda表达式的本质是作为函数式接口的实例！！！
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:17
 * @JDK 1.8
 * @Description 功能模块：需要一个参数，但是没有返回值
 */
public class Lambda03 {
    public static void main(String[] args) {
        Lambda03.fun03((e) -> {
            // 截取最后一位
            System.out.println(e.substring(0, e.length() - 1));
        });
    }

    private static void fun03(Movable03 movable03) {
        movable03.move("hello world!");
    }

    @Test
    public void consumer() {
        Consumer<String> consumer = (String s) -> {
            System.out.println(s);
        };
        consumer.accept("java");
    }
}

interface Movable03 {
    void move(String str);
}