package datastructure.ch05_binary_search_tree.ch02_binary_search_tree_basics;

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
        public E e;
        public Node left;
        public Node right;

        public Node(E e) {
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
}