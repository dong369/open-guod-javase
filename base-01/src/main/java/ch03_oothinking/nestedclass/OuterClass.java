package ch03_oothinking.nestedclass;

/**
 * project -
 *
 * @author Administrator
 * @version 1.0
 * @date 日期:2019/3/12 时间:20:18
 * @JDK 1.8
 * @Description 功能模块：内部类（Inner Class）
 */
public class OuterClass {
    // 静态方法中没有this
    public static void main(String[] args) {
        // new InnerClass();
        new OuterClass().new InnerClass();
    }

    // 内部类
    private class InnerClass {
    }

    public void bar() {
        new InnerClass();
    }

    // 静态内部类
    private static class Inner {
    }

    public static void foo() {
        new Inner();
    }
}