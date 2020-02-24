package ch05_factory.factorymethod;

/**
 * project - 工厂方法
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/11 时间:15:06
 * @JDK 1.8
 * @Description 功能模块：01任意定制交通工具的类型（车/飞机）02任意生产过程；缺点产生工厂泛滥问题。
 */
public class MainTest {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory plainFactory = new PlainFactory();
        Movable car = carFactory.create();
        Movable plain = plainFactory.create();
        car.run();
        plain.run();
    }
}