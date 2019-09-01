package ch02_factory.factorymethod;

/**
 * project - 工厂方法
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/11 时间:15:03
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Car implements Movable {
    @Override
    public void run() {
        System.out.println("小汽车");
    }
}
