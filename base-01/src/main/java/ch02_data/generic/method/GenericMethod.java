package ch02_data.generic.method;

import ch02_data.generic.entity.Apple;
import org.junit.Test;

import java.io.Serializable;

/**
 * 写一个函数，调用者传递什么类型的变量，该函数就返回什么类型的变量？
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/6 时间:12:51
 * @since 1.8
 */
public class GenericMethod<T> {
    @Test
    public void genericMethod() {
        // 01传统方式，存在强制类型转换
        String str = "aaa";
        String o = (String) fun01(str);
        System.out.println(o);
        // 02泛型方式
        String s = fun02(str);
        System.out.println(s);
        // 03泛型方式
        fun03("java", "c", 1);
        GenericMethod<String> methodMain01 = new GenericMethod<>();
        // methodMain01.test01(11);
        // 泛型类中的类型参数与泛型方法中的类型参数是没有相应的联系的，泛型方法始终以自己定义的类型参数为准。
        // 泛型类的类型时String，而泛型方法传入的是Integer
        GenericMethod.fun02("A");
    }

    // 传统方式
    private static Object fun01(Object obj) {
        return obj;
    }

    // 该方法不是泛型方法，而是一个普通方法
    // 该方法不能使用static关键字修饰，因为T的类型取决于创建类的类型
    // 为什么不能使用static关键字？因为这个地方用到了类的泛型，而泛型的确定是new出对象时确定的
    private void test01(T t) {
    }

    // <E>类型参数，E参数化类型
    private static <E> E fun02(E e) {
        return e;
    }

    // 为什么能使用static关键字？因为这个地方方法的泛型和类无关
    private static <E extends Comparable<String> & Serializable> E fun02(E e) {
        return e;
    }

    @SafeVarargs
    private static <T> void fun03(T... args) {
        for (T t : args) {
            System.out.print(t + "\t");
        }
    }
}