package ch03_oothinking.instanceofuse;

/**
 * 接口是抽象方法的集合。
 * 从设计层面来说，抽象类是对类的抽象，是一种模板设计，接口是行为的抽象，是一种行为的规范。
 * 接口和抽象类都不能实例化；都位于继承的顶端，用于被其他实现或继承；都包含抽象方法，其子类都必须覆写这些抽象方法
 * Java8中接口中引入默认方法和静态方法，以此来减少抽象类和接口之间的差异。
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        info(animal);
        info(dog);
        info(cat);
    }

    private static void info(Animal animal) {
        // 对象 instanceof 类
        // 一个对象是否为一个类的实例
        // A instanceof  B 判断A对象是否为B类或接口的实例或者子类或子接口的实例
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.go();
        }
        // A isAssignableFrom B Class类的一个native方法 A类对象所代表的类或者接口是否为B类对象所代表的类或者接口
        System.out.println(Animal.class.isAssignableFrom(Cat.class));
    }
}
