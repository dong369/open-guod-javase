package datastructure.ch01_arrays.ch05_contain_find_and_remove;

/**
 * project - 数据结构+数组
 *
 * @author guodd
 * @version 1.0
 * 进行数据的查找和删除
 */
public class Array {
    // 数据
    private int[] data;
    // 元素个数
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

    // 获取第一个元素
    public int getFirst() {
        return get(0);
    }

    // 获取最后一个元素
    public int getLast() {
        return get(size);
    }

    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, int e) {
        if (size == getCapacity())
            throw new IllegalArgumentException("Add failed. Array is full.");
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = e;
        size++;
    }

    // 在所有元素前添加一个新元素
    public void addFirst(int e) {
        add(0, e);
    }

    // 向所有元素后添加一个新元素
    public void addLast(int e) {
        if (size == data.length)
            throw new IllegalArgumentException("AddLast failed. Array is full.");
        data[size] = e;
        size++;
    }

    // 获取index索引位置的元素
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    // 修改index索引位置的元素为e
    public void set(int index, int e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public int remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        // 记录删除的数据
        int ret = data[index];
        // index之后的元素都向前移动一个位置
        for (int i = index + 1; i < size; i++)
            data[i - 1] = data[i];
        size--;
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public int removeFirst() {
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public int removeLast() {
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(int e) {
        int index = find(e);
        if (index != -1)
            remove(index);
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
