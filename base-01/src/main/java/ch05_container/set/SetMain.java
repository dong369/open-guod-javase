package ch05_container.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/15 时间:16:24
 * @JDK 1.8
 * @Description 功能模块：无序，不可重复（顺序有两个概念：一是按添加的顺序排列，二是按自然顺序a-z排列。）
 * 保证元素无序的顺序：HashSet，基于HashMap实现，不允许出现重复元素，不保证和政集合中元素的顺序。
 * 保证元素自然的顺序：TreeSet，基于树实现的。
 * 保证元素添加的顺序：LinkedHashSet，基于内链表实现。
 */
public class SetMain {
    public static void main(String[] args) {
        // 遍历Set：
        Set<String> set = new HashSet<>();
        set.add("s1");
        set.add("s2");
        set.add("s5");
        set.add("s3");
        // 1，增强的for循环
        for (String elt : set) {
            System.out.println(elt);
        }
        // 2，迭代器
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String elt = iterator.next();
            System.out.println(elt);
        }
    }
}