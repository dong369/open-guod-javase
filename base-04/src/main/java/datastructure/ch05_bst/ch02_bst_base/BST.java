package datastructure.ch05_bst.ch02_bst_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/2/4 时间:11:30
 * @JDK 1.8
 * @Description 功能模块：二分搜索树基础
 * 01、天然递归结构
 * 02、二分搜索树是二叉树
 * 03、二分搜索树的每个节点的值：大于左子树的所有值，小于右子树的所有值。
 * 04、要有可比性。
 */
public class BST<E extends Comparable<E>> {
    private class Node {
        public E e;
        Node left;
        Node right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    // 根节点
    public Node root;
    // 二分搜索树中的元素个数
    private int size;

    public BST() {
        this.root = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}