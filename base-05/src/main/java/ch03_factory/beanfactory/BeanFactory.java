package ch03_factory.beanfactory;

/**
 * project - spring的bean工厂
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/3 时间:10:52
 * @JDK 1.8
 * @Description 功能模块：
 */
public interface BeanFactory {
    Object getBean(String id);
}
