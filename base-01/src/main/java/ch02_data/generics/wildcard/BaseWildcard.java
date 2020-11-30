package ch02_data.generics.wildcard;

import ch02_data.generics.useclass.Sub02;
import ch02_data.generics.wildcard.entity.Apple;
import ch02_data.generics.wildcard.entity.Fruit;
import ch02_data.generics.wildcard.entity.Plate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符
 *
 * @author by guodd
 * @version 1.0
 * @since 1.8
 */
public class BaseWildcard {
    // 永远是true，缘由是类型擦除
    @Test
    public void inf() {
        List<String> s = new ArrayList<>();
        List<Integer> i = new ArrayList<>();
        System.out.println(s.getClass() == i.getClass());
    }

    @Test
    public void wildCards() {
        //
        List<?> objects = new ArrayList<>();
        // objects.add(1);

        List<?> a = new ArrayList<>();
        Sub02<?> objectSub02 = new Sub02<>(1);
        objectSub02.setSubList(a);
    }

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
        List<? extends Fruit> ext;
        // 大于等于
        List<? super Fruit> sup;

        List<Object> c = new ArrayList<>();
        List<Fruit> a = new ArrayList<>();
        List<Apple> b = new ArrayList<>();

        ext = a;
        ext = b;
        // ext = c;

        sup = a;
        // sup = b;
        sup = c;

        // 写入数据，为了类型安全，不能往使用了? extends的数据结构里写入任何的值
        // ext.add(new Apple());
        sup.add(new Fruit());
        sup.add(new Apple());

        // 读取数据
        Fruit fruit = ext.get(0);
        // Fruit object = sup.get(0);
        Object object = sup.get(0);
    }

    // 通配符和边界
    @Test
    public void typeInfo() {
        // 01、现定义一个水果盘，逻辑上水果盘当然可以装苹果
        // Plate<Fruit> p = new Plate<Apple>(new Apple());
        Plate<?> pp = new Plate<>(new Apple());
        Plate<Fruit> fruitPlate = new Plate<>(new Fruit());
        Fruit fruit = fruitPlate.get();
        // 苹果 IS-A 水果
        // 装苹果的盘子 NOT-IS-A 装水果的盘子
        // 结论：就算容器里装的东西之间有继承关系，但容器之间是没有继承关系。所以我们不可以把Plate<Apple>的引用传递给Plate<Fruit>
        // 为了让泛型用起来更舒服，Sun的大师们就想出了<? extends T>和<? super T>的办法，来让”水果盘子“和”苹果盘子“之间发生正当关系。
        // 02、上界（一个能放水果以及一切是水果子类（派生类）的盘子，上界<? extends T>不能往里存，只能往外取）
        Plate<? extends Fruit> p = new Plate<>(new Apple());
        p.get();
        // 03、下界（一个能放水果以及一切是水果父类（基类）的盘子，下界<? super T>不影响往里存，但往外取只能放在Object对象里）
        Plate<? super Apple> a = new Plate<>(new Fruit());
        a.set(new Apple());
        // Apple a = a.get(); // Error
        Object object = a.get();
        System.out.println(object);
        // 04、PECS原则
        // 频繁往外读取内容的，适合用上界Extends；经常往里插入的，适合用下界Super
    }
}
