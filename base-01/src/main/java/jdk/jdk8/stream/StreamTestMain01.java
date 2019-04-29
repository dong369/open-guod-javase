package jdk.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:15:26
 * @JDK 1.8
 * @Description 功能模块：Java 8 中的Stream是对集合（Collection）对象功能的增强，
 * 它专注于对集合对象进行各种非常便利、高效的聚合操作（aggregate operation），或者大批量数据操作 (bulk data operation)。
 * Stream API 借助于同样新出现的 Lambda 表达式，极大的提高编程效率和程序可读性。
 */
public class StreamTestMain01 {
    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(1, 6, 2, 4);
        List<String> collect = Stream.of("java", "javascript").collect(Collectors.toList());
        asList.stream().sorted(Integer::compareTo).forEach(System.out::println);
        collect.forEach(System.out::println);
    }
}
