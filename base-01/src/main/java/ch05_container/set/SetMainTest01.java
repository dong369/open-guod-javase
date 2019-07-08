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
 * @Description 功能模块：无序，不可重复
 */
public class SetMainTest01 {
    public static void main(String[] args) {
        // 遍历Set：
        Set<String> set = new HashSet<>();
        set.add("dd");
        set.add("ee");
        set.add("ff");
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