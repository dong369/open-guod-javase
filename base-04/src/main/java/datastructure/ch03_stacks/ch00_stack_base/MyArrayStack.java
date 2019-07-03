package datastructure.ch03_stacks.ch00_stack_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/8 时间:8:39
 * @JDK 1.8
 * @Description 功能模块：顺序栈（stack）
 */
public class MyArrayStack {
    private long[] arr;

    public MyArrayStack() {
        arr = new long[0];
    }

    /**
     * 功能描述：压栈
     */
    public void push(long data) {
        long[] newArray = new long[arr.length + 1];
        // 拷贝
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        // 添加
        newArray[newArray.length - 1] = data;
        // 赋值
        arr = newArray;
    }

    /**
     * 功能描述：出栈
     */
    public void pop() {
        long[] newArray = new long[arr.length - 1];
        int delElement = arr.length;
        // 替换元素
        for (int i = 0; i < newArray.length; i++) {
            if (i < delElement) {
                newArray[i] = arr[i];
            } else {
                newArray[i] = arr[i + 1];
            }
        }
        arr = newArray;
    }

    public void show() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]);
        }
    }
}
