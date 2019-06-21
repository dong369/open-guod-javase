package datastructure.ch01_arrays.ch01_array_basics;

/**
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/5/31 时间:12:37
 * @JDK 1.8
 * @Description 功能模块：数组的基本操作封装（索引index；有效长度elements）
 */
public class MyArray {
	/**
	 * 定义一个数组
	 */
	private long[] arr;

	/**
	 * 数组的有效长度（size）
	 */
	private int elements;

	/**
	 * 设置默认容量
	 */
	public MyArray() {
		arr = new long[50];
	}

	/**
	 * @param maxSize 容量（capacity）
	 */
	public MyArray(int maxSize) {
		arr = new long[maxSize];
		elements = 0;
	}

	/**
	 * @Description 功能：容量大小
	 */
	public int getCapacity() {
		return arr.length;
	}

	/**
	 * @Description 功能：数组的有效长度
	 */
	public int getSize() {
		return elements;
	}

	/**
	 * 输出数据
	 */
	public void display() {
		System.out.print("[");
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}

	/**
	 * 添加数据
	 *
	 * @param value（插入值）
	 */
	public void insertLast(long value) {
		if (elements == arr.length)
			throw new IllegalArgumentException("");
		arr[elements] = value;
		elements++;
	}

	/**
	 * 删除数据
	 *
	 * @param index
	 */
	public void delete(int index) {
		if (index < 0 || index > elements) {
			throw new ArrayIndexOutOfBoundsException("数组越界");
		} else {
			for (int i = index; i < elements; i++) {
				arr[i] = arr[i + 1];
			}
			elements--;
		}
	}

	/**
	 * 更新数据
	 *
	 * @param index
	 * @param value
	 */
	public void update(int index, long value) {
		if (index < 0 || index > elements) {
			throw new ArrayIndexOutOfBoundsException("数组越界");
		} else {
			arr[index] = value;
		}
	}

	/**
	 * 线性查找：通过index索引查询数据值
	 *
	 * @param index
	 * @return
	 */
	public long getValue(int index) {
		if (index < 0 || index > elements) {
			throw new ArrayIndexOutOfBoundsException("数组越界");
		} else {
			return arr[index];
		}
	}

	/**
	 * 线性查找：通过value查找索引位置
	 *
	 * @param value
	 * @return
	 */
	public int getIndex(long value) {
		int i;
		for (i = 0; i < elements; i++) {
			if (value == arr[i]) {
				break;
			}
		}
		if (i == elements) {
			return -1;
		} else {
			return i;
		}
	}

}
