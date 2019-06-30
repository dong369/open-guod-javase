package datastructure.ch06_collections.ch01_set_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/30 时间:8:59
 * @JDK 1.8
 * @Description 功能模块：集合，数据不可以重复，通过链表实现。多重集合是可以重复的。
 * 有序集合中的元素具有顺序性←基于搜索树的实现
 * 无序集合中的元素没有顺序性←基于哈希表的实现
 */
public class LinkedListSet<E> implements Set<E> {


    @Override
    public void add(E e) {

    }

    @Override
    public void remove(E e) {

    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
