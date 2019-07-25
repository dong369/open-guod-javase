package datastructure.ch01_arrays.ch07_dynamic_array;

/**
 * project - 数据结构+数组
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/23 时间:9:13
 * @JDK 1.8
 * @Description 功能模块：自动扩容数组
 */
public class Array<E> {
    // 数据
    private E[] data;
    // 元素个数
    private int size;

    // 无参数的构造函数，默认数组的容量capacity=10
    public Array() {
        // data = (E[]) new Object[10];
        this(10);
    }

    // 构造函数，传入数组的容量capacity构造Array
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    // 构造函数，直接传入一个数组对象
    public Array(E[] arr) {
        data = (E[]) new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }
        size = arr.length;
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
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }
        if (size == data.length) {
            reSize(getCapacity() * 2);
        }
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = e;
        size++;
    }

    // 在所有元素前添加一个新元素
    public void addFirst(E e) {
        add(0, e);
    }

    // 向所有元素后添加一个新元素
    public void addLast(E e) {
        add(size, e);
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        // 记录删除的数据
        E ret = data[index];
        for (int i = index; i <= size - 1; i++)
            data[i] = data[i + 1];
        size--;
        // loitering objects != memory leak（内存泄漏）
        data[size] = null;
        // 进行缩容操作
        // size=10     capacity=40
        // 10==10*（40/4）
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0)
            reSize(data.length / 2);
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst() {
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast() {
        return remove(size - 1);
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    // 从数组中删除元素e
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1)
            remove(index);
    }

    // 修改index索引位置的元素为e
    public void set(int index, E e) {
        if (size < 0 || size > data.length) {
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }

    // 获取index索引位置的元素
    public E get(int index) {
        if (size < 0 || size > data.length) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    // 获取第一个元素
    public E getFirst() {
        return get(0);
    }

    // 获取最后一个元素
    public E getLast() {
        return get(size);
    }

    // 查找数组中是否有元素e
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    // 动态扩容数组
    private void reSize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        // 进行值的copy操作
        if (size >= 0) System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    // 元素交换操作
    public void swap(int i, int j) {
        if (i < 0 || i >= size || j < 0 || j >= size)
            throw new IllegalArgumentException("Index is illegal.");
        E t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    // 重写toString
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("ch07 Array: size = %d , capacity = %d\n", size, data.length));
        res.append("Arrays：[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
}
