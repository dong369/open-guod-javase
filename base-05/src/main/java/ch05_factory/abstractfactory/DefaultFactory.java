package ch05_factory.abstractfactory;

/**
 * project - 抽象工厂
 *
 * @author guodd
 * @version 1.0
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
