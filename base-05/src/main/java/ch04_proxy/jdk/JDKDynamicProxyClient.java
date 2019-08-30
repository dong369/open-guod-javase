package ch04_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/17 时间:17:14
 * @JDK 1.8
 * @Description 功能模块：
 */
public class JDKDynamicProxyClient {
    public static void main(String[] args) {
        InvocationHandler handler = new SubjectProxyHandler(ConcreteSubject.class);
        ISubject proxy = (ISubject) Proxy.newProxyInstance(
                JDKDynamicProxyClient.class.getClassLoader(),
                new Class[]{ISubject.class},
                handler
        );
        proxy.action();
    }
}
