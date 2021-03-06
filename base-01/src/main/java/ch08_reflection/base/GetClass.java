package ch08_reflection.base;

import ch08_reflection.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 静态加载：在编译时期加载的类，叫静态加载；动态加载：在运行时期加载的类，叫动态加载。
 * JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法。
 * 这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。
 * 注意：反射可以调用没有暴露出来的API
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
@Slf4j
public class GetClass {
    // 获取类对象的四种方式
    @Test
    public void getClassObj() throws Exception {
        // 第一种：Class.forName（"类名全路径"）
        Class<?> aClass1 = Class.forName("ch08_reflection.entity.User");
        System.out.println("Class.forName()方式 ：" + aClass1);

        // 第二种：对象.getClass()方法
        User user = new User();
        Class<? extends User> aClass2 = user.getClass();
        System.out.println("对象.getClass()方式 ：" + aClass2 + ", " + (aClass1 == aClass2));

        // 第三种：类名.class方法
        Class<User> aClass3 = User.class;
        System.out.println("类名.class方式 ：" + aClass3 + ", " + (aClass1 == aClass3));

        // 第四种：ClassLoader类加载器
        ClassLoader classLoader = GetClass.class.getClassLoader();
        Class<?> aClass4 = classLoader.loadClass("ch08_reflection.entity.User");
        System.out.println("ClassLoader类加载器方式 ：" + aClass4.getName() + ", " + (aClass1 == aClass4));
    }
}