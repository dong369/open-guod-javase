package ch06_proxy.dynamicproxy;

import java.lang.reflect.Method;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/4 时间:9:40
 * @JDK 1.8
 * @Description 功能模块：处理器
 */
public interface InvocationHandler {
    void invoke(Object o, Method m);
}
