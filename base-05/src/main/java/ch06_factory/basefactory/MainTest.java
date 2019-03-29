package ch06_factory.basefactory;

/**
 * project - 简单工厂模式
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/11 时间:15:06
 * @JDK 1.8
 * @Description 功能模块：01任意定制交通工具的类型和02生产过程；产生工厂泛滥问题。
 */
public class MainTest {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory plainFactory = new PlainFactory();
        Movable c = carFactory.create();
        Movable p = plainFactory.create();
        c.run();
        p.run();
    }
}
