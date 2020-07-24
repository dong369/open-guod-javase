package ch06_proxy.dynamicproxy;

import java.lang.reflect.Method;

/**
 * 处理器
 *
 * @author guodd
 * @version 1.0
 */
public interface InvocationHandler {
    void invoke(Object o, Method m);
}
