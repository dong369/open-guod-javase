package jdk.jdk8.functioninterface;

import java.util.function.Function;

/**
 * project - 函数式接口
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:16:42
 * @JDK 1.8
 * @Description 功能模块：
 */
public class FunInterfaceTestMain01 {
    public static void main(String[] args) {
        Function<String, String> function1 = String::toString;
        System.out.println(function1);
    }
}
