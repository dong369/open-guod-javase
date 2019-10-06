package datastructure.ch02_linked.ch02_linked_list_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/30 时间:9:34
 * @JDK 1.8
 * @Description 功能模块：链表
 * 01、线性表
 * 02、递归结构
 */
public class LinkedList<E> {
    private class Node {
        // 数据域
        private E e;

        // 指针域（节点域），指向下一个节点（对象）;
        public Node next;

        public Node() {
            this(null, null);
        }

        public Node(E e) {
            this(e, null);
        }

        private Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
