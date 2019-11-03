package datastructure.ch02_linked.ch08_implement_queue_in_linkedlist;

import datastructure.ch05_queues.ch02_array_queue.Queue;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/30 时间:10:49
 * @JDK 1.8
 * @Description 功能模块：
 */
public class LinkedListQueue<E> implements Queue<E> {
    public class Node {
        public E e;
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

    public Node head, tail;
    public int size;

    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("");
        }
        Node retNode = head;
        head = head.next;
        retNode.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return retNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("");
        }
        return head.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
