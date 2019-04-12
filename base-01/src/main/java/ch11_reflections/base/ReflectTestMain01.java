package ch11_reflections.base;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * project - 反射机制
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/12/2 时间:21:02
 * @JDK 1.8
 * @Description 功能模块：反射是获取类的对象；对于任意一个类，都能够知道这个类的所有属性和方法；
 */
public class ReflectTestMain01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // 加载class
        Class<?> c = Class.forName("ch11_reflections.base.T01");
        // 创建对象
        Object o = c.newInstance();
        // 获取方法
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            if (method.getName().equals("fun")) {
                method.invoke(o);
            }
        }
        // 获取属性
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}

class T01 {
    private String name;
    private Integer age;

    static {
        System.out.println("init class");
    }

    public T01() {
        System.out.println("init object");
    }

    public void fun() {
        System.out.println("function init");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
