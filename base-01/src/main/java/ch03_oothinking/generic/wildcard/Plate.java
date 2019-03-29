package ch03_oothinking.generic.wildcard;

/**
 * project - 泛型
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/13 时间:21:31
 * @JDK 1.8
 * @Description 功能模块：盘子里可以放一个泛型的“东西”
 */
public class Plate<T> {
    private T item;

    public Plate(T t) {
        item = t;
    }

    public void set(T t) {
        item = t;
    }

    public T get() {
        return item;
    }
}
