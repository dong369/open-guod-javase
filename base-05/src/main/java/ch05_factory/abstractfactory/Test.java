package ch05_factory.abstractfactory;

/**
 * project - 抽象工厂
 * 抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口
 *
 * @author guodd
 * @version 1.0
 * 功能模块：控制[系类]产品
 * @see java.sql.Connection
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new DefaultFactory();

        Vehicle v = factory.createVehicle();
        Food f = factory.createFood();
        Weapon w = factory.createWeapon();

        v.go();
        f.eat();
        w.shoot();
    }
}