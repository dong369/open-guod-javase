package ch04_proxy.cglib;

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
 * @date 日期:2019/8/17 时间:17:21
 * @JDK 1.8
 * @Description 功能模块：
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
