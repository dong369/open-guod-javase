package ch05_factory.abstractfactory;

/**
 * project - 抽象工厂
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/12 时间:12:25
 * @JDK 1.8
 * @Description 功能模块：抽象工厂，工厂的父类
 */
public abstract class AbstractFactory {
    /**
     * 功能描述：产生交通工具
     *
     * @return
     */
    public abstract Vehicle createVehicle();

    /**
     * 功能哥描述：产生食品
     *
     * @return
     */
    public abstract Food createFood();

    /**
     * 功能描述：生产武器
     *
     * @return
     */
    public abstract Weapon createWeapon();
}
