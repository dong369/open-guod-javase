package datastructure.ch02_linked.ch01_link_base.ch03;

/**
 * @author guod
 * @version 1.0
 * 双端链表
 */
public class FirstLastLinkList {
    /**
     * 头结点
     */
    private Node first;
    /**
     * 尾结点
     */
    private Node last;

    public FirstLastLinkList() {
        first = null;
        last = null;
    }

    /**
     * 插入一个结点，在头结点后进行插入
     */
    public void insertFirst(long value) {
        Node node = new Node(value);
        if (isEmpty()) {
            last = node;
        }
        node.next = first;
        first = node;
    }

    /**
     * 插入一个结点，在尾结点后进行插入
     *
     * @param value
     */
    public void insertLast(long value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
    }

    /**
     * 判断是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return (first == null);
    }
}
