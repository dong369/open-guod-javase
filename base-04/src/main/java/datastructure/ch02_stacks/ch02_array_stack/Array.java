package datastructure.ch02_stacks.ch02_array_stack;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/24 时间:16:26
 * @JDK 1.8
 * @Description 功能模块：泛型数组
 */
public class Array<E> {
    private E[] data;
    private int size;

    public Array() {
        data = (E[]) new Object[10];
    }

    public Array(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public void add(int index, E e) {
        if (index < 0 || index > data.length)
            throw new IllegalArgumentException("Add fail");
        for (int i = size - 1; i >= index; i++) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public E remove(int index) {
        E ret = data[index];
        if (index < 0 || index > data.length)
            throw new IllegalArgumentException("Remove fail");
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return ret;
    }

    public void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size);
    }

    public E getLast() {
        return data[size - 1];
    }
}