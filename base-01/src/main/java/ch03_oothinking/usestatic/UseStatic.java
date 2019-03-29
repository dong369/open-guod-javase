package ch03_oothinking.usestatic;

/**
 * project -
 *
 * @author Administrator
 * @version 1.0
 * @date 日期:2019/3/2 时间:17:00
 * @JDK 1.8
 * @Description 功能模块：static关键字
 */
public class UseStatic {
    public static void main(String[] args) {
        UseStatic.test();
    }

    // 01静态的方法（构造器）是无法被重写
    private static void test() {
        System.out.println("test");
    }
}
