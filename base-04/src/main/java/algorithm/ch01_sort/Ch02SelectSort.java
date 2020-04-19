package algorithm.ch01_sort;

import java.util.Arrays;

/**
 * 排序-选择排序
 *
 * @author guod
 * @version 3.0
 */
public class Ch02SelectSort {
    private static void sort(long[] arr) {
        // 比较趟数
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            long tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
        }
    }

    public static void main(String[] args) {
        long[] arr = new long[]{4, 1, 0, 5, 8, 2, 7};
        Ch02SelectSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
