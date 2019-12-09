package jdk.jdk8.functioninterface;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018年12月31日 时间:上午11:06:57
 * @JDK 1.8
 * @Description 功能模块：default方法
 */
public interface DefaultOrStaticInterface {
    void user();

    default void test() {
    }
}