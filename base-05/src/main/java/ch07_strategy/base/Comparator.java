package ch07_strategy.base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:16:46
 * @JDK 1.8
 * @Description 功能模块：大小比较器（策略模式具体案例：商场打折模式或打子弹反射）
 */
public interface Comparator {
    int compare(Object o1, Object o2);
}