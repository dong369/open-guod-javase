package ch03_oothinking.usestatic;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/2 时间:17:00
 * @JDK 1.8
 * @Description 功能模块：static关键字
 */
public class UseStatic {
    public static void main(String[] args) {
        UseStatic.test();
    }

    // 01静态的方法（构造器）是无法被重写。
    // 02static方法就是没有this的方法。
    // 03在static方法内部不能调用非静态方法，反过来是可以的。
    // 04方便在没有创建对象的情况下来进行调用（方法/变量）。
    private static void test() {
        System.out.println("test");
    }
}
