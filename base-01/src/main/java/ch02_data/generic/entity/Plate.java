package ch02_data.generic.entity;

/**
 * 盘子里可以放一个泛型的东西
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
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
