package ch11_reflection.method;

/**
 * project - 反射
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:8:04
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Number {
    private static String num = "number start...";

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void printNum() {
        System.out.println(num);
    }
}