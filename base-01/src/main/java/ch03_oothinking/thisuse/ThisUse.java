package ch03_oothinking.thisuse;

import lombok.Data;

/**
 * this是自身的一个对象，代表对象本身，可以理解为是指向对象本身的一个指针。
 * 关键字this、super都指的是对象。this关键字代表当前对象，super关键字代表父对象。
 * 1、this()和super()为构造方法，作用是在JVM堆中构建出一个对象。
 * 2、为了避免多次创建对象，同一个方法内只能调用一次this()或super()。
 * 3、均不可以在static环境中使用，如static变量，static方法，static语句块。
 * 4、this和super不能同时出现在一个构造函数里面，调用构造器语句必须是构造器里面语句的第一条。
 * 5、避免操作对象时对象还未构建成功。
 * 6、构造参数调用this()无参构造器时，会调用父类的无参构造器。
 *
 * @author guodd
 * @version 1.0
 */
@Data
public class ThisUse {
    public static void main(String[] args) {
        ThisUse thisUse = new ThisUse();
    }

    /**
     * 属性描述：name
     */
    private String name;

    public void thisUse() {
        System.out.println(name);
    }

    public ThisUse() {
        // 默认是省略的，调用Object无参构造器
        super();
    }

    public ThisUse(String name) {
        // 3、引用本类的构造函数，必须放在第一行
        this();

        // 2、形参与成员名字重名，用this来区分
        this.name = name;
    }

    public void testThis() {
        // 1、普通的直接引用，this相当于是指向当前对象本身。
        this.thisUse();
    }
}
