package datastructure.ch03_stacks.ch03_linked_stack;

import datastructure.ch02_linked.ch06_query_and_update_in_linkedlist.LinkedList;
import datastructure.ch03_stacks.ch02_array_stack.Stack;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/4/10 时间:16:04
 * @JDK 1.8
 * @Description 功能模块：
 */
public class LinkedStack<E> implements Stack<E> {
    private LinkedList<E> linkedList;

    public LinkedStack() {
        linkedList = new LinkedList();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }
}
