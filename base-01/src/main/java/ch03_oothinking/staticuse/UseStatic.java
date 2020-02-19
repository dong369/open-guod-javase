package ch03_oothinking.staticuse;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/2 时间:17:00
 * @JDK 1.8
 * @Description 功能模块：static关键字（静态变量+全局常量、静态方法、静态内部类、静态代码块、静态导入）
 */
public class UseStatic {
    public static void main(String[] args) {
        UseStatic.test();
    }

    // 01、静态方法（构造器）是无法被重写。
    // 02、static方法就是没有this的方法。
    // 03、在static方法内部不能调用非静态方法，反过来是可以的。
    // 04、方便在没有创建对象的情况下来进行调用（方法/变量）。
    private static void test() {
        System.out.println("test");
    }
}
