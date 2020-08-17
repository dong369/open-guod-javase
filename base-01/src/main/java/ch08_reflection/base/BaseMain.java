package ch08_reflection.base;

import ch08_reflection.entity.PeopleMan;
import ch08_reflection.entity.User;
import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 静态加载：在编译时期加载的类，叫静态加载；
 * 动态加载：在运行时期加载的类，叫动态加载
 *
 * @author guodd
 * @version 1.0
 * @since JDK1.8
 */
public class BaseMain {
    // 反射之前，传统方式
    @Test
    public void oldNew() {
        // 1、通过构造器创建对象
        User person = new User("guo", 22);
        person.age = 28;
        System.out.println(person);
        // 2、调用public方法
        person.show();
        // 3、在Person类的外部不可通过Person类和对象调用其内部的私有结构（构造器、属性，方法）。
        // person.showNation();
    }

    // 反射方式
    @Test
    public void reflectionNew() throws Exception {
        // 1、通过反射创建对象
        Class<PeopleMan> clazz = PeopleMan.class;
        Constructor<PeopleMan> constructor = clazz.getDeclaredConstructor(String.class, Integer.class);
        PeopleMan p1 = constructor.newInstance("dong", 34);

        // 掉属性
        Field age = clazz.getDeclaredField("manAge");
        age.set(p1, 22);
        System.out.println(p1.toString());

        // 掉方法
        Method show = clazz.getDeclaredMethod("show");
        show.setAccessible(true);
        show.invoke(p1);

        // 私有构造器
        Constructor<PeopleMan> constructorNew = clazz.getDeclaredConstructor(String.class);
        constructorNew.setAccessible(true);
        PeopleMan p2 = constructorNew.newInstance("java");
        System.out.println(p2);

        // 私有属性
        Field name = clazz.getDeclaredField("manName");
        name.setAccessible(true);
        name.set(p2, "dong");
        System.out.println(p2);

        // 私有方法
        Method showNation = clazz.getDeclaredMethod("showNative", String.class);
        showNation.setAccessible(true);
        showNation.invoke(p2, "中国");
    }

    // 通过直接new对象和反射创建对象用哪个呢？建议使用new，动态创建用反射
    // 反射技术和对象的封装是不是冲突呢？不冲突

    // 哪些类型可以是Class，类、接口、数组、枚举、注解、基本数据类型、void都可以是Class对象。
    @Test
    public void valueType() {
        Class<Object> objectClass = Object.class;
        Class comparableClass = Comparable.class;
        Class<String[]> aClass = String[].class;
        Class<ElementType> elementTypeClass = ElementType.class;
        Class<Override> overrideClass = Override.class;
        Class<Integer> a = int.class;
        Class<Void> voidClass = void.class;
        Class<Class> classClass = Class.class;
        // 只要类型和维度是一样的，就是一个Class
    }
}
