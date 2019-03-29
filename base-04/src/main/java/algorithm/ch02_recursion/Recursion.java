package algorithm.ch02_recursion;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/1 时间:12:54
 * @JDK 1.8
 * @Description 功能模块：数据结构-递归-画图理解
 */
public class Recursion {
	public static void main(String[] args) {
		 test01();
		test02(100);
	}

	private static void test02(int i) {
		if (i == 0) {
			return;
		}
		System.out.println(i);
		test02(i - 1);
	}

	private static void test01() {
		System.out.println("hello world!");
		test01();
	}
}
