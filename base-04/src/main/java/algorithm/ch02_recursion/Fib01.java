package algorithm.ch02_recursion;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/1 时间:13:12
 * @JDK 1.8
 * @Description 功能模块：Fibonacci数列（非递归应用）1,1,2,3,5,8 
 * 01确定参数 
 * 02确定返回值
 */
public class Fib01 {
	public static void main(String[] args) {
		System.out.println(getNumber(40));
	}

	public static long getNumber(int index) {
		if (index == 1 || index == 2) {
			return 1;
		}
		long f1 = 1L;
		long f2 = 1L;
		long f = 0;
		for (int i = 0; i < index - 2; i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
		}
		return f;
	}
}
