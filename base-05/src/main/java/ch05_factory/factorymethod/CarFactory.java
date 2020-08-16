package ch05_factory.factorymethod;

/**
 * project - 工厂方法
 *
 * @author guodd
 * @version 1.0
 * 功能模块：车工厂
 */
public class CarFactory extends VehicleFactory {
    @Override
    public Movable create() {
        return Car.getInstance();
    }
}
