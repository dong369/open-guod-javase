package datastructure.ch01_arrays.ch03_add_element_in_array;

/**
 * project - 数据结构+数组
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/23 时间:9:13
 * @JDK 1.8
 * @Description 功能模块：数组的插入操作
 */
public class Array {
    private int[] data;
    private int size;

    // 无参数的构造函数，默认数组的容量capacity=10
    public Array() {
        data = new int[10];
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

    // 在index索引的位置插入一个新元素e
    public void add(int index, int e) {
        if (size == getCapacity()) {
            throw new IllegalArgumentException("ch03 Add failed. Array is full.");
        }
        // index最大可以取到size，就是在最后添加元素，如果比size大就是不连续的
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("ch03 Add failed. Require index >= 0 and index <= size.");
        }
        // 进行数组的拷贝，可以使用JDK自带的方法。
        for (int i = size - 1; i >= index; i--) {
            // 目标位置之后(包括目标位置)的元素后移
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    // 向所有元素后添加一个新元素
    public void addLast(int e) {
        if (size == data.length)
            throw new IllegalArgumentException("AddLast failed. Array is full.");
        data[size] = e;
        size++;
    }

    // 在所有元素前添加一个新元素
    public void addFirst(int e) {
        add(0, e);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("ch03 Array: size = %d , capacity = %d\n", size, data.length));
        res.append("ch03 array：[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
}
