package ch02_singleton2prototype.singleton;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:12:58
 * @JDK 1.8
 * @Description 功能模块：饿汉式单例（类创建时创建静态的对象，天生是线程安全）
 */
public class CarOne {
    // 01构造器私有，限制产生多个对象
    private CarOne() {
    }

    // 02静态属性对象
    private static final CarOne car = new CarOne();

    // 03通过方法返回02的对象（静态工厂方法）
    public static CarOne getInstance() {
        return car;
    }
}