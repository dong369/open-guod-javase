package ch03_oothinking.innerclass;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/12 时间:20:18
 * @JDK 1.8
 * @Description 功能模块：内部类是指在一个外部类的内部再定义一个类。类名不需要和文件夹相同。
 * 内部类可以是静态static的，也可用public，default，protected和private修饰。
 * 外部顶级类即类名和文件名相同的只能使用public和default。
 * <p>
 * 编译完成后出现OuterClass.class和OuterClass$InnerClass.class两类。
 * <p>
 * 内部类（Inner Class）、匿名内部类、静态内部类
 * 内部类方法可以访问该类定义所在作用域中的数据，包括被 private 修饰的私有数据
 * 内部类可以对同一包中的其他类隐藏起来
 * 内部类可以实现java单继承的缺陷
 * 当我们想要定义一个回调函数却不想写大量代码的时候我们可以选择使用匿名内部类来实现
 */
public class OuterClass {
    private void bar() {
        new InnerClass01();
        new InnerClass03();
    }

    private static void foo() {
        new InnerClass03();
    }

    // 1、成员内部类，非静态内部类。
    private class InnerClass01 {
        void innerTest() {
            foo();
            bar();
        }
    }

    // 2、局部内部类，内部类定义在方法和作用域内。
    public void inner() {
        class Local {

        }
    }

    // 3、成员内部类，静态内部类「嵌套类」，静态内部类的创建的确不依赖与外部类的创建，因为static并不依赖于实例，而依赖与类 Class 本身。
    private static class InnerClass03 {
    }

    // 4、匿名内部类

    // 5、内部类的继承

    // 注意：静态方法中没有this
    public static void main(String[] args) {
        // 内部类的创建依赖外部类的实例对象，在没有外部类实例之前是无法创建内部类的。
        new OuterClass().new InnerClass01().innerTest();
        //
        new InnerClass03();
    }
}