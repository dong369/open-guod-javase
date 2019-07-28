package ch03_oothinking.abstracts;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/15 时间:17:49
 * @JDK 1.8
 * @Description 功能模块：事物作为抽象类，事物的特性行为作为接口，抽象的意义：对代码的维护和重用。
 * 抽象类定义了是什么？接口类定义了具有什么能力？
 */
public abstract class AbstractClass {
    public abstract void say();

    void test() {
        say();
    }

    void test(AbstractClass abstractClass) {
        abstractClass.say();
    }

    static class Abstract01 extends AbstractClass {
        @Override
        public void say() {
            System.out.println("Abstract01");
        }
    }

    static class Abstract02 extends AbstractClass {
        @Override
        public void say() {
            System.out.println("Abstract02");
        }
    }

    public static void main(String[] args) {
        Abstract01 abstract01 = new Abstract01();
        abstract01.test();
        abstract01.test(new Abstract02());
        abstract01.test(new AbstractClass() {
            @Override
            public void say() {
                System.out.println("n");
            }
        });
    }
}