package ch01_design_principles.liskov;

/**
 * Liskov Substitution Principle，里氏替换原则，简称LSP
 * 如果对一个类型为S的对象o1，都有类型为T的对象o2，使得以S定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型T是类型S的子类型。
 * 按照里氏替换原则，当多个类之间存在继承关系时，通常应该使用父类或接口来指向子类的对象（除非需要使用子类特有的方法），这更利于提高系统的可扩展性。
 * 策略模式 | 组合模式 | 代理模式
 * <p>
 * 子类必须完全实现父类的方法
 * 子类可以有自己的个性
 * 覆盖或实现父类的方法时输入参数可以被放大
 * 覆盖或实现父类的方法时输出结果可以被缩小
 *
 * @author guodd
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Bird();
        animal.move();
        // Exception in thread "main" java.lang.ClassCastException
        // 有子类的地方，父类未必就能适应，如果想转换，父类必须是子类构建出来的
        Horse horse =(Horse)animal;
        horse.move();

        Bird bird = (Bird) animal;
        bird.eat();
    }
}
