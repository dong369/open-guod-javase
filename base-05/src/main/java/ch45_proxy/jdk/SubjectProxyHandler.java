package ch45_proxy.jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/17 时间:17:11
 * @JDK 1.8
 * @Description 功能模块：
 */
public class SubjectProxyHandler implements InvocationHandler {
    private static final Logger LOG = LoggerFactory.getLogger(SubjectProxyHandler.class);

    private Object target;

    public SubjectProxyHandler(Class clazz) {
        try {
            this.target = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            LOG.error("Create proxy for {} failed", clazz.getName());
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preAction();
        Object result = method.invoke(target, args);
        postAction();
        LOG.info("Proxy class name {}", proxy.getClass().getName());
        return result;
    }

    private void preAction() {
        LOG.info("SubjectProxyHandler.preAction()");
    }

    private void postAction() {
        LOG.info("SubjectProxyHandler.postAction()");
    }

}
