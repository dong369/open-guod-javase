package ch03_singleton2prototype.singleton.hungry;

import java.io.Serializable;

/**
 * 饿汉式单例（类创建时创建静态的对象，天生是线程安全）
 *
 * @author guod
 * @version 1.0
 */
public class HungrySingleton implements Serializable, Cloneable {
    // 01、静态属性对象
    // 声明为final的对象，必须在类加载时完成赋值，new或static块
    private static final HungrySingleton car = new HungrySingleton();

    private static boolean flag = true;

    // 02、构造器私有，限制产生多个对象
    private HungrySingleton() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("禁止使用反射破解！");
        }
    }

    // 03、通过方法返回02的对象（静态工厂方法）
    public static HungrySingleton getInstance() {
        return car;
    }

    // 序列化攻击
    public Object readResolve() {
        return car;
    }

    // 克隆破坏
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}