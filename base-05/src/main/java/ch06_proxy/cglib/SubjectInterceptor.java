package ch06_proxy.cglib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class SubjectInterceptor implements MethodInterceptor {
    private static final Logger LOG = LoggerFactory.getLogger(SubjectInterceptor.class);

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        preAction();
        Object result = proxy.invokeSuper(obj, args);
        postAction();
        return result;
    }

    private void preAction() {
        LOG.info("SubjectProxyHandler.preAction()");
    }

    private void postAction() {
        LOG.info("SubjectProxyHandler.postAction()");
    }
}
