package jdk.jdk8.stream;

import jdk.jdk8.optional.User;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 中间操作
 *
 * @author guodd
 * @version 1.0
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

        System.out.println("==========排序==========");
        Map<Integer, List<User>> collect = stream.sorted(Comparator.comparing(User::getAge)).collect(Collectors.groupingBy(User::getAge));
        System.out.println(collect);

        System.out.println("==========filter过滤==========");
        users.stream().filter(e -> e.getName().contains("2")).forEach(System.out::println);

        System.out.println("==========limit是阶段流==========");
        // limit是阶段流，使其元素不超过给定的数量。
        users.stream().filter(e -> !e.getName().contains("2")).limit(3).forEach(System.out::println);

        System.out.println("==========skip跳过元素==========");
        // skip跳过前三个元素
        users.stream().filter(e -> !e.getName().contains("2")).skip(3).forEach(System.out::println);

        System.out.println("==========distinct去重==========");
        users.add(new User("user4", 4));
        // distinct筛选，通过流所产生元素的hashCode()和equals()去除重复数据。
        users.stream().filter(e -> !e.getName().contains("2")).distinct().forEach(System.out::println);

    }

    // 分页
    @Test
    public void skipPage() {
        List<User> areaVo = StreamMain02.createUser().stream()
                // 2 10 (2-1)*10
                // (pageable.getPageNumber() - 1) * pageable.getPageSize()
                .skip(10)
                // pageable.getPageSize()
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(areaVo);
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
        System.out.println("==========flatMap映射==========");
        List<User> user = createUser();
        Stream<User> stream = user.stream();
    }

    // 基础排序
    @Test
    public void sorted() {
        List<Integer> integers = Arrays.asList(1, 3, 10, 1, 0, -1, 2, 34);
        integers.stream().sorted().forEach(System.out::println);

        createUser().stream().sorted(Comparator.comparing(User::getAge)).forEach(System.out::println);
        List<User> collect = createUser().stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());
    }

    // 排序字段有空的情况
    @Test
    public void listSort() {
        List<User> users = createUser();
        // 添加空的排序会报错
        users.add(new User());
        List<User> collect = users.stream()
                // 查找stream.sorted源码看到有Comparator.nullsFirst和Comparator.nullsLast方法
                .sorted(Comparator.comparing(User::getAge, Comparator.nullsFirst(Integer::compareTo)).reversed())
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    // 流不变，但会把每个元素传入fun执行，可以用作调试
    @Test
    public void peek() {
        List<User> user = createUser();
        Stream<User> stream = user.stream();
    }
}
