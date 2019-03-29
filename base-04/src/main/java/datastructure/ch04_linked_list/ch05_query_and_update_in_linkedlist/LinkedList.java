package datastructure.ch04_linked_list.ch05_query_and_update_in_linkedlist;

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
            throw new IllegalArgumentException("Add failed. Illegal index.");
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

    // 获取指定索引位置的元素e
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Get fail");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    // 获取第一个的元素e
    public E getFirst() {
        return get(0);
    }

    // 获取最后一个的元素e
    public E getLast() {
        return get(size - 1);
    }

    // 修改链表的第index(0-based)个位置的元素为e，在链表中不是一个常用的操作，练习用：）
    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Illegal index.");
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++)
            cur = cur.next;
        cur.e = e;
    }

    // 查找链表中是否有元素e
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    // toString方法
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        // Node cur = dummyHead.next;
        // while (cur != null) {
        // res.append(cur).append("->");
        // cur = cur.next;
        // }
        for (Node cur = dummyHead.next; cur != null; cur = cur.next)
            res.append(cur).append("->");
        res.append("NULL");
        return res.toString();
    }
}
