package ch03_oothinking.classinitorder.extendsclass;

/**
 * project -
 *
 * @author Administrator
 * @version 1.0
 * @date 日期:2019/2/6 时间:16:38
 * @JDK 1.8
 * @Description 功能模块：
 * 父类静态变量 > 父类静态初始块 > 子类静态变量 > 子类静态初始块
 * 父类成员变量 > 父类非静态初始块 > 父类构造器 > 子类成员变量 > 子类非静态初始块 > 子类构造器
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        // isAssignableFrom()方法是从类继承的角度去判断，instanceof()方法是从实例继承的角度去判断。
        // isAssignableFrom()方法是判断是否为某个类的父类，instanceof()方法是判断是否某个类的子类。
        System.out.println(Parent.class.isAssignableFrom(Child.class));
        System.out.println(child instanceof Parent);
    }
}