package ch02_factory.factorymethod;

/**
 * project - 工厂方法
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/31 时间:21:22
 * @JDK 1.8
 * @Description 功能模块：
 */
public class SubwayFactory extends VehicleFactory {
    @Override
    public Movable create() {
        return new Subway();
    }
}
