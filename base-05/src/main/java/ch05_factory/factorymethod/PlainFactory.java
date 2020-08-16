package ch05_factory.factorymethod;

/**
 * project - 工厂方法
 *
 * @author guodd
 * @version 1.0
 * 功能模块：飞机工厂
 */
public class PlainFactory extends VehicleFactory {
    @Override
    public Movable create() {
        return new Plain();
    }
}
