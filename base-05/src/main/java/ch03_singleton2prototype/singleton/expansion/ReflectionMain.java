package ch03_singleton2prototype.singleton.expansion;

import ch03_singleton2prototype.singleton.hungry.HungrySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 反射攻击
 *
 * @author guodd
 * @version 1.0
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
