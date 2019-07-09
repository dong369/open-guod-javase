package datastructure.ch09_segment.ch01_segment_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/24 时间:21:01
 * @JDK 1.8
 * @Description 功能模块：线段树（区间树），对给定的区间进行更新、查询。进行区间染色的问题。
 * 有一面墙，长度为n，每次选择一段儿墙进行染色？
 * m次操作后，我们可以看见多少种颜色?
 * m次操作后，我们可以在，j区间内看见多少种颜色?
 * <p>
 * 对于给定区间
 * 更新:更新区间中一个元素或者一个区间的值
 * 查询一个区间[,j的最大值,最小值,或者区间数字和
 */
public class SegmentTree<E> {
    private E[] data;
    private E[] tree;
    private Merger<E> merger;

    public SegmentTree(E[] arr, Merger<E> merger) {
        this.merger = merger;
        data = (E[]) new Object[arr.length];
        // 数组的初始化
        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }
        // 线段树的初始化+构建
        tree = (E[]) new Object[arr.length * 4];
        buildSegmentTree(0, 0, arr.length - 1);
    }

    // 在treeIndex的位置创建表示区间[l...r]的线段树
    private void buildSegmentTree(int treeIndex, int l, int r) {
        if (l == r) {
            tree[treeIndex] = data[l];
            return;
        }
        int leftTreeIndex = leftChild(treeIndex);
        int rightTreeIndex = rightChild(treeIndex);
        // int mid = (l + r) / 2;
        int mid = l + (r - l) / 2;
        buildSegmentTree(leftTreeIndex, l, mid);
        buildSegmentTree(rightTreeIndex, mid + 1, r);
        // 进行求和
        tree[treeIndex] = merger.merge(tree[leftTreeIndex], tree[rightTreeIndex]);
    }

    public int getSize() {
        return data.length;
    }

    public E get(int index) {
        if (index < 0 || index >= data.length)
            throw new IllegalArgumentException("Index is illegal.");
        return data[index];
    }

    // 返回完全二叉树的数组表示中，一个索引所表示的元素的左孩子节点的索引
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    // 返回完全二叉树的数组表示中，一个索引所表示的元素的右孩子节点的索引
    private int rightChild(int index) {
        return 2 * index + 2;
    }

}
