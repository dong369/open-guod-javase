package algorithm.ch02_recursion.ch02_arrays_sum;

/**
 * 对数组进行求和操作
 *
 * @author guodd
 * @version 1.0
 */
public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    // 宏观语意，计算arr
    private static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return sum(num - 1) + num;
    }
}
