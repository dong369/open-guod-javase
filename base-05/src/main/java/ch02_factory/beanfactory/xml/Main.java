package ch02_factory.beanfactory.xml;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/11 时间:16:14
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // xml对象
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        // 测试使用
        Beans beans = new Beans();
        List<Bean> b = new ArrayList<>();
        Bean bean = new Bean();
        bean.setId("1");
        bean.setClassPath("/usr");
        b.add(bean);
        beans.setSize(b.size());
        beans.setBeans(b);
        String s = xmlMapper.writeValueAsString(beans);
        System.out.println(s);
        Beans beanObject = xmlMapper.readValue(new File(System.getProperty("user.dir") + "/base-05/src/main/java/ch03_factory/beanfactory/applicationContext.xml"), Beans.class);
        for (int i = 0; i < beanObject.getBeans().size(); i++) {
            System.out.println(beanObject.getBeans().get(i).getClassPath());
        }
    }
}
