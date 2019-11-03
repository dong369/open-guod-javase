package datastructure.ch04_stacks.ch00_stack_base;

/**
 * project - 数据结构
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/1 时间:12:42
 * @JDK 1.8
 * @Description 功能模块：自定义栈的测试类
 */
public class MainStackTest {
    public static void main(String[] args) {
        /*=====================01基础方法=======================*/
        MyArrayStack myArrayStack = new MyArrayStack();
        myArrayStack.push(1);
        myArrayStack.push(2);
        myArrayStack.pop();
        myArrayStack.show();
        /*=====================02=======================*/
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}