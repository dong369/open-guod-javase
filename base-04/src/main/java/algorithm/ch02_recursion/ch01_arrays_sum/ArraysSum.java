package algorithm.ch02_recursion.ch01_arrays_sum;

/**
 * project -
 *
 * @author Administrator
 * @version 1.0
 * @date 日期:2019/2/4 时间:10:07
 * @JDK 1.8
 * @Description 功能模块：数组求和操作使用递归方式
 */
public class ArraysSum {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 4};
        System.out.println(sum(a));

    }

    public static int sum(int[] arr) {
        return sum(arr, 0);

    }

    public static int sum(int[] arr, int l) {
        if (arr.length == l) {
            return 0;
        }
        return arr[l] + sum(arr, l + 1);
    }
}

