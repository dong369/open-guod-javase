package ch03_singleton2prototype.singleton;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:12:58
 * @JDK 1.8
 * @Description 功能模块：饿汉式单例（类创建时创建静态的对象，天生是线程安全）
 */
public class HungrySingleton {

    // 01静态属性对象
    private static final HungrySingleton car = new HungrySingleton();

    private static boolean flag = true;

    // 02构造器私有，限制产生多个对象
    private HungrySingleton() {
        System.out.println(false);
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("禁止使用反射破解！");
        }
    }


    // 03通过方法返回02的对象（静态工厂方法）
    public static HungrySingleton getInstance() {
        return car;
    }
}