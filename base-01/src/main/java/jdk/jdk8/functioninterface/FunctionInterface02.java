package jdk.jdk8.functioninterface;

/**
 * project - 函数式接口
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:17:17
 * @JDK 1.8
 * @Description 功能模块：
 * 1. 接口有且只能有个一个抽象方法，只有方法定义，没有方法体。
 * 2. 在接口中覆写Object类中的public方法，不算是函数式接口的方法。
 */
@FunctionalInterface
public interface FunctionInterface02 {

    String getInfo(String input);

}