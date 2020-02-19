package ch02_data.generic.useclass;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * project - 使用泛型类，创建对象的时候需要指定具体的类型
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/6 时间:13:01
 * @since 1.8
 */
public class MainTest<T> {
    // 使用泛型的方式
    @Test
    public void createObject() {
        GenericClass<Integer> genericClass = new GenericClass<>();
        genericClass.setT(1);
        Integer t = genericClass.getT();
    }

    // 虽然类A是类B的父类，但是G<A> 和 G<B>二者是不具备父子类关系的，二者是并列关系。
    // ArrayList<String> a = null;
    // ArrayList<Integer> b = null;
    // a = b;    // Error  结合内存模型考虑下为什么会报错？


    // A是类B的父类，G<A> 是 G<B>的父类

    @Test
    public void test() {
        List<String> list = new ArrayList<>();
    }
}
