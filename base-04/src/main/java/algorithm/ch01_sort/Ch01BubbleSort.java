package algorithm.ch01_sort;

import java.util.Arrays;

/**
 * 排序-冒泡排序
 *
 * @author guod
 * @version 3.0
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
