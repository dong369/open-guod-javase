package ch05_container.list;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * List是有序（元素存入集合的顺序和取出的顺序一致）且可以重复的，Set是无序（存入/取出）不重复的。
 * 有序，可重复（顺序有两个概念：一是按添加的顺序排列，二是按自然顺序a-z排列。）
 * ArrayList：Object数组实现,查找快,增删慢由于是数组实现,在增和删的时候会牵扯到数组增容, 以及拷贝元素. 所以慢。数组是可以直接按索引查找, 所以查找时较快。
 * LinkedList：双向循环链表实现,增删快,查找慢由于链表实现, 增加时只要让前一个元素记住自己就可以, 删除时让前一个元素记住后一个元素, 后一个元素记住前一个元素. 这样的增删效率较高但查询时需要一个一个的遍历, 所以效率较低
 * Vector：ArrayList原理相同,但线程安全,效率略低和ArrayList实现方式相同, 但考虑了线程安全问题, 所以效率略低
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class ArrayListMain {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("java");
        stringSet.add("javascript");
        ArrayList<String> stringArr = Lists.newArrayList(stringSet.toArray(new String[]{}));
        System.out.println(stringArr);

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

        // 推荐使用
        for (Iterator<String> it = names.iterator(); it.hasNext(); ) {
            String next = it.next();
            if (next.contains("Tom")) {
                names.remove(next);
            }
        }
    }
}