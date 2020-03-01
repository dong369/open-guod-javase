package jdk.jdk8.time;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 时区 @{link {@link ZonedDateTime}}
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:15:31
 * @since 1.8
 */
public class LocaleDateMain {
    public static void main(String[] args) {
        // America/New_York  & Asia/Shanghai
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(now.getMonth().getValue());
        System.out.println(System.currentTimeMillis());
        System.out.println(Clock.systemUTC().instant());
        System.out.println(Clock.systemUTC().millis());
        System.out.println(LocalDateTime.now());
    }
}