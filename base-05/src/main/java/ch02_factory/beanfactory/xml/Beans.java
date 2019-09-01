package ch02_factory.beanfactory.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/11 时间:15:53
 * @JDK 1.8
 * @Description 功能模块：
 */
@XmlRootElement
@JacksonXmlRootElement(localName = "beans")
@Data
public class Beans {
    /**
     * 功能描述：size
     */
    @JacksonXmlProperty(isAttribute = true)
    private Integer size;
    @JacksonXmlProperty(localName = "bean")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Bean> beans = new ArrayList<>();
}
