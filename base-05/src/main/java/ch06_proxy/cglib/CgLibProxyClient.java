package ch06_proxy.cglib;

import ch06_proxy.jdk.ConcreteSubject;
import ch06_proxy.jdk.ISubject;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
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
