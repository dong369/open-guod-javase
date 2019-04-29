package jdk.jdk8.lambda;

import java.util.function.Function;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/9 时间:7:55
 * @JDK 1.8
 * @Description 功能模块：
 */
public class LambdaTestMain07 {
    public static void main(String[] args) {
        Function<String, String> function1 = (str) -> {
            return str.toUpperCase();
        };

        Function<String, String> function2 = String::toLowerCase;

        adapter(function1);
        adapter(function2);
    }

    private static void adapter(Function<String, String> function) {
        String message = "Hello World";
        System.out.println(function.apply(message));
    }
}
