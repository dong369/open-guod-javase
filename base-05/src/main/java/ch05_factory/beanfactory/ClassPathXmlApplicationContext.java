package ch05_factory.beanfactory;

import ch05_factory.beanfactory.xml.Bean;
import ch05_factory.beanfactory.xml.Beans;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class ClassPathXmlApplicationContext implements BeanFactory {
    // 容器
    private Map<String, Object> container = new HashMap<>();

    public ClassPathXmlApplicationContext(String fileName) {
        XmlMapper xmlMapper = new XmlMapper();
        // 格式化
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        // xml文件头
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        try {
            Beans beans = xmlMapper.readValue(new File(System.getProperty("user.dir") + "/base-05/src/main/java/ch03_factory/beanfactory/" + fileName), Beans.class);
            for (Bean bean : beans.getBeans()) {
                Object o = Class.forName(bean.getClassPath()).newInstance();
                container.put(bean.getId(), o);
            }
        } catch (IOException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String id) {
        return container.get(id);
    }
}
