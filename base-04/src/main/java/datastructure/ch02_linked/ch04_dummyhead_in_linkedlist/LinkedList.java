package datastructure.ch02_linked.ch04_dummyhead_in_linkedlist;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/30 时间:9:34
 * @JDK 1.8
 * @Description 功能模块：设置链表的虚拟头节点
 */
public class LinkedList<E> {
    private class Node {
        // 数据域
        private E e;
        // 指针域（节点域），指向下一个节点（对象）
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    // 链表的头
    private Node dummyHead;
    // 链表中的元素个数
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    // 获取链表中的元素个数
    public int getSize() {
        return size;
    }

    // 返回链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 在链表的index(0-based)位置添加新的元素e，在链表中不是一个常用的操作，练习用
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("ch04 Add failed. Illegal index.");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;
    }

    // 在链表头添加新的元素e
    public void addFirst(E e) {
        add(0, e);
    }

    // 在链表末尾添加新的元素e
    public void addLast(E e) {
        add(size, e);
    }
}
