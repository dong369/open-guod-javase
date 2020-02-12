package jdk.jdk8.stream;

import jdk.jdk8.optional.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 中间操作
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/7 时间:20:44
 * @since 1.8
 */
public class StreamMain02 {
    public static List<User> createUser() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("user" + i);
            user.setAge(i);
            users.add(user);
        }
        return users;
    }

    // 筛选与切片
    @Test
    public void filter() {
        List<User> users = createUser();
        // filter(Predicate p)接收lambda表达式，从流中过滤某些元素。
        Stream<User> stream = users.stream();
        System.out.println("==========filter过滤==========");
        stream.filter(e -> e.getName().contains("2")).forEach(System.out::println);
        System.out.println("==========limit是阶段流==========");
        // limit是阶段流，使其元素不超过给定的数量。
        users.stream().filter(e -> !e.getName().contains("2")).limit(3).forEach(System.out::println);
        // skip跳过元素，
        System.out.println("==========skip跳过元素==========");
        users.stream().filter(e -> !e.getName().contains("2")).skip(3).forEach(System.out::println);
        // distinct筛选，通过流所产生元素的hashCode()和equals()去除重复数据。
        System.out.println("==========distinct去重==========");
        users.add(new User("user4", 4));
        users.stream().filter(e -> !e.getName().contains("2")).distinct().forEach(System.out::println);
    }

    // 映射
    @Test
    public void mapData() {
        // map映射，接收一个函数作为参数，将元素转换成其他形式或提取信息
        System.out.println("==========map映射==========");
        List<String> strings = Arrays.asList("java", "c", "c++");
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
        List<String> collect = createUser().stream().map(User::getName).collect(Collectors.toList());
        createUser().stream().map(User::getName).filter(e -> e.length() > 6).forEach(System.out::println);
        System.out.println(collect);
        // flatMap映射，接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有所有的流串起来。
    }

    // 排序
    @Test
    public void sor() {
        List<Integer> integers = Arrays.asList(1, 3, 10, 1, 0, -1, 2, 34);
        integers.stream().sorted().forEach(System.out::println);
        createUser().stream().sorted(Comparator.comparing(User::getAge)).forEach(System.out::println);
    }
}