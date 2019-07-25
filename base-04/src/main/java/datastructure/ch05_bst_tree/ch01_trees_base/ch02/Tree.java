package datastructure.ch05_bst_tree.ch01_trees_base.ch02;

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
    public boolean delete(long value) {
        // 引用当前节点，从根节点开始
        Node current = root;
        // 应用当前节点的父节点
        Node parent = root;
        // 是否为左节点
        boolean isLeftChild = true;
        while (current.data != value) {
            // 进行比较，比较查找值和当前节点的大小
            if (current.data > value) {
                current = current.leftChild;
                isLeftChild = true;
            } else {
                current = current.rightChild;
                isLeftChild = false;
            }
            // 如果查找不到
            if (current == null) {
                return false;
            }
        }
        // 删除叶子节点，也就是该节点没有子节点
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                // 如果它是父节点的左节点
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return true;
    }

    /**
     * 查找中序后继
     *
     * @param delNode
     * @return
     */
    public Node getSuccessor(Node delNode) {
        Node successor = delNode;
        Node successorParent = delNode;
        Node current = delNode.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
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
            afterOrder(localNode.leftChild);
            // 后序遍历右子树
            afterOrder(localNode.rightChild);
            // 访问根节点
            System.out.println(localNode.data);
        }
    }
}
