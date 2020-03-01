package ch05_container.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/8 时间:8:02
 * @since 1.8
 */
public class ArraysMain {
    public static void main(String[] args) {
        // arrays返回的list是一个内部类，不是真正的list
        List<String> innerList = Arrays.asList("a", "b", "c");

        // innerList.add("d");  报错
        // innerList.removeIf(e -> e.contains("c")); 报错

        // 对上面的类进行转换
        List<String> strings = new ArrayList<>(innerList);
        strings.add("d");

        // removeIf
        strings.removeIf(e -> e.contains("c"));
        System.out.println(strings);

    }
}
