package datastructure.ch05_bst.ch01_trees_base.ch02;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/18 时间:8:42
 * @JDK 1.8
 * @Description 功能模块：二叉树节点
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
