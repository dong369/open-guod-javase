package ch03_oothinking.superuse;

import org.junit.Test;

/**
 * 关键字this、super都指的是对象。this关键字代表当前对象，super关键字代表父对象。
 * 1、this()和super()为构造方法，作用是在JVM堆中构建出一个对象。
 * 2、为了避免多次创建对象，同一个方法内只能调用一次this()或super()。
 * 3、均不可以在static环境中使用，如static变量，static方法，static语句块。
 * 4、this和super不能同时出现在一个构造函数里面，调用构造器语句必须是构造器里面语句的第一条。
 * 5、避免操作对象时对象还未构建成功。
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/2 时间:17:02
 * @since 1.8
 */
public class UseSuper {
    @Test
    public void superTest() {
        ChinaPerson chinaPerson1 = new ChinaPerson();
        // ChinaPerson chinaPerson2 = new ChinaPerson("Java");
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
