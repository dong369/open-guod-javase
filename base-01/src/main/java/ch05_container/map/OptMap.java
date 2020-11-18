package ch05_container.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Map是一个键值对集合，存储键、值和之间的映射。Key无序，唯一；value不要求有序，允许重复。
 * Map没有继承于Collection接口，从Map集合中检索元素时，只要给出键对象，就会返回对应的值对象。
 * Map 的常用实现类：HashMap、TreeMap、HashTable、LinkedHashMap、ConcurrentHashMap
 *
 * @author guod
 * @version 1.0
 * HashMap：JDK1.8之前HashMap由数组+链表组成的，数组是HashMap的主体，链表则是主要为了解决哈希冲突而存在的（“拉链法”解决冲突）.JDK1.8以后在解决哈希冲突时有了较大的变化，当链表长度大于阈值（默认为8）时，将链表转化为红黑树，以减少搜索时间。
 * LinkedHashMap：LinkedHashMap继承自HashMap，所以它的底层仍然是基于拉链式散列结构即由数组和链表或红黑树组成。另外，LinkedHashMap 在上面结构的基础上，增加了一条双向链表，使得上面的结构可以保持键值对的插入顺序。同时通过对链表进行相应的操作，实现了访问顺序相关逻辑。
 * TreeMap：红黑树（自平衡的排序二叉树），查看“键”或“键值对”时，它们会被排序（次序由Comparable或Comparator决定）。TreeMap的特点在于，你得到的结果是经过排序的。TreeMap是唯一的带有subMap()方法的Map，它可以返回一个子树。
 * Hashtable：数组+链表组成的，数组是HashMap的主体，链表则是主要为了解决哈希冲突而存在的。
 * ConcurrentHashMap：
 * WeakHashMap：弱键(weak key)Map，Map中使用的对象也被允许释放: 这是为解决特殊问题设计的。如果没有map之外的引用指向某个“键”，则此“键”可以被垃圾收集器回收。
 * IdentifyHashMap：使用==代替equals()对“键”作比较的hash map，专为解决特殊问题而设计。
 */
public class OptMap {
    @Test
    public  void mapInit() {
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

    @Test
    public void sorted() {
    }
}
