package ch02_factory.beanfactory.xml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/11 时间:15:54
 * @JDK 1.8
 * @Description 功能模块：
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bean {
    /**
     * 属性描述：id
     */
    @JacksonXmlProperty(isAttribute = true)
    private String id;
    /**
     * 属性描述：class
     */
    @JacksonXmlProperty(localName = "class",isAttribute = true)
    private String classPath;
}
