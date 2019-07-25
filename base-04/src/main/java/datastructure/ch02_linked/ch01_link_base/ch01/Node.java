package datastructure.ch02_linked.ch01_link_base.ch01;

/**
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/5/31 时间:12:40
 * @JDK 1.8
 * @Description 功能模块：链节点，相当于火车的车厢
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
