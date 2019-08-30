package datastructure.ch12_avl.ch01_avl_base;

import java.util.ArrayList;

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
        // 节点的高度
        private int height;

        public Node(K k, V v) {
            this.k = k;
            this.v = v;
            this.left = this.right = null;
            this.height = 1;
        }
    }

    private Node root;
    private int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // 获取节点的高度
    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // 计算平衡因子
    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    // 判断是否是二分搜索树
    public boolean isBST() {
        ArrayList<K> keys = new ArrayList<>();
        inOrder(root, keys);
        for (int i = 1; i < keys.size(); i++) {
            if (keys.get(i - 1).compareTo(keys.get(i)) > 0) return false;
        }
        return true;
    }

    private void inOrder(Node node, ArrayList<K> keys) {
        if (node == null) {
            return;
        }
        inOrder(node.left, keys);
        keys.add(node.k);
        inOrder(node.right, keys);
    }

    // 判断是否是平衡二叉树
    public boolean isAVL() {
        return isAVL(root);
    }

    private boolean isAVL(Node node) {
        if (node == null) {
            return true;
        }
        int balanceFactor = getBalance(node);
        if (Math.abs(balanceFactor) > 1) {
            return false;
        }
        return isAVL(node.left) && isAVL(node.right);
    }

    public void add(K k, V v) {
        root = add(root, k, v);
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
        // 重新计算节点的高度值
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        // 计算平衡因子
        int balanceFactor = getBalance(node);
        if (Math.abs(balanceFactor) > 1) {
            System.out.println(balanceFactor);
        }
        return node;
    }
}