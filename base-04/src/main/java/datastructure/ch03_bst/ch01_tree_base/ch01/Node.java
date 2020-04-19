package datastructure.ch03_bst.ch01_tree_base.ch01;

/**
 * 二叉树节点
 *
 * @author guodd
 * @version 3.0
 */
public class Node {
    // 数据项
    public long data;
    // 左子节点
    public Node leftChild;
    // 右子节点
    public Node rightChild;

    /**
     * 构造方法
     *
     * @param data
     */
    public Node(long data) {
        this.data = data;
    }
}
