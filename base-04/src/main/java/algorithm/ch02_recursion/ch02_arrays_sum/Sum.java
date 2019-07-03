package algorithm.ch02_recursion.ch02_arrays_sum;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/2 时间:10:53
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    private static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return sum(num - 1) + num;
    }
}
