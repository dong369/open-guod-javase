package datastructure.ch09_segment.ch01_segment_base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/8 时间:15:02
 * @JDK 1.8
 * @Description 功能模块：
 */
public interface Merger<E> {
    E merge(E a, E b);
}
