package datastructure.ch05_stacks.ch00_stack_base;

/**
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/5/31 时间:12:43
 * @JDK 1.8
 * @Description 功能模块：数据结构-栈（栈顶元素；数组实现）
 * 01、线性表
 * 02、抽象数据类型
 */
public class MyStack {
    private long[] arr;
    /**
     * 栈顶指针
     */
    private int top;

    /**
     * 默认的构造方法
     */
    public MyStack() {
        arr = new long[10];
        top = -1;
    }

    /**
     * 带参数构造方法，参数为数组初始化大小
     */
    public MyStack(int maxsize) {
        arr = new long[maxsize];
        top = -1;
    }

    /**
     * 添加数据（压栈）
     */
    public void push(int value) {
        arr[++top] = value;
    }

    /**
     * 移除数据（出栈）
     */
    public long pop() {
        return arr[top--];
    }

    /**
     * 查看数据
     */
    public long peek() {
        return arr[top];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 判断是否满了
     */
    public boolean isFull() {
        return top == arr.length - 1;
    }
}
