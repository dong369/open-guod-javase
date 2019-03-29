package datastructure.ch01_arrays.ch00_array_base;

/**
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/5/31 时间:12:37
 * @JDK 1.8
 * @Description 功能模块：有序数组，插入的时候进行判断
 */
public class MyArrayOrder {
    /**
     * 定义一个数组
     */
    private long[] arr;
    /**
     * 数组的有效长度
     */
    private int elements;

    public MyArrayOrder() {
        arr = new long[50];
    }

    public MyArrayOrder(int maxSize) {
        arr = new long[maxSize];
    }

    /**
     * 添加有序数组
     *
     * @param value
     */
    public void insertOrder(long value) {
        int i;
        for (i = 0; i < elements; i++) {
            if (arr[i] > value) {
                break;
            }
        }
        for (int j = elements; j > i; j--) {
            arr[j] = arr[j - 1];
        }
        arr[i] = value;
        elements++;
    }

    /**
     * 二分法查找（前提条件：必须排好序）
     *
     * @param value
     * @return
     */
    public int binarySearch(long value) {
        // 中间值
        int middle = 0;
        int low = 0;
        int pow = elements;
        while (true) {
            middle = (low + pow) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (low > pow) {
                return -1;
            } else {
                // 选择左右
                if (arr[middle] > value) {
                    pow = middle - 1;
                } else {
                    low = middle + 1;
                }
            }
        }
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

}
