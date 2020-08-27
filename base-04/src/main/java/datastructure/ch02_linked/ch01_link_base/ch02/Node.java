package datastructure.ch02_linked.ch01_link_base.ch02;

/**
 * @author guod
 * @version 1.0
 * 链表结点，相当于是车厢
 */
public class Node {
    /**
     * 数据域
     */
    private long data;
    /**
     * 后指针域
     */
    public Node next;
    /**
     * 前指针域
     */
    private Node previous;

    /**
     * 构造方法
     *
     * @param value
     */
    public Node(long value) {
        this.data = value;
    }

    /**
     * 显示数据
     */
    public void display() {
        System.out.println(data + " ");
    }
}
