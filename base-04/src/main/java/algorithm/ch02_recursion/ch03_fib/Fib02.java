package algorithm.ch02_recursion.ch03_fib;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/1 时间:13:12
 * @JDK 1.8
 * @Description 功能模块：Fibonacci数列（递归应用-画图理解）1,1,2,3,5,8
 * 01确定参数
 * 02确定返回值
 */
public class Fib02 {
	public static void main(String[] args) {
		int number = getNumber(6);
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
