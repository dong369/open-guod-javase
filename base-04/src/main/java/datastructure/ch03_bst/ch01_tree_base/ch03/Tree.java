package datastructure.ch03_bst.ch01_tree_base.ch03;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/18 时间:8:45
 * @JDK 1.8
 * @Description 功能模块：二叉树
 */
public class Tree {
    // 根节点
    public Node root;

    /**
     * 插入节点
     *
     * @param value
     */
    public void insert(long value) {
        // 封装节点
        Node newNode = new Node(value);
        // 指向当前节点的引用
        Node current = root;
        // 指向父节点的引用
        Node parent;
        if (root == null) {
            root = newNode;
            return;
        } else {
            while (true) {
                // 父节点指向当前节点
                parent = current;
                // 如果当前指向的数据比插入的要大，向左走
                if (current.data > value) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * 查找节点
     *
     * @param value
     */
    public Node find(long value) {
        // 引用当前节点，从根节点开始
        Node current = root;
        // 循环，只要查找的值不等于当前节点的数据项
        while (current.data != value) {
            // 进行比较，比较查找值和当前节点的大小
            if (current.data > value) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            // 如果查找不到
            if (current == null) {
                return null;
            }
        }
        return current;
    }

}
