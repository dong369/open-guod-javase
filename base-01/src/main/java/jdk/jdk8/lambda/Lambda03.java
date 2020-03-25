package jdk.jdk8.lambda;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * lambda表达式的本质是作为函数式接口的实例！！！
 * 需要一个参数，但是没有返回值
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:17
 * @since 1.8
 */
public class Lambda03 {
    @Test
    public void main() {
        Lambda03.fun03((e) -> {
            // 截取最后一位
            System.out.println(e.substring(0, e.length() - 1));
        });
    }

    @Test
    public void consumer() {
        Consumer<String> consumer = (String s) -> {
            System.out.println(s);
        };
        consumer.accept("java");
    }

    private static void fun03(Movable03 movable03) {
        movable03.move("hello world!");
    }
}

interface Movable03 {
    void move(String str);
}