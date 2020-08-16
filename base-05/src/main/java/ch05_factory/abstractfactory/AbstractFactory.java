package ch05_factory.abstractfactory;

/**
 * project - 抽象工厂
 *
 * @author guodd
 * @version 1.0
 * 功能模块：抽象工厂，工厂的父类
 */
public abstract class AbstractFactory {
    /**
     * 功能描述：产生交通工具
     *
     * @return Vehicle
     */
    public abstract Vehicle createVehicle();

    /**
     * 功能哥描述：产生食品
     *
     * @return Food
     */
    public abstract Food createFood();

    /**
     * 功能描述：生产武器
     *
     * @return Weapon
     */
    public abstract Weapon createWeapon();
}
