package jdk.jdk8.lambda;

import java.util.function.Function;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 */
public class Lambda07 {
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
