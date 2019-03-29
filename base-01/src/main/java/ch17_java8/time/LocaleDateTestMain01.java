package ch17_java8.time;

import java.time.Clock;
import java.time.LocalDateTime;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:15:31
 * @JDK 1.8
 * @Description 功能模块：
 */
public class LocaleDateTestMain01 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(Clock.systemUTC().instant());
        System.out.println(Clock.systemUTC().millis());
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}
