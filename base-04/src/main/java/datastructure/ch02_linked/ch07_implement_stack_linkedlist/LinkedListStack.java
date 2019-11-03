package datastructure.ch02_linked.ch07_implement_stack_linkedlist;

import datastructure.ch02_linked.ch06_query_and_update_in_linkedlist.LinkedList;
import datastructure.ch04_stacks.ch02_array_stack.Stack;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/30 时间:10:47
 * @JDK 1.8
 * @Description 功能模块：
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
