package ch02_singleton2prototype.singleton;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:15:50
 * @JDK 1.8
 * @Description 功能模块：懒汉式单例
 */
public class CarTwo {
    // 01构造器私有
    private CarTwo() {
    }

    // 02静态属性对象
    private static CarTwo car = null;

    // 03通过方法返回02的对象（静态工厂方法）
    public static CarTwo getInstance() {
        if (car == null) {
            car = new CarTwo();
        }
        return car;
    }
}