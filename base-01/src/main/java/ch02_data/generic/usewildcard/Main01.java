package ch02_data.generic.usewildcard;

/**
 * project - 通配符和边界
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/13 时间:21:33
 * @since 1.8
 */
public class Main01 {
    public static void main(String[] args) {
        // 01 现定义一个水果盘，逻辑上水果盘当然可以装苹果
        // Plate<Fruit> p = new Plate<Apple>(new Apple());
        Plate<?> pp = new Plate<>(new Apple());
        Plate<Fruit> fruitPlate = new Plate<>(new Fruit());
        Fruit fruit = fruitPlate.get();
        // 苹果 IS-A 水果
        // 装苹果的盘子 NOT-IS-A 装水果的盘子
        // 结论：就算容器里装的东西之间有继承关系，但容器之间是没有继承关系。所以我们不可以把Plate<Apple>的引用传递给Plate<Fruit>
        // 为了让泛型用起来更舒服，Sun的大师们就想出了<? extends T>和<? super T>的办法，来让”水果盘子“和”苹果盘子“之间发生正当关系。
        // 02 上界（一个能放水果以及一切是水果子类（派生类）的盘子，上界<? extends T>不能往里存，只能往外取）
        Plate<? extends Fruit> p = new Plate<>(new Apple());
        p.get();
        // 03 下界（一个能放水果以及一切是水果父类（基类）的盘子，下界<? super T>不影响往里存，但往外取只能放在Object对象里）
        Plate<? super Apple> a = new Plate<>(new Fruit());
        a.set(new Apple());
        // Apple a = a.get(); //Error
        Object object = a.get();
        System.out.println(object);
        // 04 PECS原则
        // 频繁往外读取内容的，适合用上界Extends；经常往里插入的，适合用下界Super
    }
}
