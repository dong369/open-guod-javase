package datastructure.ch06_set.ch01_set_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/21 时间:18:02
 * @JDK 1.8
 * @Description 功能模块：集合结构
 */
public interface Set<E> {
    // 进行元素的添加，不能添加重复数据，特别注意！
    void add(E e);

    // 进行元素的删除
    void remove(E e);

    // 是否包括某个元素
    boolean contains(E e);

    int getSize();

    boolean isEmpty();
}
