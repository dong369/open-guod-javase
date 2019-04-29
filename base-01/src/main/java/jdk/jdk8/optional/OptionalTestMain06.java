package jdk.jdk8.optional;

import java.util.Optional;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/7 时间:21:19
 * @JDK 1.8
 * @Description 功能模块：
 */
public class OptionalTestMain06 {
    public static void main(String[] args) {
    }

    public static String fun01(User user) {
        return Optional.ofNullable(user).map(User::getName).orElse("Unkown");
    }

    public static String fun02(User user) {
        return Optional.ofNullable(user).map(User::getName).orElseGet(() -> "Unkown");
    }

    public static String fun03(User user) {
        return Optional.ofNullable(user).map(User::getName).orElseThrow(() -> new RuntimeException("Unkown"));
    }
}
