package ch02_data.generic.wildcard;

import ch02_data.generic.entity.Apple;
import ch02_data.generic.entity.Fruit;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project -
 *
 * @author by guodd
 * @version 1.0
 * @date 2020/2/18
 * @since 1.8
 */
public class BaseWildcard {
    // A是类B的父类，G<A> 是 G<B>共同的父类是G<?>
    @Test
    public void test01() {
        List<?> list1 = new ArrayList<>();
        List<?> list2 = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("java");
        list1 = list2;
        // 添加：对List<?>就不能向其内部添加数据，但是可以添加null
        list1 = list;
        // list1.add(11);
        list1.add(null);
        // 获取：允许读取数据，获取的类型是Object
        System.out.println(list1.get(0));
    }

    // 有限制条件的通配符
    // ? extends Class
    // ? supper Class
    @Test
    public void test02() {
        // 小于等于
        List<? extends Fruit> ext = null;
        // 大于等于
        List<? super Fruit> sup = null;

        List<Fruit> a = new ArrayList<>();
        List<Apple> b = new ArrayList<>();
        List<Object> c = new ArrayList<>();

        ext = a;
        ext = b;
        // ext = c;

        sup = a;
        // sup = b;
        sup = c;

        // 写入数据
        // ext.add(new Apple());
        sup.add(new Fruit());
        sup.add(new Apple());


        // 读取数据
        Fruit fruit = ext.get(0);
        // Fruit object = sup.get(0);
        Object object = sup.get(0);
    }

}
