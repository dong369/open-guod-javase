package ch02_factory.abstractfactory;

/**
 * project - 抽象工厂
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/12 时间:12:21
 * @JDK 1.8
 * @Description 功能模块：
 */
public class DefaultFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Food createFood() {
        return new Apple();
    }

    @Override
    public Weapon createWeapon() {
        return new Gun();
    }
}