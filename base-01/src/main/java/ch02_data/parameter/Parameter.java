package ch02_data.parameter;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/22 时间:14:22
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Parameter {
    public static void main(String[] args) {
        test("你好：%s，你好：%s", "C");

    }

    public static void test(String s, Object... a) {
        // 提倡同学们尽量不用可变参数编程
        String format = s.format(s, a, "66");
        System.out.println(format);
    }
}
