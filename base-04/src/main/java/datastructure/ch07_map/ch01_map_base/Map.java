package datastructure.ch07_map.ch01_map_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/21 时间:18:11
 * @JDK 1.8
 * @Description 功能模块：映射结构（字典：dict），存储数据对的数据结构，根据key，查找value
 * key     value
 * 字典   单词      意思
 * 数据库  id       信息
 */
public interface Map<K, V> {
    void add(K k, V v);

    V remove(K k);

    boolean contains(K k);

    void set(K k, V v);

    V get(K k);

    boolean getEmpty();

    int getSize();
}
