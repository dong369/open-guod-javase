package ch45_proxy.cglib;

import ch45_proxy.jdk.ConcreteSubject;
import ch45_proxy.jdk.ISubject;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/17 时间:17:59
 * @since 1.8
 */
public class CgLibProxyClient {
    public static void main(String[] args) {
        MethodInterceptor methodInterceptor = new SubjectInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ConcreteSubject.class);
        enhancer.setCallback(methodInterceptor);
        ISubject subject = (ISubject) enhancer.create();
        subject.action();
    }
}
