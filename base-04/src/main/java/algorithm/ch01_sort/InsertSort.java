package algorithm.ch01_sort;

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
        int n = arr.length;
        int i, j;
        long temp;
        for (i = 1; i < n; i++) {
            temp = arr[i];
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }
}
