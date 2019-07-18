package datastructure.ch12_avl_tree.ch01_avl_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/28 时间:14:38
 * @JDK 1.8
 * @Description 功能模块：平衡树，最早的自平衡二分搜索树的结构。平衡因子（左子树高度-右子树高度）+节点的高度。
 * 发明人：G.M. Adelson-Velsky NH E. M. Landis
 * 1962年的论文首次提出
 * 最早的自平衡二分搜索树结构
 * 01、对于任意一个节点，左子树和右子树的高度差不能为超过1。
 * 02、符合二分搜索树。
 */
public class AVLTree<K extends Comparable<K>, V> {
    public class Node {
        public K k;
        public V v;
        private Node left;
        private Node right;

        public Node(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }

    private Node root;
    private int size;

    public void add(K k, V v) {
        add(root, k, v);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private Node add(Node node, K k, V v) {
        if (node == null) {
            size++;
            return new Node(k, v);
        }
        if (k.compareTo(node.k) < 0) {
            node.left = add(node.left, k, v);
        } else if (k.compareTo(node.k) > 0) {
            node.right = add(node.right, k, v);
        } else node.v = v;
        return node;
    }
}