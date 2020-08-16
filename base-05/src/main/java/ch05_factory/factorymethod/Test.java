package ch05_factory.factorymethod;

/**
 * project - 工厂方法
 * 定义一个用于创建对象的接口，让子类决定实例化哪个类。工厂方法使一个类的实例化延迟到其子类。
 * 产品等级：都是一样的产品等级，都是交通工具（小米手机、华为手机、苹果手机）。
 * 产品组：一系类的产品（小米手机、小米电脑、小米手环）
 *
 * @author guodd
 * @version 1.0
 * 功能模块：01任意定制交通工具的类型（车/飞机）；02任意生产过程；缺点产生工厂泛滥问题。
 * @see java.util.Collection（it方法）
 * @see java.net.URLStreamHandlerFactory
 */
public class Test {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Movable car = carFactory.create();
        car.run();

        VehicleFactory plainFactory = new PlainFactory();
        Movable plain = plainFactory.create();
        plain.run();
    }
}
