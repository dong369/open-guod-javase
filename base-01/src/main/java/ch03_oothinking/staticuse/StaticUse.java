package ch03_oothinking.staticuse;

/**
 * static关键字（1、修饰成员变量 2、修饰成员方法 3、静态代码块 4、修饰类[只能修饰内部类也就是静态内部类] 5、静态导包）
 * static变量值在类加载的时候分配空间，以后创建类对象的时候不会重新分配。赋值的话，是可以任意赋值的！
 * 被static修饰的变量或者方法是优先于对象存在的，也就是说当一个类加载完毕之后，即便没有创建对象，也可以去访问。
 *
 * @author guodd
 * @version 1.0
 */
public class StaticUse {
    public static void main(String[] args) {
        StaticUse.test01();
    }

    // 01、静态方法（构造器）是无法被重写。
    // 02、static方法就是没有this的方法。
    // 03、在static方法内部不能调用非静态方法，反过来是可以的。
    // 04、方便在没有创建对象的情况下来进行调用（方法/变量）。
    private static void test01() {
        System.out.println("test");
        // 1、静态只能访问静态。 2、非静态既可以访问非静态的，也可以访问静态的。
        // test02();
    }

    private void test02() {
        System.out.println("test02...");
        test01();
    }
}
