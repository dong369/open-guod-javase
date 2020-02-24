package ch05_factory.beanfactory;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/3 时间:10:54
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Car implements Movable {

    @Override
    public void move() {
        System.out.println("Car open");
    }
}
