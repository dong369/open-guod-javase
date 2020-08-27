package ch06_proxy.cglib;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
@Slf4j
public class SubjectInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        preAction();
        Object result = proxy.invokeSuper(obj, args);
        postAction();
        return result;
    }

    private void preAction() {
        log.info("SubjectProxyHandler.preAction()");
    }

    private void postAction() {
        log.info("SubjectProxyHandler.postAction()");
    }
}
