package ch03_oothinking.innerclass;

/**
 * 内部类（Inner Class）可以分为四类：成员内部类、局部内部类、匿名内部类、静态内部类
 * 在Java中，将一个类的定义放在另外一个类的定义内部，这就是内部类。
 * 内部类可以是静态static的，也可用public，default，protected和private修饰。
 * 外部顶级类即类名和文件名相同的只能使用public和default。
 * <p>
 * 编译完成后出现OuterClass.class和OuterClass$InnerClass.class两类。
 * <p>
 * 一个内部类对象可以访问创建它的外部类对象的内容，包括私有数据。
 * 内部类不为同一包的其他类所见，具有很好的封装性。
 * 内部类有效实现了“多重继承”，优化 java 单继承的缺陷。
 * 匿名内部类可以很方便的定义回调。
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class OuterClass {
    private void bar() {
        // 非静态方法可以直接调用静态成员
        foo();
        new InnerClass01();
        new InnerClass03();
    }

    private static void foo() {
        // 静态方法只能访问静态成员，因为非静态方法的调用要先创建对象
        // bar();
        new InnerClass03();
    }

    // 1、定义在类内部，成员位置上的非静态类，就是成员内部类。
    class InnerClass01 {
        // static int a = 1;

        void innerTest() {
            foo();
            bar();
        }
    }

    public void inner() {
        final int a = 1;
        // 2、定义在方法中的内部类，就是局部内部类。
        class Local {
            // static int a = 1;
            void method() {
                System.out.println(a);
            }
        }
    }

    // 3、定义在类内部的静态类，就是静态内部类。
    // 静态内部类的创建的确不依赖与外部类的创建，因为static并不依赖于实例，而依赖与类Class本身。
    static class InnerClass03 {
        // static int a = 1;
    }

    // 4、匿名内部类就是没有名字的内部类，日常开发中使用的比较多。
    // 匿名内部类必须继承一个抽象类或者实现一个接口
    // 匿名内部类不能定义任何静态成员和静态方法
    // 局部内部类和匿名内部类访问局部变量的时候，为什么变量必须要加上final？
    // 匿名内部类不能是抽象的，它必须要实现继承的类或者实现的接口的所有抽象方法
    private static abstract class AbstractClass {
        abstract void test();
    }

    interface Int {
        void test();
    }

    // 5、内部类的继承和实现
    class InnerClassExt extends OuterClass.InnerClass01 implements OuterClass.Int {
        @Override
        public void test() {
            System.out.println("test");
        }
    }

    // 注意：静态方法中没有this，因为this指的是当前对象
    public static void main(String[] args) {
        // 内部类的创建依赖外部类的实例对象，在没有外部类实例之前是无法创建内部类的。
        // new InnerClass01();
        new OuterClass().new InnerClass01();
        new OuterClass().new InnerClass01().innerTest();

        // 静态内部类可以直接new
        new OuterClass.InnerClass03();
        new InnerClass03();

        // 匿名内部类
        AbstractClass a = new AbstractClass() {
            // 内部类不能有静态声明
            // static int a = 1;
            @Override
            void test() {
                System.out.println("匿名内部类");
            }
        };
        a.test();

        // 内部类实现继承接口
        new OuterClass().new InnerClassExt().test();
    }
}