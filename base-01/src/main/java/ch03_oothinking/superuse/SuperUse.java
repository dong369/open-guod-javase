package ch03_oothinking.superuse;

import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

/**
 * super可以理解为是指向自己超（父）类对象的一个指针，而这个超类指的是离自己最近的一个父类。
 * 关键字this、super都指的是对象。this关键字代表当前对象，super关键字代表父对象。
 * 1、this()和super()为构造方法，作用是在JVM堆中构建出一个对象。
 * 2、为了避免多次创建对象，同一个方法内只能调用一次this()或super()。
 * 3、均不可以在static环境中使用，如static变量，static方法，static语句块。
 * 4、this和super不能同时出现在一个构造函数里面，调用构造器语句必须是构造器里面语句的第一条。
 * 5、避免操作对象时对象还未构建成功。
 *
 * @author guodd
 * @version 1.0
 */
public class SuperUse {
    @Test
    public void superTest() {
        ChinaPerson chinaPerson1 = new ChinaPerson();
        ChinaPerson chinaPerson2 = new ChinaPerson("Java");
    }

    static class Person {
        @Getter
        @Setter
        private String name;

        Person() {
            System.out.println("Person Structure");
        }

        Person(String name) {
            System.out.println(name);
        }
    }

    static class ChinaPerson extends Person {
        @Getter
        @Setter
        private String name;

        ChinaPerson() {
            this("no parameters");
        }

        ChinaPerson(String name) {
            // 3、引用父类构造方法，必须放在第一行
            super(name);
            // 2、子类中的成员变量或方法与父类中的成员变量或方法同名时，用super进行区分
//            super.setName(name);
//            this.setName(name);
            System.out.println(name);
        }

        // 1、普通的直接引用方式
        void doThing() {
//            System.out.println(super.getName());
        }
    }
}
