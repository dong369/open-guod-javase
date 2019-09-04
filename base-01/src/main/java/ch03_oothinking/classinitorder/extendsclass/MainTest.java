package ch03_oothinking.classinitorder.extendsclass;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/2/6 时间:16:38
 * @JDK 1.8
 * @Description 功能模块：
 * 父类静态变量 > 父类静态初始块 > 子类静态变量 > 子类静态初始块
 * 父类成员变量 > 父类非静态初始块 > 父类构造器 > 子类成员变量 > 子类非静态初始块 > 子类构造器
 */
public class MainTest {
    public static void main(String[] args) {
        Child child = new Child();
        // Class1.isAssignableFrom(Class2)：是用来判断一个类Class1和另一个类Class2是否相同或是另一个类的超类或接口。
        // object instanceof Class：是从实例继承的角度去判断，是否是一个类或接口的或其子类子接口的实例。
        System.out.println(Parent.class.isAssignableFrom(child.getClass()));
        System.out.println(Parent.class.isAssignableFrom(Child.class));
        System.out.println(child instanceof Parent);
    }
}