package algorithm.ch01_sort;

import java.util.Arrays;

/**
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/6/1 时间:12:29
 * @JDK 1.8
 * @Description 功能模块：排序-冒泡排序
 */
public class Ch01BubbleSort {
    private static int[] bubbleSort(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {1, 8, 30, -1, 88, 1, 9};
        int[] ints = bubbleSort(a);
        System.out.println(Arrays.toString(ints));
    }
}
