package jdk.jdk8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/9 时间:8:03
 * @since 1.8
 */
public class ContextDemo {
    public static void main(String[] args) {
        Function<String, String> function = (str) -> {
            return transform(str);
        };
        Consumer<String> consumer = (str) -> {
            str = transform(str);
        };
        String msg = "Hello";
        System.out.println(msg);
        consumer.accept(msg);
        System.out.println(msg);
        msg = function.apply(msg);
        System.out.println(msg);
    }

    public static String transform(String str) {
        return str.concat(" World");
    }
}
