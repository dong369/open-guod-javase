package datastructure.ch06_set.ch01_set_base;

import datastructure.ch05_bst.ch07_remove_in_bst.BST;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/21 时间:18:07
 * @JDK 1.8
 * @Description 功能模块：集合，数据不可以重复，通过BST树实现。多重集合是可以重复的。
 * 有序集合中的元素具有顺序性←基于搜索树的实现
 * 无序集合中的元素没有顺序性←基于哈希表的实现
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {
    private BST<E> bst;

    public BSTSet() {
        bst = new BST<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.getSize();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }
}
