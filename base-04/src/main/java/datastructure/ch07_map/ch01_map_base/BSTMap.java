package datastructure.ch07_map.ch01_map_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/27 时间:13:21
 * @JDK 1.8
 * @Description 功能模块：
 * 有序映射中的键具有顺序性←基于搜索树的实现
 * 无序映射中的键没有顺序性←基于哈希表的实现
 */
public class BSTMap<K extends Comparable<K>, V> implements Map<K, V> {
    @Override
    public void add(K k, V v) {

    }

    @Override
    public V remove(K k) {
        return null;
    }

    @Override
    public boolean contains(K k) {
        return false;
    }

    @Override
    public void set(K k, V v) {

    }

    @Override
    public V get(K k) {
        return null;
    }

    @Override
    public boolean getEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
