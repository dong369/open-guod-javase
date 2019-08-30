package datastructure.ch13_red_black.ch01_red_black_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/28 时间:14:39
 * @JDK 1.8
 * @Description 功能模块：红黑树，理解了2-3树和红黑树之间的关系（Robert Sedgewick & Donald knuth），2-3树是一棵绝对平衡的树。
 * 每个节点或者是红色的,或者是黑色的
 * 01、根节点是黑色的
 * 02、每一个叶子节点(最后的空节点)是黑色的
 * 03、如果一个节点是红色的,那么他的孩子节点都是黑色的
 * 04、从任意一个节点到叶子节点,经过的黑色节点是一样的
 * 红黑树是二分搜索树。
 */
public class RBTree<K extends Comparable<K>, V> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    public class Node {
        public K key;
        public V value;
        public Node left, right;
        public boolean color;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
            color = RED;
        }
    }

    private Node root;
    private int size;

    private RBTree() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isRed(Node node) {
        if (node == null) {
            return BLACK;
        }
        return node.color;
    }
}
