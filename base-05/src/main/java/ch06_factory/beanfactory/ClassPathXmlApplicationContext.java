package ch06_factory.beanfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/3 时间:11:40
 * @JDK 1.8
 * @Description 功能模块：
 */
public class ClassPathXmlApplicationContext implements BeanFactory {
    // 容器
    private Map<String, Object> container = new HashMap<>();

    public ClassPathXmlApplicationContext(String fileName) {
        container.put("id", "class");
    }

    @Override
    public Object getBean(String id) {
        return container.get(id);
    }
}
