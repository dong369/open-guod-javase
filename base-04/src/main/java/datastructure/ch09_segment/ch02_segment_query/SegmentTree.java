package datastructure.ch09_segment.ch02_segment_query;

import datastructure.ch09_segment.ch01_segment_base.Merger;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/8 时间:21:21
 * @JDK 1.8
 * @Description 功能模块：进行区间查询操作
 */
public class SegmentTree<E> {
    private E[] data;
    private E[] tree;
    private Merger<E> merger;

    public SegmentTree(E[] arr, Merger<E> merger) {
        this.merger = merger;
        data = (E[]) new java.lang.Object[arr.length];
        // 数组的初始化
        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }
        // 线段树的初始化+构建
        tree = (E[]) new Object[arr.length * 4];
        buildSegmentTree(0, 0, getSize() - 1);
    }

    private void buildSegmentTree(int treeIndex, int l, int r) {
        if (l == r) {
            tree[treeIndex] = data[l];
            return;
        }
        // 构建线段树
        int leftChild = leftChild(treeIndex);
        int rightChild = rightChild(treeIndex);
        int mid = l + (r - l) / 2;
        buildSegmentTree(leftChild, l, mid);
        buildSegmentTree(rightChild, mid + 1, r);
        // 进行求和
        tree[treeIndex] = merger.merge(tree[leftChild], tree[rightChild]);
    }

    // 更具给定的左右边界查询操作
    public E query(int queryL, int queryR) {
        // 边界判断
        if (queryL < 0 || queryL > getSize()) {
        }
        return query(0, 0, getSize() - 1, queryL, queryR);
    }

    // 在以treeIndex为根的线段树中[l...r]的范围里，搜索区间[queryL...queryR]的值
    public E query(int treeIndex, int l, int r, int queryL, int queryR) {
        if (l == queryL && r == queryR) {
            return tree[treeIndex];
        }
        int leftChild = leftChild(treeIndex);
        int rightChild = rightChild(treeIndex);
        int mid = l + (r - l) / 2;
        if (queryR <= mid) {
            return query(leftChild, l, mid, queryL, queryR);
        } else if (queryL >= mid + 1) {
            return query(rightChild, mid + 1, r, queryL, queryR);
        }
        E leftResult = query(leftChild, l, mid, queryL, mid);
        E rightResult = query(rightChild, mid + 1, r, mid + 1, queryR);
        return merger.merge(leftResult, rightResult);
    }

    public int leftChild(int index) {
        return index * 2 + 1;
    }

    public int rightChild(int index) {
        return index * 2 + 2;
    }

    public int getSize() {
        return data.length;
    }

    public E get(int index) {
        if (index < 0 || index > getSize()) {
        }
        return data[index];
    }
}
