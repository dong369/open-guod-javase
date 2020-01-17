package ch02_data.generic.usemethod;

import java.io.Serializable;

/**
 * project - 泛型方法
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/6 时间:12:51
 * @JDK 1.8
 * @Description 功能模块：写一个函数，调用者传递什么类型的变量，该函数就返回什么类型的变量？
 */
public class GenericMethodMain01<T> {
    public static void main(String[] args) {
        // 01传统方式，存在强制类型转换
        String str = "aaa";
        String o = (String) fun01(str);
        System.out.println(o);
        // 02泛型方式
        String s = fun02(str);
        System.out.println(s);
        // 03泛型方式
        fun03("java", "c", 1);
        GenericMethodMain01<String> methodMain01 = new GenericMethodMain01<>();
        // methodMain01.test01(11);
        // 泛型类中的类型参数与泛型方法中的类型参数是没有相应的联系的，泛型方法始终以自己定义的类型参数为准。
        // 泛型类的类型时String，而泛型方法传入的是Integer
        methodMain01.fun02(11);
    }

    private static Object fun01(Object obj) {
        return obj;
    }

    // 该方法不是泛型方法，而是一个普通方法
    // 该方法不能使用static关键字修饰，以为T的类型取决于创建类的类型。
    private void test01(T t) {

    }

    // <T>类型参数，T参数化类型
    private static <T> T fun02(T t) {
        return t;
    }

    private static <T extends Comparable & Serializable> T fun02(T t) {
        return t;
    }

    private static <T> void fun03(T... args) {
        for (T t : args) {
            System.out.print(t);
        }
    }
}