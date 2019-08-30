package ch03_factory.basefactory;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/29 时间:15:33
 * @JDK 1.8
 * @Description 功能模块：飞机工厂
 */
public class PlainFactory extends VehicleFactory {
    @Override
    Movable create() {
        return new Plain();
    }
}
