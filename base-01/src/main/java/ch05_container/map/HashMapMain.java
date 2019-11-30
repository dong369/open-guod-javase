package ch05_container.map;

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
 * HashMap：底层就是一个数组结构（叫做Entry Table），数组中的每一项又是一个链表（叫做Bucket,用于解决hash冲突而设计的）。
 * LinkedHashMap：
 * TreeMap：基于红黑树数据结构的实现，查看“键”或“键值对”时，它们会被排序(次序由Comparabel或Comparator决定)。TreeMap的特点在于，你得到的结果是经过排序的。TreeMap是唯一的带有subMap()方法的Map，它可以返回一个子树。
 * WeakHashMap：弱键(weak key)Map，Map中使用的对象也被允许释放: 这是为解决特殊问题设计的。如果没有map之外的引用指向某个“键”，则此“键”可以被垃圾收集器回收。
 * IdentifyHashMap：使用==代替equals()对“键”作比较的hash map，专为解决特殊问题而设计。
 * Hashtable：Hashtable与HashMap类似，Hashtable继承自Dictionary类，实现了Map接口，不同的是它不允许记录的键或者值为空；和HashMap相比，Hashtable是线程同步的，即任一时刻只有一个线程能写Hashtable，因此也导致了 Hashtable在写入时会比较慢。而且Hashtable可以通过Enumeration去遍历。
 *
 */
public class HashMapMain {
    public static void main(String[] args) {
        // 遍历Map
        Map<String, String> map = new HashMap<>();
        map.put("aa", "xx");
        map.put("bb", "yy");
        map.put("cc", "zz");

        // 1，增强的for循环（Entry集合）
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
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
