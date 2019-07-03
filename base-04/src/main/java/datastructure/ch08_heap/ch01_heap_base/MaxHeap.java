package datastructure.ch08_heap.ch01_heap_base;

import datastructure.ch01_arrays.ch07_dynamic_array.Array;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/23 时间:21:03
 * @JDK 1.8
 * @Description 功能模块：最大堆，可以使用数组表示。
 */
public class MaxHeap<E extends Comparable<E>> {
    private Array<E> data;

    public MaxHeap(int capacity) {
        data = new Array<>(capacity);
    }

    public MaxHeap() {
        data = new Array<>();
    }

    // 堆中的元素个数，size
    public int getSize() {
        return data.getSize();
    }

    // 堆是否为空
    public boolean isEmpty() {
        return data.isEmpty();
    }

    // 堆的父亲索引=(index-1)/2
    private int getParent(int index) {
        return (index - 1) / 2;
    }

    // 堆的左索引=(index*2)+1
    private int getLeftChile(int index) {
        return index * 2 + 1;
    }

    // 堆的右索引(index*2)+2
    private int getRightChile(int index) {
        return index * 2 + 2;
    }
}
