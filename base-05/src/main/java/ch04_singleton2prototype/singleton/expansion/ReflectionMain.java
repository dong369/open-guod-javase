package ch04_singleton2prototype.singleton.expansion;

import ch04_singleton2prototype.singleton.HungrySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:14:54
 * @JDK 1.8
 * @Description 功能模块：反射攻击
 */
public class ReflectionMain {
    public static void main(String[] args) throws Exception {
        Class<HungrySingleton> hungrySingletonClass = HungrySingleton.class;
        Constructor<HungrySingleton> declaredConstructor = hungrySingletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        // 注意顺序
        HungrySingleton instance = HungrySingleton.getInstance();
        Field flag = instance.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance, true);
        HungrySingleton reflectionObject = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(reflectionObject);
    }
}
