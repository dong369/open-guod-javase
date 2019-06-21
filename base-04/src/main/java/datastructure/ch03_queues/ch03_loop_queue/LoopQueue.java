package datastructure.ch03_queues.ch03_loop_queue;

import datastructure.ch03_queues.ch02_array_queue.Queue;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/29 时间:8:12
 * @JDK 1.8
 * @Description 功能模块：循环队列
 */
public class LoopQueue<E> implements Queue<E> {
    // 队数据
    private E[] data;
    // 功能描述：队头
    private int front;
    // 功能描述：队尾
    private int tail;
    // 功能描述：位置
    private int size;

    // 无参构造器
    public LoopQueue() {
        this(10);
    }

    // 初始化容量的构造器
    public LoopQueue(int capacity) {
        // 实际创建的容量是capacity+1，因为判断队满时浪费一个（tail+1==front）
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    // 获取容量
    public int getCapacity() {
        return data.length - 1;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty.");
        }
        return data[front];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front) {
            resize(getCapacity() * 2);
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty.");
        }
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return ret;
    }

    // 数组扩容方法
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d , capacity = %d\n", size, getCapacity()));
        res.append("front [");
        for (int i = front; i != tail; i = (i + 1) % data.length) {
            res.append(data[i]);
            if ((i + 1) % data.length != tail)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }
}