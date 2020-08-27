package datastructure.ch02_linked.ch01_link_base.ch01;

/**
 * @author guod
 * @version 3.0
 * 链节点，相当于火车的车厢
 */
public class Node {
    /**
     * 数据域
     */
    public long data;
    /**
     * 指针域（节点域），指向下一个节点（对象）
     */
    public Node next;

    public Node() {
    }

    public Node(long value) {
        this.data = value;
    }

    /**
     * 显示方法
     */
    public void display() {
        System.out.print(data + " ");
    }
}
