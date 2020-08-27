package datastructure.ch02_linked.ch01_link_base.ch01;

/**
 * @author guod
 * @version 3.0
 * 链节点，相当于火车，只关心火车的头部
 */
public class LinkList {
    private Node first;

    /**
     * 构造方法
     */
    public LinkList() {
        first = null;
    }

    /**
     * 从链表的头部添加数据
     *
     * @param value
     */
    public void insertFirst(long value) {
        Node node = new Node(value);
        node.next = first;
        // node作为头节点
        first = node;
    }


    /**
     * 删除头链表
     *
     * @return
     */
    public Node deleteFirst() {
        Node tmp = first;
        first = tmp.next;
        return tmp;
    }

    /**
     * 查找方法
     *
     * @param value
     * @return
     */
    public Node find(long value) {
        Node current = first;
        while (current.data != value) {
            if (current.next == null) {
                return null;
            }
            current = current.next;
        }
        return current;
    }

    /**
     * 删除
     *
     * @param value
     * @return
     */
    public Node delete(long value) {
        Node current = first;
        Node previous = first;
        while (current.data != value) {
            if (current.next == null) {
                return null;
            }
            previous = current;
            current = current.next;
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    /**
     * 显示方法
     */
    public void display() {
        Node current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }
}
