package datastructure.ch01_arrays.ch02_create_our_own_array;

/**
 * project - 数据结构+数组
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/23 时间:9:13
 * @JDK 1.8
 * @Description 功能模块：data存储数据、capacity数据容量、size已经占用的数据容量
 * 01、线性表
 * 02、索引有语意
 */
public class Array {
    // data属性表示存放数组的元素，
    private int[] data;

    // 数组中元素的个数（特别注意不是索引，size=index+1）
    private int size;

    // 无参数的构造函数，默认数组的容量capacity=10
    public Array() {
        // data = new int[10];
        this(10);
    }

    // 构造函数，传入数组的容量capacity构造Array
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // 获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize() {
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }
}
