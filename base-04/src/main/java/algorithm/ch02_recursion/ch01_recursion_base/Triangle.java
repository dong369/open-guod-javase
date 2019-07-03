package algorithm.ch02_recursion.ch01_recursion_base;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/1 时间:13:06
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Triangle {
    public static int getNumber(int n) {
        int total = 0;
        while (n > 0) {
            total = total + n;
            n--;
        }
        return total;
    }

    public static int getNumberByRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getNumberByRecursion(n - 1);
        }
    }
}
