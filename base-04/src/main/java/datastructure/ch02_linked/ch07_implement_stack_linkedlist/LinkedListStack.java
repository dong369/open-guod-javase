package datastructure.ch02_linked.ch07_implement_stack_linkedlist;

import datastructure.ch02_linked.ch06_query_and_update_in_linkedlist.LinkedList;
import datastructure.ch04_stacks.ch02_array_stack.Stack;

/**
 * @author guodd
 * @version 1.0
 */
public class LinkedListStack<E> implements Stack<E> {
    private LinkedList<E> list;

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
