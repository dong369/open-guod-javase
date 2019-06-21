package algorithm.ch02_recursion;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/6/1 时间:12:54
 * @JDK 1.8
 * @Description 功能模块：数据结构-递归-画图理解
 * 三个要素：递 + 结束条件 + 归（根据具体问题）
 * ①边界条件：至少有一条初始定义是非递归的，如汉诺塔的H(0)=0，阶乘的0!=1。
 * ②递归通式：由已知函数值逐步计算出未知函数值，如汉诺塔的H(0)=0，可以推算出
 * 递归就是有去（递去）有回（归来）。
 * 广义地把：递归的基本思想是规模大的问题转化为规模小的相似的子问题或者相似的子问题集合来解决。
 * 宏观语意：方法实现的功能
 * 微观语意：中间调用的程序过程
 */
public class BaseRecursion {
    public static void main(String[] args) {
        // test01();
        System.out.println(test02(100));
    }

    // 01边界条件
    private static int test02(int i) {
        if (i == 0) {
            return 0;
        }
        return i + test02(i - 1);
    }

    // 02无边界条件
    private static void test01() {
        System.out.println("hello world!");
        test01();
    }
}
