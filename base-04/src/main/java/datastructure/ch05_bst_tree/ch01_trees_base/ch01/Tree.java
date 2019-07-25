package datastructure.ch05_bst_tree.ch01_trees_base.ch01;

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

    /**
     * 删除节点
     *
     * @param value
     */
    public void delete(long value) {

    }

    /**
     * 前序遍历
     *
     * @param localNode
     */
    public void frontOrder(Node localNode) {
        if (localNode != null) {
            // 访问根节点
            System.out.println(localNode.data);
            // 前序遍历左子树
            frontOrder(localNode.leftChild);
            // 前序遍历右子树
            frontOrder(localNode.rightChild);
        }
    }

    /**
     * 中序遍历
     *
     * @param localNode
     */
    public void inOrder(Node localNode) {
        if (localNode != null) {
            // 中序遍历左子树
            inOrder(localNode.leftChild);
            // 访问根节点
            System.out.println(localNode.data);
            // 中序遍历右子树
            inOrder(localNode.rightChild);
        }
    }

    /**
     * 后序遍历
     *
     * @param localNode
     */
    public void afterOrder(Node localNode) {
        if (localNode != null) {
            // 后序遍历左子树
            inOrder(localNode.leftChild);
            // 后序遍历右子树
            inOrder(localNode.rightChild);
            // 访问根节点
            System.out.println(localNode.data);
        }
    }
}
