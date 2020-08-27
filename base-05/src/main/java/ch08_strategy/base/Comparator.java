package ch08_strategy.base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * 大小比较器（策略模式具体案例：商场打折模式或打子弹反射）
 */
public interface Comparator {
    int compare(Object o1, Object o2);
}