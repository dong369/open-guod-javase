package ch03_oothinking.usesuper;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/2 时间:17:02
 * @JDK 1.8
 * @Description 功能模块：super关键字（代表当前对象的父对象，子类的构造的过程当中必须调用其父类的构造方法。）
 * 关键字this、super都指的是对象。所以，均不可以在static环境中使用（static变量，static方法，static语句块）。
 * this和super不能同时出现在一个构造函数里面。
 */
public class UseSuper {
    public static void main(String[] args) {
        new ChinaPerson("你好");
    }

    static class Person {
        Person() {
            System.out.println("Person Structure");
        }

        Person(String name) {
            System.out.println(name);
        }


    }

    static class ChinaPerson extends Person {

        ChinaPerson() {
            this("no parameters");
        }

        ChinaPerson(String name) {
            super(name);
            System.out.println(name);
        }
    }
}
