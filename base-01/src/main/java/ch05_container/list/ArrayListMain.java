package ch05_container.list;

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
 * @Description 功能模块：有序，可重复（顺序有两个概念：一是按添加的顺序排列，二是按自然顺序a-z排列。）
 * ArrayList：内部结构基于数组实现，可以对元素进行随机的访问，向ArrayList中插入与删除元素的速度慢。
 * LinkedList：双向链表
 * Vector：
 */
public class ArrayListMain {
    public static void main(String[] args) {
        // 遍历List：
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("cc");
        // Arrays.asList()会返回一个ArrayList，但是要特别注意，这个ArrayList是Arrays类的静态内部类，并不是java.util.ArrayList类。
        List<String> strings = Arrays.asList("1", "2", "3");
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 7));
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
        // 5删除
        for (String name : names) {
            if (name.equals("Tom")) {
                // 报异常IndexOutOfBoundsException我们很理解，是动态删除了元素导致数组下标越界了。
                // names.remove(name);
            }
        }
        // 正常删除，每次调用size方法，损耗性能，不推荐
        // int size = names.size();
        // 报异常IndexOutOfBoundsException我们很理解，是动态删除了元素导致数组下标越界了。
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.equals("Tom")) {
                names.remove(name);
            }
        }
        for (Iterator<String> it = names.iterator(); it.hasNext(); ) {
            String next = it.next();
            if (next.contains("Tom")) {
                names.remove(next);
            }
        }
    }
}