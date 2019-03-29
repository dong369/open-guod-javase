package ch05_containers.list;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/15 时间:16:24
 * @JDK 1.8
 * @Description 功能模块：有序，可重复
 */
public class ArrayListMainTest01 {
    public static void main(String[] args) {
        // 遍历List：
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("cc");
        List<String> strings = Arrays.asList("1", "2", "3");
        List<String> apples = Collections.nCopies(3, "apple");
        List<String> names = new ArrayList<String>() {{
            add("Tom");
            add("Sally");
            add("John");
        }};
        List<String> colors = Stream.of("blue", "red", "yellow").collect(toList());
        // List<String> cups = List.of("A", "B", "C");  Java9的语法

        // 1，增强的for循环
        for (String elt : list) {
            System.out.println(elt);
        }
        // 2，下标
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 3，迭代器
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String elt = iterator.next();
            System.out.println(elt);
        }
        // 4，Java8
        strings.forEach(System.out::println);
    }
}