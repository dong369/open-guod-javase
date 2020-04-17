package jdk.jdk8.functioninterface;

/**
 * 函数式接口的实例就是lambda表达式
 * 1、被@FunctionalInterface注释的接口
 * 2、满足@FunctionalInterface注释的约束（1、只有一个抽象方法；2、default、重写Object类的public方法不算）
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public interface FunctionInterface02 {
    String getInfo(String input);

    // 默认方法
    default void def() {
        System.out.println("我是默认方法");
    }
}