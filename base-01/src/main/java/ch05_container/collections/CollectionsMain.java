package ch05_container.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/15 时间:16:24
 * @JDK 1.8
 * @Description 功能模块：
 */
public class CollectionsMain {
    public static void main(String[] args) {
        Set<Object> objects = Collections.newSetFromMap(new HashMap<>());
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
