package jdk.jdk8.time;

import org.junit.Test;

import java.time.Instant;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 2020/3/1
 * @since 1.8
 */
public class InstantMain {
    @Test
    public void instantNow() {
        Instant now = Instant.now();
        System.out.println(Instant.now());
        System.out.println(now.toEpochMilli()); // 秒
        System.out.println(now.getEpochSecond()); // 毫秒
    }
}
