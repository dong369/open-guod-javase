package algorithm.ch02_recursion.ch03_fib;

/**
 * Fibonacci数列（递归应用-画图理解）1,1,2,3,5,8
 *
 * @author guod
 * @version 1.0
 * 01确定参数
 * 02确定返回值
 */
public class Fib02 {
    public static void main(String[] args) {
        int number = getNumber(5);
        System.out.println(number);
    }

    private static int getNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return getNumber(n - 1) + getNumber(n - 2);
        }
    }
}
