package jdk.jdk8.stream;

import jdk.jdk8.optional.User;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 终止操作 + 规约
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/8 时间:17:52
 * @since 1.8
 */
public class StreamMain03 {
    // 匹配与查找
    @Test
    public void end() {
        // allMatch()检查是否匹配所有元素
        boolean allMatch = StreamMain02.createUser().stream().allMatch(e -> e.getAge() > 5);
        System.out.println(allMatch);
        // anyMatch()检查是否至少匹配一个元素
        boolean anyMatch = StreamMain02.createUser().stream().anyMatch(e -> e.getAge() > 5);
        System.out.println(anyMatch);
        // noneMatch()检查是否没有匹配的元素
        boolean noneMatch = StreamMain02.createUser().stream().noneMatch(e -> e.getName().startsWith("user1"));
        System.out.println(noneMatch);
        // findFirst()返回第一个元素
        Optional<User> first = StreamMain02.createUser().stream().findFirst();
        System.out.println(first.map(User::getName));
        // findAny()返回任意一个元素
        System.out.println(StreamMain02.createUser().stream().findAny());
        System.out.println(StreamMain02.createUser().parallelStream().findAny());


        // count返回元素总数
        System.out.println(StreamMain02.createUser().stream().filter(e -> e.getAge() > 5).count());
        // max返回最大值
        System.out.println(StreamMain02.createUser().stream().map(User::getAge).max(Comparator.naturalOrder()));
        // min返回最小值
        System.out.println(StreamMain02.createUser().stream().map(User::getAge).min(Comparator.naturalOrder()));
        // forEach内部迭代
        StreamMain02.createUser().stream().map(User::getAge).forEach(System.out::println);
    }

    // 归约
    @Test
    public void test() {
        // T reduce(T identity, BinaryOperator<T> accumulator);
        List<Integer> integers = Arrays.asList(1, 3, 4, 6);
        System.out.println(integers.stream().reduce(0, Integer::sum));
        // Optional<T> reduce(BinaryOperator<T> accumulator);
        System.out.println(StreamMain02.createUser().stream().map(User::getAge).reduce(Integer::sum));
    }

    // 收集
    @Test
    public void collect() {
        List<User> user = StreamMain02.createUser();
        List<User> userList = user.stream().filter(e -> e.getAge() > 8).collect(Collectors.toList());
        userList.forEach(System.out::println);
        Set<User> userSet = user.stream().filter(e -> e.getAge() > 8).collect(Collectors.toSet());
        userSet.forEach(System.out::println);
    }
}