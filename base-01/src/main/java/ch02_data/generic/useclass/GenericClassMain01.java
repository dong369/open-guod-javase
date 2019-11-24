package ch02_data.generic.useclass;

import java.util.ArrayList;
import java.util.List;

/**
 * project - 泛型类
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/6 时间:13:01
 * @JDK 1.8
 * @Description 功能模块：使用泛型类，创建对象的时候需要指定具体的类型
 * 语法格式：访问控制  类、方法和变量修饰符 类、方法名称<泛型标识：可以随便写任意标识号（T、E、K、V） , 标识指定的泛型的类型> { 程序控制语句 }
 */
public class GenericClassMain01<T> {
    public static void main(String[] args) {
        System.out.println(new GenericClassMain01<String>().fun01("params"));
        List<String> s = new ArrayList<>();
        List<Integer> i = new ArrayList<>();
        // 类型摩擦
        System.out.println(s.getClass() == i.getClass());
        System.out.println(GenericClassMain01.fun02("static params"));
    }

    /**
     * 只能传递T类型的数据,返回值就是T实例化传递的对象类型
     * 注意：静态方法不可以使用类中定义的泛型；类中的泛型需要在对象初始化时指定具体的类型。
     *
     * @param t
     * @return
     */
    private T fun01(T t) {
        return t;
    }

    /**
     * 这个<T> T 可以传入任何类型的T
     * 第一个 表示是泛型
     * 第二个 表示返回的是T类型的数据
     * 第三个 限制参数类型为T
     *
     * @param t
     * @param <T>
     * @return
     */
    private static <T> T fun02(T t) {
        return t;
    }
}
