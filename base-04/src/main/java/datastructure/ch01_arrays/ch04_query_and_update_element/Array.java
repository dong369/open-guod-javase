package datastructure.ch01_arrays.ch04_query_and_update_element;

/**
 * project - 数据结构+数组
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/23 时间:9:13
 * @JDK 1.8
 * @Description 功能模块：更改指定元素
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

    // 向所有元素后添加一个新元素
    public void addLast(int e) {
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(int e) {
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, int e) {
        if (size == data.length)
            throw new IllegalArgumentException("ch04 Add failed. Array is full.");
        if (index < 0 || index > size)
            throw new IllegalArgumentException("ch04 Add failed. Require index >= 0 and index <= size.");
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = e;
        size++;
    }

    // 获取index索引位置的元素
    public int get(int index) {
        if (size < 0 || size > data.length) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    // 修改index索引位置的元素为e
    public void set(int index, int e) {
        if (size < 0 || size > data.length) {
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
}
