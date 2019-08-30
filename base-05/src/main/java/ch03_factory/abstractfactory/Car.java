package ch03_factory.abstractfactory;

/**
 * project - 抽象工厂
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/12 时间:12:14
 * @JDK 1.8
 * @Description 功能模块：小汽车
 */
public class Car extends Vehicle {
    public void go() {
        System.out.println("开车前行...");
    }
}
