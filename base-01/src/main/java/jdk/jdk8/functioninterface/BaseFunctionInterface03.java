package jdk.jdk8.functioninterface;

/**
 * 函数式接口的实例就是lambda表达式。
 * 1、被@FunctionalInterface注释的接口。
 * 2、满足@FunctionalInterface注释的约束。
 * 约束：①接口有且只能有个一个抽象方法，只有方法定义，没有方法体；②在接口中覆写Object类中的public方法，不算是函数式接口的方法。
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:17:17
 * @since 1.8
 */
@FunctionalInterface
public interface BaseFunctionInterface03 {

    String getInfo(String input);

    @Override
    String toString();

    @Override
    boolean equals(Object obj);

    // 默认方法
    default void def() {
        System.out.println("我是默认方法");
    }
}