package ch02_factory.abstractfactory;

/**
 * project - 抽象工厂
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/12 时间:11:58
 * @JDK 1.8
 * @Description 功能模块：控制[系类]产品
 */
public class MainTest {
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