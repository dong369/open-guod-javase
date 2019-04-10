package datastructure.ch02_stacks.ch02_array_stack;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/24 时间:16:29
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(10);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.getSize());
        System.out.println(arrayStack.peek());
    }
}