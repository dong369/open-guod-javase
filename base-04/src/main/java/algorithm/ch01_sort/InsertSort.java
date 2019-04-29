package algorithm.ch01_sort;

import java.util.Arrays;

/**
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/6/1 时间:12:37
 * @JDK 1.8
 * @Description 功能模块：排序-插入排序
 */
public class InsertSort {
    public static void sort(long[] arr) {
        // 数组长度，将这个提取出来是为了提高速度。
        int length = arr.length;
        // 要插入的数。
        long temp;
        int i;
        int j;
        for (i = 1; i < length; i++) {
            temp = arr[i];
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        long[] arr = {6, 1, 0, 4, 6, 2};
        InsertSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
