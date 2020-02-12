package ch11_reflection.classobject;

import ch11_reflection.entity.Car;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * JAVA反射机制是在运行状态中，
 * 对于任意一个类，都能够知道这个类的所有属性和方法；
 * 对于任意一个对象，都能够调用它的任意一个方法；
 * 这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。
 * 注意：反射可以调用没有暴露出来的API
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/19 时间:8:03
 * @since 1.8
 */
public class GetClass {
    // 获取类对象的三种方式
    @Test
    public void getClassObj() throws Exception {
        // 静态加载：在编译时期加载的类，叫静态加载
        // 动态加载：在运行时期加载的类，叫动态加载
        // 第一种：Class.forName（"类名"）
        System.out.println(Car.class.getName());
        Class<?> aClass1 = Class.forName("ch11_reflection.entity.Car");
        System.out.println("Class.forName()方式 ：" + aClass1);
        // 第二种：对象.getClass()方法
        Car car = new Car();
        Class<? extends Car> aClass2 = car.getClass();
        System.out.println("对象.getClass()方式 ：" + aClass2 + ", " + (aClass1 == aClass2));
        // 第三种：类名.class方法
        Class<Car> aClass3 = Car.class;
        System.out.println("类名.class方式 ：" + aClass3 + ", " + (aClass1 == aClass3));
    }

    // 获取对象的方法
    @Test
    public void getClassMethod() {
        Class<?> aClass = Car.class;
        // 父类仅包含公共的方法
        Method[] superMethod = aClass.getSuperclass().getMethods();
        for (Method method : superMethod) {
            System.out.println(method);
        }
        System.out.println("==============");
        // 全部的方法（包含父类的）
        Method[] superDeclareMethod = aClass.getSuperclass().getDeclaredMethods();
        for (Method declaredMethod : superDeclareMethod) {
            System.out.println(declaredMethod);
        }
        System.out.println("==============");
        // 返回某个类的所有公用（public）方法包括其继承类的公用方法，当然也包括它所实现接口的方法。
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("==============");
        // 返回类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
    }

    // 获取对象的属性
    @Test
    public void field() {
        Class<?> aClass = Car.class;
        Field[] superField = aClass.getSuperclass().getFields();
        for (Field field : superField) {
            System.out.println(field.getName());
        }
        System.out.println("==============");
        Field[] superDeclaredFields = aClass.getSuperclass().getDeclaredFields();
        for (Field superDeclaredField : superDeclaredFields) {
            System.out.println(superDeclaredField.getName());
        }
        System.out.println("==============");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==============");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }

    // 创建对象
    @Test
    public void createObj() throws Exception {
        Class<?> aClass = Car.class;
        Car car = (Car) aClass.newInstance();
        boolean annotation = aClass.isAnnotation();
        System.out.println(annotation);
        car.setPrice(20.0);
        System.out.println(car.getMarketPrice());
    }
}