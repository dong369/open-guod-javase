package datastructure.ch05_bst.ch04_improved_add_elements_in_bst;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/2/4 时间:11:30
 * @JDK 1.8
 * @Description 功能模块：二分搜索树基础
 */
public class BST<E extends Comparable<E>> {
    private class Node {
        private E e;
        private Node left;
        private Node right;

        private Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
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

    // 向二分搜索树中添加新的元素e
    public void add(E e) {
        root = add(root, e);
    }

    // 向以node为根的二分搜索树中插入元素e，递归算法
    // 返回插入新节点后二叉搜索树的根
    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0)
            node.left = add(node.left, e);
        else if (e.compareTo(node.e) > 0)
            node.right = add(node.right, e);
        return node;
    }
}