package ch02_data.parameter;

/**
 * @author guodd
 * @version 1.0
 */
public class Parameter {
    public static void main(String[] args) {
        test("你好：%s，你好：%s", "C");
    }

    public static void test(String s, Object... a) {
        // JDK里面很多有用到可变参数的
        // 可实际开发中，并不建议使用可变参考，它带来的困扰和潜在的问题会远大于便利性，比如在方法重构、重写等也会带来很多问题。
        String format = s.format(s, a, "66");
        System.out.println(format);
    }
}
