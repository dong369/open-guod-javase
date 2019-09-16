package datastructure.ch05_stacks.ch02_array_stack;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/24 时间:16:23
 * @JDK 1.8
 * @Description 功能模块：栈（stack）：先进后出，后进先出
 */
public interface Stack<E> {
    /**
     * 添加元素（入栈-压栈）
     *
     * @param e
     */
    void push(E e);

    /**
     * 删除元素（出栈）
     *
     * @return
     */
    E pop();

    /**
     * 获取栈顶元素（top）
     *
     * @return
     */
    E peek();

    /**
     * 获取栈中元素个数
     *
     * @return
     */
    int getSize();

    /**
     * 栈是否为空
     *
     * @return
     */
    boolean isEmpty();

}
