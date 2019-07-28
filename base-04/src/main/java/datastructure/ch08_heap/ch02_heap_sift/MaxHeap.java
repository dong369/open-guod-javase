package datastructure.ch08_heap.ch02_heap_sift;

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

    // 堆的父亲索引
    private int getParent(int index) {
        return (index - 1) / 2;
    }

    // 堆的左索引
    private int getLeftChile(int index) {
        return index * 2 + 1;
    }

    // 堆的右索引
    private int getRightChile(int index) {
        return index * 2 + 2;
    }

    // 向堆中添加元素
    public void add(E e) {
        data.addLast(e);
        siftUp(data.getSize() - 1);
    }

    private void siftUp(int k) {
        while (k > 0 && data.get(k).compareTo(data.get(getParent(k))) > 0) {
            data.swap(k, getParent(k));
            // 新位置的索引k的值，再进行循环操作
            k = getParent(k);
        }
    }

    private void siftDown(int k) {
        // k的左孩子不越界的情况
        while (getLeftChile(k) < data.getSize()) {
            // 最终比较后最大的结果值
            int j = getLeftChile(k);
            // 同时右孩子也不越界
            if (k + 1 < data.getSize() && data.get(j + 1).compareTo(data.get(j)) >= 0) {
                j = getRightChile(k);
            }
            // 当前k的值和子节点中最大的值进行比较
            if (data.get(k).compareTo(data.get(j)) >= 0) {
                break;
            }
            // 进行交换
            data.swap(k, j);
            k = j;
        }
    }

    // 看堆中的最大元素
    private E findMax() {
        if (data.getSize() == 0)
            throw new IllegalArgumentException("Can not findMax when heap is empty.");
        return data.get(0);
    }

    // 取出堆中最大元素
    public E extractMax() {
        E ret = findMax();
        data.swap(0, getSize() - 1);
        data.removeLast();
        siftDown(0);
        return ret;
    }
}