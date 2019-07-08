package ch11_reflection.method;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * project - 反射
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:9:54
 * @JDK 1.8
 * @Description 功能模块：
 */
public class ReflectionMethod {
    public static void main(String[] args) throws Exception {
        // reflectionMethod();
        reflectionField();
    }

    public static void reflectionMethod() throws Exception {
        // 1. 获取字节码文件
        Class clazz = Number.class;
        // 2. 获取类的对象
        Number number = (Number) clazz.newInstance();
        // 3. 获取方法
        Method method = clazz.getDeclaredMethod("add", int.class, int.class);
        // 4. 设置方法访问权限（暴力反射）
        method.setAccessible(true);
        // 5. 执行方法
        method.invoke(number, 2, 6);
    }


    /**
     * 通过反射为成员变量赋值
     */
    public static void reflectionField() throws Exception {
        // 1. 获取字节码文件
        Class clazz = Number.class;
        // 2. 获取类的对象
        Number number = (Number) clazz.newInstance();
        // 调用方法打印赋值前的成员变量的值
        System.out.print("修改前：");
        number.printNum();
        // 3. 获取成员变量
        Field field = clazz.getDeclaredField("num");
        // 4. 设置成员变量的访问权限（暴力反射）
        field.setAccessible(true);
        // 5. 为成员变量赋值
        field.set(number, "我是被修改后的Number值");
        // 调用方法打印赋值后的成员变量的值，看是否修改成功
        System.out.print("修改后：");
        number.printNum();
    }
}