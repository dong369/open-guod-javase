package jdk.jdk8.functioninterface;

/**
 * 函数式接口，函数式接口的实例就是lambda表达式。
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:17:17
 * @since 1.8
 * 1、被@FunctionalInterface注释的接口。
 * 2、满足@FunctionalInterface注释的约束。
 * （接口有且只能有个一个抽象方法，只有方法定义，没有方法体；在接口中覆写Object类中的public方法，不算是函数式接口的方法。）
 */
public interface BaseFunctionInterface02 {
    String getInfo(String input);
}