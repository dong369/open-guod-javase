package jdk.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/8 时间:17:52
 * @JDK 1.8
 * @Description 功能模块：
 */
public class StreamTestMain03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, -2, 0, 4, 5);
        long count = numbers.parallelStream().filter(i -> i > 4).count();
        System.out.println(count);
    }
}