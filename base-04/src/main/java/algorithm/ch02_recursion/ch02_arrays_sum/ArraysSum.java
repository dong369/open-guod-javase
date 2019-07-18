package algorithm.ch02_recursion.ch02_arrays_sum;

/**
 * project -
 *
 * @author guodd
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

    // 从用户的角度出发，用户只需要传入一个数组，然后得到数组的和
    private static int sum(int[] arr) {
        return sum(arr, 0);
    }

    // 宏观语意，计算[l,n)这个区间内的所有值
    private static int sum(int[] arr, int l) {
        // 最基本的问题
        if (arr.length == l) return 0;
        // 子逻辑，计算arr从l到n的值
        // 简写：arr[l] + sum(arr, l + 1)
        int x = sum(arr, l + 1);
        int res = arr[l] + x;
        return res;
    }
}

