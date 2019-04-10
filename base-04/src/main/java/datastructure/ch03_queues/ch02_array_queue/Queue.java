package datastructure.ch03_queues.ch02_array_queue;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/25 时间:9:50
 * @JDK 1.8
 * @Description 功能模块：
 */
public interface Queue<E> {
    /**
     * 入队
     *
     * @param e
     */
    void enqueue(E e);

    /**
     * 出队
     *
     * @return
     */
    E dequeue();

    /**
     * 获取队列中元素的个数
     *
     * @return
     */
    int getSize();

    /**
     * 判断队列是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 获取队首元素
     *
     * @return
     */
    E getFront();
}
