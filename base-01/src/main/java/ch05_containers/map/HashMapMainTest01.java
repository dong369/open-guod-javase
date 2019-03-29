package ch05_containers.map;

import java.util.HashMap;
import java.util.Map;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/15 时间:16:24
 * @JDK 1.8
 * @Description 功能模块：
 */
public class HashMapMainTest01 {
    public static void main(String[] args) {
        // 遍历Map：
        Map<String, String> map = new HashMap<>();
        map.put("aa", "xx");
        map.put("bb", "yy");
        map.put("cc", "zz");

        // 1，增强的for循环（Entry集合）
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

        // 2，增强的for循环（Key集合）
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        // 3，遍历值的集合
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
