package ch03_oothinking.abstractuse;

/**
 * 抽象的意义：对代码的维护和重用。事物作为抽象类，事物的特性行为作为接口
 * 抽象类定义了是什么？接口类定义了具有什么能力？
 * 抽象是将一类对象的共同特征总结出来构造类的过程，包括数据抽象和行为抽象两方面。
 * 抽象只关注对象有哪些属性和行为，并不关注这些行为的细节是什么。
 * 接口和抽象类都不能实例化；都位于继承的顶端，用于被其他实现或继承；都包含抽象方法，其子类都必须覆写这些抽象方法
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 * 抽象类是用来捕捉子类的通用特性的。
 * 抽象类能使用 final 修饰吗？
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