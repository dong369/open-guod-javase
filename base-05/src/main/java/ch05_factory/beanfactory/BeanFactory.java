package ch05_factory.beanfactory;

/**
 * project - spring的bean工厂
 *
 * @author guodd
 * @version 1.0
 */
public interface BeanFactory {
    Object getBean(String id);
}
