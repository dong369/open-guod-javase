package ch02_factory.factorymethod;

/**
 * project - 工厂方法
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/11 时间:15:09
 * @JDK 1.8
 * @Description 功能模块：车工厂
 */
public class CarFactory extends VehicleFactory {
    @Override
    public Movable create() {
        return new Car();
    }
}
