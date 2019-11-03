package datastructure.ch04_stacks.ch02_array_stack;

/**
 * project - 栈（stack）
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/24 时间:16:25
 * @JDK 1.8
 * @Description 功能模块：顺序栈的实现
 */
public class ArrayStack<E> implements Stack<E> {
    // 自己封装的动态数组
    private Array<E> array;

    public ArrayStack() {
        array = new Array<>(10);
    }

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    public int getCapacity() {
        return array.getCapacity();
    }
}
