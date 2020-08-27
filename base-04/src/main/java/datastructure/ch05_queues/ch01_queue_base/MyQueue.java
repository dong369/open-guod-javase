package datastructure.ch05_queues.ch01_queue_base;

/**
 * project - 数据结构-简单队列
 *
 * @author guod
 * @version 1.0
 */
public class MyQueue {
    /**
     * 底层使用数组
     */
    private long[] arr;
    /**
     * 有效长度
     */
    private int elements;
    /**
     * 队头
     */
    private int front;
    /**
     * 队尾
     */
    private int end;

    /**
     * 默认构造方法
     */
    public MyQueue() {
        arr = new long[10];
        elements = 0;
        front = 0;
        end = -1;
    }

    /**
     * 带参数的构造方法，参数为数组的大小
     *
     * @param maxsize
     */
    public MyQueue(int maxsize) {
        arr = new long[maxsize];
        elements = 0;
        front = 0;
        end = -1;
    }

    /**
     * 添加数据,从队尾插入
     */
    public void insert(long value) {
        arr[++end] = value;
        elements++;
    }

    /**
     * 删除数据，从队头删除
     */
    public long remove() {
        elements--;
        return arr[front++];
    }

    /**
     * 查看数据，从队头查看
     */
    public long peek() {
        return arr[front];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return elements == 0;
    }

    /**
     * 判断是否满了
     */
    public boolean isFull() {
        return elements == arr.length;
    }
}
