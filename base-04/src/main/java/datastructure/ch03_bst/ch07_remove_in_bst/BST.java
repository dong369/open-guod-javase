package datastructure.ch03_bst.ch07_remove_in_bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/2/4 时间:11:30
 * @JDK 1.8
 * @Description 功能模块：二分搜索树基删除元素
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

    // 向二分搜索树中添加新的元素e
    public void add(E e) {
        root = add(root, e);
    }

    // 向以node为根的二分搜索树中插入元素e，递归算法
    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            Node nodeRet = new Node(e);
            return nodeRet;
        }
        if (e.compareTo(node.e) < 0)
            node.left = add(node.left, e);
        else if (e.compareTo(node.e) > 0)
            node.right = add(node.right, e);
        return node;
    }

    // 看二分搜索树中是否包含元素e
    public boolean contains(E e) {
        return contains(root, e);
    }

    // 看以node为根的二分搜索树中是否包含元素e, 递归算法
    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        } else  // e.compareTo(node.e) > 0
            return contains(node.right, e);
    }

    // 二分搜索树的前序遍历递归书写（深度优先遍历）
    public void preOrder() {
        preOrder(root);
    }

    // 前序遍历以node为根的二分搜索树, 递归算法（深度优先遍历）
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    // 二分搜索树的前序遍历非递归书写，通过stack
    private void preOrderNR() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node cur = stack.peek();
            System.out.println(cur);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
    }

    // 中序遍历（深度优先遍历）
    private void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (root == null) return;
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    // 中序遍历非递归实现
    private void inOrderNR() {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (true) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            if (stack.isEmpty()) {
                break;
            }

            cur = stack.pop();
            System.out.println(cur.e);
            cur = cur.right;
        }
    }

    // 后序遍历（深度优先遍历）
    private void lateOrder() {
        lateOrder(root);
    }

    private void lateOrder(Node node) {
        if (root == null) return;
        lateOrder(node.left);
        lateOrder(node.right);
        System.out.println(node.e);
    }

    // 后序遍历非递归实现
    private void lateOrderNR() {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Stack<Node> out = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            out.push(cur);

            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }

        while (!out.isEmpty()) {
            Node cur = out.pop();
            System.out.println(cur.e);
        }
    }

    // 层序遍历（广度优先遍历）
    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node cur = queue.remove();
            System.out.println(cur.e);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
    }

    // 树中的最大值
    public E findMax() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty!");
        }
        return findMax(root).e;
    }

    private Node findMax(Node node) {
        if (node.right == null) {
            return node;
        }
        return findMax(node.right);
    }

    // 树中的最小值
    public E findMin() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty!");
        }
        return findMin(root).e;
    }

    private Node findMin(Node node) {
        if (node.left == null) {
            return node;
        }
        return findMin(node.left);
    }

    // 删除最大值
    public E removeMax() {
        E ret = findMax();
        root = removeMax(root);
        return ret;
    }

    private Node removeMax(Node node) {
        if (node.right == null) {
            Node nodeRight = node.left;
            node.left = null;
            size--;
            return nodeRight;
        }
        node.right = removeMax(node.right);
        return node;
    }

    // 删除最小值
    public E removeMin() {
        E ret = findMin();
        root = removeMin(root);
        return ret;
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            Node nodeRight = node.right;
            node.right = null;
            size--;
            return nodeRight;
        }
        node.left = removeMin(node.left);
        return node;
    }

    // 1962年, Hibbard提出- Hibbard deletion
    public void remove(E e) {
        root = remove(root, e);
    }

    private Node remove(Node node, E e) {
        if (node == null) {
            return null;
        }
        if (e.compareTo(node.e) < 0) {
            node.left = remove(node.left, e);
            return node;
        } else if (e.compareTo(node.e) > 0) {
            node.right = remove(node.right, e);
            return node;
        } else { // e == node.e，需要进行删除操作
            // 01左子树为空
            if (node.left == null) {
                Node nodeRight = node.right;
                node.right = null;
                size--;
                return nodeRight;
            }
            // 02右子树为空
            if (node.right == null) {
                Node nodeLeft = node.left;
                node.left = null;
                size--;
                return nodeLeft;
            }
            // 03都不是空
            Node successor = findMin(node.right);
            successor.right = removeMin(node.right);
            size++;
            successor.left = node.left;
            node.left = node.right = null;
            size--;
            return successor;
        }
    }

    // （3）求树的节点数；
    // （4）求树的叶子数；

    // 树的深度
    public int getDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = getDepth(node.left) + 1;
        int rightDepth = getDepth(node.left) + 1;
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }

    // 求二叉树第k层的节点个数
    public int getKLevel(Node node, int k) {
        if (node == null || k <= 0) {
            return 0;
        }
        if (k == 1)
            return 1;
        return getKLevel(node.left, k - 1) + getKLevel(node.right, k - 1);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    // 生成以node为根节点，深度为depth的描述二叉树的字符串
    private void generateBSTString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(generateDepthString(depth)).append("null \n");
            return;
        }
        res.append(generateDepthString(depth)).append(node.e).append("\n");
        generateBSTString(node.left, depth + 1, res);
        generateBSTString(node.right, depth + 1, res);
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++)
            res.append("--");
        return res.toString();
    }
}