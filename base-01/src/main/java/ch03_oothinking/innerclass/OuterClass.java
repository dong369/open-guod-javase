package ch03_oothinking.innerclass;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/12 时间:20:18
 * @JDK 1.8
 * @Description 功能模块：内部类（Inner Class）、匿名内部类、静态内部类
 * 内部类方法可以访问该类定义所在作用域中的数据，包括被 private 修饰的私有数据
 * 内部类可以对同一包中的其他类隐藏起来
 * 内部类可以实现 java 单继承的缺陷
 * 当我们想要定义一个回调函数却不想写大量代码的时候我们可以选择使用匿名内部类来实现
 */
public class OuterClass {
    // 静态方法中没有this
    public static void main(String[] args) {
        // new InnerClass();
        new Inner();
        new OuterClass().new InnerClass();
    }

    public void bar() {
        new InnerClass();
        new Inner();
    }

    public static void foo() {
        new Inner();
        // new InnerClass();
    }

    // 非静态内部类，内部类的创建依赖外部类的实例对象，在没有外部类实例之前是无法创建内部类的。
    private class InnerClass {
        public void innerTest() {
            foo();
            bar();
        }
    }


    // 静态内部类「嵌套类」，静态内部类的创建的确不依赖与外部类的创建，因为 static 并不依赖于实例，而依赖与类 Class 本身。
    private static class Inner {
    }
}