package algorithm.ch01_sort;

import java.util.Arrays;

/**
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/6/1 时间:12:35
 * @JDK 1.8
 * @Description 功能模块：排序-选择排序
 */
public class SelectSort {
    public static void sort(long[] arr) {
        int length = arr.length;
        int k;
        long tmp;
        // 比较趟数
        for (int i = 0; i < length - 1; i++) {
            k = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
        }
    }

    public static void main(String[] args) {
        long[] arr = new long[]{4, 1, 0, 5, 8, 2, 7};
        SelectSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
